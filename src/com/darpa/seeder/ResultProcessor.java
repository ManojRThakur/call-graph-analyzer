package com.darpa.seeder;

import java.util.HashSet;
import java.util.Set;

public class ResultProcessor {
	
	public static Set<String> retrieveCallingFunction(String res) {
		Set<String> ret = new HashSet<String>();
		
		String[] arr = res.split("\n");
		
		for(String s : arr) {
			if(s != null && s.length() > 0 && s.trim().startsWith("*")) {
				String fun = s.split(", ")[1].trim().split("/")[0];
				ret.add(fun);
			}
		}
		return ret;
	}
	
	public static Set<String> retrieveCalleFunction(String res) {
		Set<String> ret = new HashSet<String>();
		
		String[] arr = res.split("\n");
		
		for(String s : arr) {
			if(s != null && s.length() > 0 && s.trim().startsWith("*")) {
				String fun = s.split(", ")[3].trim();
				ret.add(fun);
			}
		}
		return ret;
	}
}
