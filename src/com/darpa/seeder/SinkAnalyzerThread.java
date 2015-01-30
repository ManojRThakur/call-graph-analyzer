package com.darpa.seeder;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SinkAnalyzerThread extends Thread {
	
	private String sink;
	private String db;
	
	public SinkAnalyzerThread(String name, String sink, String db) {
		super();
		this.sink = sink;
		this.db = db;
		setName(name);
	}

	@Override
	public void run() {
		try {
			Utils.log("Starting thread " + getName() + " db:" + db + " sink:" + sink);
			String result = LogicBloxQuerier.findAllCallersForCallee(db, sink);
			Set<String> set = ResultProcessor.retrieveCallingFunction(result);
			
			HashSet<String> methodsDiscoveredTillNow = new HashSet<String>();
			HashSet<String> next = new HashSet<String>();
			
			next.addAll(set);
			methodsDiscoveredTillNow.addAll(set);
			HashSet<String> temp_next = new HashSet<String>();
			
			while(!next.isEmpty()) {
				Utils.printNext(next);
				String res = LogicBloxQuerier.findAllCallersForCallee(db, next);
				Set<String> res_set = ResultProcessor.retrieveCallingFunction(res);
				
				Utils.log("Found " + res_set.size() + " callees");
				for(String str: res_set) {
					if(!Main.sources.contains(str)) {
						temp_next.add(str);
						methodsDiscoveredTillNow.add(str);
					}
				}
				if(Utils.areSetsEqual(temp_next, next))
					break;
				next.clear();
				next = new HashSet<String>(temp_next);
				temp_next.clear();
			}
			Utils.writeIdentifiedClasses(methodsDiscoveredTillNow);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

