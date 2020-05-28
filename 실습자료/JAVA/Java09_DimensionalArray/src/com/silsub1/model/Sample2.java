package com.silsub1.model;

public class Sample2 {
	
	public void sample1() {
		
		int[][] arr=new int[5][5];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=++count;
				}
			}else {
				for(int j=arr[i].length-1;j>=0;j--) {
					arr[i][j]=++count;
				}
			}
			
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public void sample2() {
		
		int[][] arr=new int[5][5];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				arr[j][i]=++count;
				
			}
			
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	
}
