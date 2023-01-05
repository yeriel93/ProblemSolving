package com.baekjoon.main;

import java.util.Scanner;

public class Practice10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		sc.nextLine();
		String nums = sc.nextLine();
		
		String[] numArr = nums.split(" ");
		
		int max = Integer.parseInt(numArr[0]);
		int min = Integer.parseInt(numArr[0]);
		
		for(String s: numArr) {
			if(max<Integer.parseInt(s)) {
				max=Integer.parseInt(s);
			}
			if(min>Integer.parseInt(s)) {
				min=Integer.parseInt(s);

			}
		}
		System.out.println(min+" "+max);
	}

}
