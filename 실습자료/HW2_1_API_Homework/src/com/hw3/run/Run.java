package com.hw3.run;

import com.hw3.controller.SetDate;

public class Run {
	public static void main(String[] args) {
		SetDate tw = new SetDate();
		System.out.println(tw.todayPrint());
		System.out.println(tw.setDay());
	}
}
