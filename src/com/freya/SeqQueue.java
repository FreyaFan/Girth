package com.freya;


public class SeqQueue<T> implements QQueue<T> {
	private Object element[];
	public int front, rear;
	public SeqQueue(int length)
	{
		if(length < 64)
			length = 64;
		this.element = new Object[Math.abs(length)];
		this.front=this.rear=0;
	}
	public SeqQueue(){ this(64); }
	public boolean isEmpty() { return this.front==this.rear;}
	public void enqueue(T x)
	{
		if(x==null)
			return;
		if(this.front==(this.rear+1)%this.element.length)
		{
			Object[] temp = this.element;
			this.element = new Object[temp.length*2];
			int i = this.front,j=0;
			while (i!=this.rear)
			{
				this.element[j]=temp[i];
				i=(i+1)%temp.length;
				j++;
			}
			this.front=0;
			this.rear=j;
		}
		this.element[this.rear] = x;
		this.rear = (this.rear+1) % this.element.length;		
	}
	public T dequeue()
	{
		if(isEmpty())
			return null;
		T temp = (T)this.element[this.front];
		this.front = (this.front+1) % this.element.length;
		return temp;
	}
	public int getSize() {
		return this.element.length;
	}
	public int getIndexOf(int i) {
		return (int) this.element[i];
	}
	public int getFront() {
		return (int) this.front;
	}
	public int getRear() {
		return (int) this.rear;
	}
}
