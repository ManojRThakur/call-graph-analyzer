package com.darpa.seeder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static Set<String> sources = new HashSet<String>();
	public static Set<String> sinks = new HashSet<String>();
	
	static {
		//sources.add("<java.io.BufferedReader: java.lang.String readLine()>");
		//set.add("<java.io.BufferedReader: int read()>");
		sinks.add("<java.io.BufferedWriter: void write(java.lang.String,int,int)>");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String db = args[0];
		
		int threadCount = 1;
		List<Thread> source_threads = new ArrayList<Thread>();
		
		for(String source : sources) {
			Thread t = new SourceAnalyzerThread("SourceSeeder-"+threadCount++, source, db);
			t.start();
			source_threads.add(t);
		}
		
		List<Thread> sink_threads = new ArrayList<Thread>();
		threadCount = 1;
		for(String sink : sinks) {
			Thread t = new SinkAnalyzerThread("SinkSeeder-"+threadCount++, sink, db);
			t.start();
			sink_threads.add(t);
		}
		
		for(Thread t : source_threads)
			t.join();
		
		for(Thread t : sink_threads)
			t.join();
	}
}	
