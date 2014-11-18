package com.umassd;

import java.io.FileNotFoundException;

//import java.io.*;
//import java.util.*;

public class Simulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		ProcessList processes = new ProcessList("src/com/umassd/processList.dat");
		String path = "src/com/umassd/processList.dat";
		/**for(int i = 0; i < 10; i++)
		{
			System.out.println(" " + processes.finalList[i].pid + " " 
		+ processes.finalList[i].CPU + " " + processes.finalList[i].IO + " " 
					+ processes.finalList[i].prio + " " + processes.finalList[i].per);
			
		}*/
		int sim[] = new int[10];
		int i = 0;
		//sim[i++] = new FCFS(new ProcessList(path));
		new FCFS(processes);

	}

}