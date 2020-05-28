package com.poly.test.test01;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
		
	}

	
	public void eat(String animal) {
		//오버라이딩 안되어있어도 동적 바인딩 할 수 있다.
			super.eat(animal);
			System.out.println("dog eat");
	}

	
}
