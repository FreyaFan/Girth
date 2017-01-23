package com.freya;

import java.util.Scanner;

public class TestCase {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please input the number of nodes");
		int n=input.nextInt();
		CreateGraph cg = new CreateGraph();
		int[][] gra = cg.CompleteGraph(n);
		int[][] sgr = cg.SparseGraph(n);
		
		FindGirth iso = new FindGirth();
		
		long starttime=System.currentTimeMillis();
		iso.findgirth(sgr);
		long endtime=System.currentTimeMillis();
		long result1=endtime-starttime;
		System.out.println("Time cost for finding Girth in Sparse Graph is "+result1);
		
		
		starttime=System.currentTimeMillis();
		iso.findgirth(gra);
		endtime=System.currentTimeMillis();
		long result2=endtime-starttime;
		System.out.println("Time cost for finding Girth in Complete Graph is "+result2);
		
		
		
		
		
		
	}
}
