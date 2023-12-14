package core.ai.beans;

public class Rocket {
	String name;
	int capacity;
	public void Propel() {
		System.out.println(name+" is ready to fly having load capacity "+capacity);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
