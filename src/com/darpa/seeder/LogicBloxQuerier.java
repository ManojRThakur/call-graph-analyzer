package com.darpa.seeder;

import java.io.IOException;
import java.util.Set;

public class LogicBloxQuerier {
	
	public static String executeQuery(String db, String query) throws IOException, InterruptedException {
		String result = CommandExecutor.executeCommand(new String[]{System.getenv("LOGICBLOX_HOME")+"/bin/bloxbatch", "-db", db, "-query", query});
		return result;
	}
	
	public static String findAllCallersForCallee(String db, String callee) throws IOException, InterruptedException {
		String query = "_(p1, p2, p3, p4) <- CallGraphEdge(p1, p2, p3, p4), MethodSignatureRef:Value(p4:\""+callee+"\").";
		String result = CommandExecutor.executeCommand(new String[]{System.getenv("LOGICBLOX_HOME")+"/bin/bloxbatch", "-db", db, "-query", query});
		return result;
	}
	
	public static String findAllCallersForCallee(String db, Set<String> callees) throws IOException, InterruptedException {
		StringBuffer buf = new StringBuffer();
		
		for(String callee: callees) {
			String query = "_(p1, p2, p3, p4) <- CallGraphEdge(p1, p2, p3, p4), MethodSignatureRef:Value(p4:\""+callee+"\").  ";
			buf.append(query);
		}
		
		String result = CommandExecutor.executeCommand(new String[]{System.getenv("LOGICBLOX_HOME")+"/bin/bloxbatch", "-db", db, "-query", buf.toString()});
		return result;
	}
	
	public static String findAllCalleeForCaller(String db, String caller) throws IOException, InterruptedException {
		String query = "_(p1, p2, p3, p4) <- CallGraphEdge(p1, p2, p3, p4), InstructionRef:Value(p2:x), string:like(x, \""+caller+"/%\").";
		String result = CommandExecutor.executeCommand(new String[]{System.getenv("LOGICBLOX_HOME")+"/bin/bloxbatch", "-db", db, "-query", query});
		return result;
	}
	
	public static String findAllCalleeForCaller(String db, Set<String> callers) throws IOException, InterruptedException {
		StringBuffer buf = new StringBuffer();
		
		for(String caller: callers) {
			String query = "_(p1, p2, p3, p4) <- CallGraphEdge(p1, p2, p3, p4), InstructionRef:Value(p2:x), string:like(x, \""+caller+"/%\").  ";
			buf.append(query);
		}
		String result = CommandExecutor.executeCommand(new String[]{System.getenv("LOGICBLOX_HOME")+"/bin/bloxbatch", "-db", db, "-query", buf.toString()});
		return result;
	}
}
