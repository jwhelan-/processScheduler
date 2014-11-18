package com.umassd;

import java.io.*;
import java.util.*;

public class ProcessList{
	
	int totalProcesses;
	Process[] finalList = new Process[10];
	
public ProcessList(String file) throws FileNotFoundException
{
	
	File x = new File(file);
	Scanner fileScanner = new Scanner(x);
	
	fileScanner.next(); 
	
	
	int processNum;
	processNum = fileScanner.nextInt();
	totalProcesses = processNum;
	
	
	fileScanner.nextLine();
	fileScanner.next();
	int quantum;
	quantum = fileScanner.nextInt();
	
	fileScanner.nextLine();
	fileScanner.nextLine(); 
	
	Process[] processes = new Process[processNum];
	
	int i;
	for(i = 0; i<processNum; i++)
	{	
		int pid = fileScanner.nextInt();
		int CPU_burst = fileScanner.nextInt();
		int IO_burst = fileScanner.nextInt();
		int priority  = fileScanner.nextInt();
		int period = fileScanner.nextInt();
		
		processes[i] = new Process(pid, CPU_burst, IO_burst, priority, period);
		
	}
	finalList = processes.clone();
	fileScanner.close();
	
}
	
}