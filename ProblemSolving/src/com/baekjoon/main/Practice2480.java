package com.baekjoon.main;

import java.util.Scanner;

public class Practice2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		
		
		
		if(su1==su2 && su2==su3 && su1==su3) {
			//3개가 같은 수가 나왔을 경우
			System.out.println(10000+(su1*1000));
		
		}else if(su1!=su2 && su2!=su3 && su1!=su3) {
			//3개가 다 다른 수가 나왔을 경우 
			int max = su1;
			if(su1<su2) max = su2;
			if(max<su3) max = su3;
			
			System.out.println(max*100);
		
		}else {
//			System.out.println(1000+(max*100));
			
			if(su1==su2 || su1==su3) {
				//1과2가 같거나, 1과 3이 같은 경우
				System.out.println(1000+(su1*100));
				
			}else {
				//2와3이 같은 경우
				System.out.println(1000+(su2*100));
			}
		}
	}

}
