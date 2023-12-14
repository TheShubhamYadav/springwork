package com.pci.beans;

public class CPU {
	String processor;
	int ram;
	int storage;
	String graphics;
	
	public CPU(String processor, int ram, int storage, String graphics) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.graphics = graphics;
	}

	@Override
	public String toString() {
		return "CPU [processor=" + processor + ", ram=" + ram + ", storage=" + storage + ", graphics=" + graphics + "]";
	}
	

}
