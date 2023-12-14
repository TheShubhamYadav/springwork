package com.lmi.beans;


public abstract class Container {
	
	public void receiveRequest(String data) {
		//System.out.println("received request & assigning to worker");
		Worker worker = null;
		worker = lookupWorker();
		worker.setData(data);
		worker.processRequest();
	}
	
	abstract Worker lookupWorker();

}
