package com.freya;

import javax.print.attribute.standard.PrinterLocation;

public class FindGirth {
	public void findgirth(int[][] iso){
		
		int i=0,j=0,k=0,k0=0;
		int len =iso.length;
		int visited[] = new int[len];  //1 is visited, 0 is not visited
		int father[] = new int[len];   //store correspondent father vertex
		int depth[] = new int[len];    
		int girth=0;
		int minGirth=99999;
		int P[][] = new int[len][len];
		
		for(k=0;k<len;k++){
			
		SeqQueue<Integer> que = new SeqQueue<Integer>();	
		que.enqueue(new Integer(k));	
			for(k0=0;k0<len;k0++){
				visited[k0]=0;
				father[k0]=0;
				depth[k0]=0;			
			}
		girth=0;
		visited[k]=1;
		P = iso;  //input number
		do{			
			i = que.dequeue().intValue();

			for(j=0; j<len; j++){
			
				if(P[i][j]==1 && visited[j]==0){          //add next adjacent v into que
					que.enqueue(new Integer(j));
					depth[j]=depth[i]+1;
					visited[j]=1;
					father[j]=i;}
				else if(P[i][j] ==1 && visited[j]==1 && father[i]!=j){
						girth=depth[j]+depth[i]+1;
						//System.out.println(girth);
					break;
					}
				
			}	
		}while(girth==0 && que.getFront()<que.getRear());
		
		//compare
		
		if ((girth!=0) && (girth<minGirth)){
			minGirth=girth;
		}
		/*if (girth==0){
			System.out.println(-1);
		}*/
		}
		System.out.println("The girth is"+minGirth);
	}
}
