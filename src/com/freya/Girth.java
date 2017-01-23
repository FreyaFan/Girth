/*package com.freya;

import java.lang.annotation.Target;

public class Girth {
	public interface GGraph<T>
	{
		public static final int MAX_WEIGHT=9999999;
		int VertexCount();
		T get(int i);
		int getWeight(int i, int j);
		int insertVertx(T x);
		int getNextNeighor(int i,int j);
		void BFSTravers(int i);
	}
	public abstract class AbstractGraph<T> implements GGraph<T>
	{
		public abstract int vertexCount();
		public abstract T get(int i);
		public abstract int getNextNeighbor(int i, int j);
		
		public void BFSTravers(int i)
		{
			boolean[] visited = new boolean[this.vertexCount()];
			int j=i;
			do {
				if(!visited[j])
				{
					System.out.println("{");
					breadthfs(j,visited);
					System.out.println("}");
				}
				j=(j+1)% this.vertexCount();
			} while (j!=i);
			System.out.println();
		}
		private void breadthfs(int i, boolean[] visited) {
			System.out.print(this.get(i)+"");
			visited[i]=true;
			SeqQueue<Integer> que = new SeqQueue<Integer>(this.vertexCount());
			que.enqueue(new Integer(i));
			while(!que.isEmpty())
			{
				i=que.dequeue().intValue();
				int j=this.getNextNeighbor(i, -1);
				while(j!=-1)
				{
					if(!visited[j])
					{
						System.out.print(this.get(j)+"");
						visited[j]=true;
						que.enqueue(new Integer(j));
					}
					j=this.getNextNeighbor(i, j);
				}
			}
			
		}
	}
	
	public void findGirth(){
		
	}
}
*/