package com.umassd;

//import java.io.*;
//import java.util.*;

public class Process {

	int pid, CPU, IO, prio, per;
	
	public Process(int PID, int CPUBurst, int IOBurst, int Priority, int Period){
		pid = PID;
		CPU = CPUBurst;
		IO = IOBurst;
		prio = Priority;
		per = Period;
	}
	
	public void setPID(int PID){
		this.pid = PID;
	}
	
	public void setCPU(int CPUBurst){
		this.CPU = CPUBurst;
	}
	
	public void setIO(int IOBurst){
		this.IO = IOBurst;
	}
	
	public void setPrio(int Priority){
		this.prio = Priority;
	}
	
	public void setPeriod(int Period){
		this.per = Period;
	}
	
	public int getPID(){
		return this.pid;
	}
	
	public int getCPU(){
		return this.CPU;
	}
	
	public int getIO(){
		return this.IO;
	}
	
	public int getPriority(){
		return this.prio;
	}
	
	public int getPeriod(){
		return this.per;
	}

}

