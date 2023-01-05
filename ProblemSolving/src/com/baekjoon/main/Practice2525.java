package com.baekjoon.main;

import java.util.Scanner;

public class Practice2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int addMinute = sc.nextInt();
		
		addMinute = (hour*60)+minute+addMinute;
		hour = addMinute/60;

		if(hour>23) {
			hour=hour-24;
		}
		
		minute = addMinute%60;
		
		System.out.println(hour+" "+minute);
	}

}
