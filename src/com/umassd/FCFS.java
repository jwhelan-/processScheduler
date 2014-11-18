package com.umassd;

import java.io.*;
import java.util.*;

public class FCFS extends Scheduler{

	public FCFS (ProcessList processes) {

	int i=0;
	int io=0;

	while(i<10)
	{
		processes[i].CPU_burst--;	//one cycle of the current process is "Executed"
		if(processes[i].CPU_burst==0)//if the process has nothing more to execute the next process is moved to the processing queue
		{
			i++;			//increments i to load the next process
		}
		if(processes[io].IOBURST == 0 && processes[io].IOBURST > 0) //once the process is done in the CPU it is moved to IO
		{
			processes[io].IOBURST--;		//one cycle of IO is executed
			if(processes[io].IOBURST == 0) 	//if the process has nothing left to do in IO:
				io++;				//move on to the next one
		}
	}


	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "FCFS";
	}

	@Override
	public String Simulate() {
		// TODO Auto-generated method stub
		return null;
	}
}
