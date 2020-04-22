package com.collection.part04_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.part02_set.controller.Score;

public class TestGenerics {

	
	public void testGenerics1() {
		
		List list = new ArrayList();
		
		list.add(new String("Object saved"));
		list.add(new Score());
		list.add(new Student());
		list.add(new Car());
		list.add(new Book());
		
		System.out.println("저장된 객체수 : "+list.size());
		System.out.println("list: "+list);
		
		
		for(int i=0;i<list.size();i++) {
			
			Object obj = list.get(i);
			System.out.println(obj.toString());
			
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}else if(obj instanceof Student){
				((Student)obj).score();
			}else if(obj instanceof Car) {
				((Car)obj).printCar();
			}
			
			
			
		}

		
		
	}
	
	public void testGenerics2() {
		
		//제네릭스 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		//컬렉션에 한가지 종류의 객체만 저장되기 때문에
		//꺼내서 사용할 때 객체 레퍼런스 형변환X
		
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
//		list.add("test generics");   //Book객체가 아니므로 오류가 뜬다.
		list.add(new Book());
		list.add(new Book());
		list2.add(new Book());
		list2.add(new Book());
		
		for(Object ob : list2) {  
			((Book)ob).printBook();  //사용할때 꺼내서 형변환 시켜줘야 사용할 수 있다.
			
		}
		for(Book b : list) {	//list 안에 들어있는 Book객체 하나씩 꺼내와서 사용하겠다.
			b.printBook();
		}

	}
	
	public void testGenerics3() {
		
		//Map에 제네릭스 적용
		HashMap<String,Book> map = new HashMap<String,Book>();
		
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		System.out.println(map);
		
	}
	
	public void testGenerics4() {
		
		HashMap<String,Book> map = new HashMap<>();  //생략을 해도 앞의 제네릭스를 따라가겠다는 의미이다.
		
		map.put("one", new Book("Java"));
		map.put("two", new Book("Oracle"));
		map.put("three", new Book("JDBC"));
		
		//enterSet()
		Set<Map.Entry<String,Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, Book>> it = entry.iterator();
		while(it.hasNext()) {
			
			Map.Entry<String, Book> ent = it.next();
			String key = ent.getKey();
			Book val = ent.getValue();
			System.out.println(key+" : "+val);

		}
		
		//set에 key만 추출하여 Iterator로 출력
		//1. key를 set으로
		//2. set을 Iterator로
		//3. 반복문을 통해 Iterator의 key를 가져온 후 value값 확인.
		
		Set<String> keys = map.keySet();
		Iterator<String> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Book b = map.get(key);
			System.out.println(key+": "+b);
			
			
		}
		
		
		
		//내 코딩
//		Set<String> entry2 = map.keySet();
//		Iterator<String> it2 = entry2.iterator();
//		while(it2.hasNext()) {
//			
//			System.out.println(map.get(it2.next()));
//
//		}
		
		
		
		
		
	}
	

	
	
}

//한 클래스 파일 안에 여러개의 클래스 정의 가능
//단, 접근제한자를 포함하고 쓰면 안된다.
class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call");
	}
	
	@Override
	public String toString(){
		return "Student";
	}
	
}
class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call");
	}
	
	@Override
	public String toString() {
		return "Car";
	}
	
}
class Book{
	private String title;
	public Book() {}
	public Book(String title) { this.title = title; }

	public void printBook() {
		System.out.println("printBook() call");
	}
	@Override
	public String toString() {
		return this.title;
	}
	
}