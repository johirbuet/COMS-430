package com.johir;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class UnsafeSequence {
	@GuardedBy(value = "this")
	private int value;
	public synchronized int getNext(){
		return value++;
	}

}
