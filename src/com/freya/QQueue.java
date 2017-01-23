package com.freya;

public interface QQueue<T> {
	boolean isEmpty();
	void enqueue(T x);
	T dequeue();
}
