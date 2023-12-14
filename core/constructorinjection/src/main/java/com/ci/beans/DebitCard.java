package com.ci.beans;

public class DebitCard {
	private ATMMachine machine;
	public DebitCard(ATMMachine machine) {//constructor
		this.machine=machine;
	}
	public void withDraw(long acNo) {
		machine.withDrawMoney(acNo);
	}

}
