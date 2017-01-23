package com.freya;

import java.util.Random;

public class CreateGraph {

		public int[][] DrawGraph(int n){
			int i,j;
			int sum1,sum2;
			int p=0,q=0;
			int [][]a= new int[n][n];
			Random random=new Random();
			do{
				for(i=0;i<n;i++){
					for(sum1=0,j=i+1;j<n;j++){
						a[i][j]=Math.abs(random.nextInt(6000));
						sum1=sum1+a[i][j];
						if(a[i][j]==0)
							p++;
						a[j][i]=a[i][j];
					}					
					if(sum1==0){
						sum2=0;
						for(q=i;q>=0;q--){
							sum2=sum2+a[q][i];
						}
						if(sum2==0)
							p=n-1;
					}
				}
			}
			while(p>=n-1);
			return a;
		}
		
		
		public int[][] CompleteGraph(int n){
			int i,j,k;
			int len=n*(n-1)/2;
			int A[] = new int[len];
			int [][]a= new int[n][n];
			Random random=new Random();
			
			for(i=0;i<n*(n-1)/2;i++){
				do{
				k=random.nextInt(len);
				}
				while(A[k]!=0);
				A[k]=1;
			}
			for(i=0;i<n;i++){
				for(j=0;j<i;j++){
					a[i][j]=A[(i*(i-1)/2+j)];
				}
			}
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if (i==j){
						a[i][j]=0;
					}
					else if(i!=j){
						a[i][j] = a[j][i]; 
					}
					//System.out.print(a[i][j]+"\t");
				}
				//System.out.println();
				}
			return a;
		}
		
		public int[][] SparseGraph(int n){
			int i,j,k;
			int sum1,sum2;
			int p=0,q=0,f=0;
			int len=n*(n-1)/2;
			int A[] = new int[len];
			int [][]a= new int[n][n];
			Random random=new Random();	
			for(i=1;i<n;i++){
				do{
				k=random.nextInt(len);
				}
				while(A[k]!=0);
				A[k]=1;
			}
			for(i=0;i<n;i++){
				for(j=0;j<i;j++){
					a[i][j]=A[(i*(i-1)/2+j)];
				}
			}
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if (i==j){
						a[i][j]=0;
					}
					else if(i!=j){
						a[i][j] = a[j][i]; 
					}
					//System.out.print(a[i][j]+"\t");
			}
			//System.out.println();
				}
			return a;
			
					
		}
		
	}


