package com.poly.test.test05;

public class TvMain {

	public static void main(String[] args) {

//		lg_tv lg = new lg_tv();
//		lg.volumnUp();
//		lg.volumnUp();
//		lg.volumnDown();
//		lg.volumnDown();
//		lg.volumnDown();
//		lg.tvClosed();
//		
//		System.out.println();
//		Samsung_tv ss = new Samsung_tv();
//		ss.volumnUp();
//		ss.volumnUp();
//		ss.volumnDown();
//		ss.volumnDown();
//		ss.volumnDown();
//		ss.tvClosed();
		
		lg_tv_1 lg1 = new lg_tv_1();
		System.out.println(lg1.volumnUp());
		System.out.println(lg1.volumnUp());
		System.out.println(lg1.volumnDown());
		lg1.tvClosed();
		
		System.out.println();
		
		Samsung_tv_1 ss1 = new Samsung_tv_1();
		System.out.println(ss1.volumnUp());
		System.out.println(ss1.volumnUp());
		System.out.println(ss1.volumnDown());
		ss1.tvClosed();
		
	}

}
