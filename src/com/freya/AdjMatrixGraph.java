package com.freya;


public class AdjMatrixGraph<T> {
	protected SeqList<T> vertxlist;
	protected int[][] adjmatrix;
	
	public AdjMatrixGraph(int size)
	{
		size=size<10 ? 10:size;
		this.vertxlist=new SeqList<T>(size);
		this.adjmatrix=new int[size][size];
		for(int i=0; i<size; i++)
			for(int j=0;j<size;j++)
				this.adjmatrix[i][j]= (i==j) ? 0:1;		
	}
	public int vertexCount(){
		return this.vertxlist.length();
	}
}
