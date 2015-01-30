package com.darpa.seeder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandExecutor {
	public static String executeCommand(String[] cmd) throws IOException, InterruptedException {
		Process proc = Runtime.getRuntime().exec(cmd);

		StringBuffer buf = new StringBuffer();
		StringBuffer buf_err = new StringBuffer();
		BufferedReader stdInput = null;
		BufferedReader stdErr = null;
		try {
			stdInput = new BufferedReader(new InputStreamReader(
					proc.getInputStream()));

			stdErr = new BufferedReader(new InputStreamReader(
					proc.getErrorStream()));

			String s = null;
			while ((s = stdInput.readLine()) != null) {
				buf.append(s).append("\n");
			}
			proc.waitFor();

			return buf.toString();
		} finally {
			stdInput.close();
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println(executeCommand(new String[]{"ls", "/Users/manojthakur/hadoop-2.6.0/share/hadoop/common/lib"}));
	}
}
