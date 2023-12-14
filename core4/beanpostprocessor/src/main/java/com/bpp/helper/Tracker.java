package com.bpp.helper;

import java.util.concurrent.atomic.AtomicInteger;

public class Tracker {
	public static AtomicInteger count = new AtomicInteger(0);

	public static int getCount() {
		return count.get();
	}

	public static void increment() {
		count.incrementAndGet();
	}
	
}
