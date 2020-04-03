package com.silsub1.model;

import java.util.Scanner;

public class Sample {

	public void munjae1() {
		//내코딩
		int[][] arr = new int[4][4];
		int rsum=0;
		int csum=0;
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr[i].length-1;j++) {
				
				arr[i][j]=(int)(Math.random()*100+1);
			}
			
			rsum=0;
			for(int j=0; j<arr[i].length;j++) {
				if(j==arr[i].length-1) {
					arr[i][j]=rsum;
				}else {
					rsum+=arr[i][j];
				}
			}		
		}
		
		for(int i=0;i<arr.length;i++) {	
			csum=0;
			for(int j=0; j<arr[i].length;j++) {
				if(j==arr[i].length-1) {
					arr[j][i]=csum;
				}else {
					csum+=arr[j][i];
				}
				if(i==arr.length-1 && j==arr[i].length-1) {
					arr[j][i]=csum*2;
				}
				
				System.out.print("\t"+ arr[i][j]);
				
			}
			System.out.println();
			
		}		
		
	}
	
	public void munjae1_1() {
		//강사님 코딩
		int[][] iarr = new int[4][4];
		int sum=0;
		
		//1.값 기록		
		for(int i=0;i<iarr.length-1;i++) {
			for(int j=0;j<iarr[i].length-1;j++) {
				
				iarr[i][j]=(int)(Math.random()*100+1);	
			}

		}
		
		//계산
		for(int i=0;i<iarr.length-1;i++) {
			for(int j=0; j<iarr[i].length-1;j++) {
				iarr[i][3] += iarr[i][j];
				iarr[3][i] += iarr[j][i];
				
			}
			iarr[3][3]+=iarr[i][3]+iarr[3][i];
		}
		
		//출력 확인
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public void munjae2() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("열의 크기를 입력하시오:");
		int size=sc.nextInt();
		int[][] arr= new int[3][size];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {	
			
			sum=0;
			for(int j=0; j<arr[i].length;j++) {
				
				arr[i][j]=(int)(Math.random()*100+1);
				sum+=arr[i][j];
			}	
			for(int j=0;j<arr[i].length;j++) {
				if(sum%5==0) {
					
					System.out.println("arr["+i+"]["+j+"]:"+arr[i][j]);
					
				}
			}
			if(sum%5==0) {
				System.out.println(i+" 행의 합: "+sum+"이고 5의 배수이다.");
				continue;
			}
			
			
		}
		
		
		
		
	}
	
	
}
