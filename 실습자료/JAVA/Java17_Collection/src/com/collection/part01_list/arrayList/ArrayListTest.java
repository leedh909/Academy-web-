package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public void testArrayList() {
		
		//ArrayList는 객체 생성시 내부적으로 10칸 짜리 배열을 생성.
		ArrayList alist = new ArrayList();
		
		//다형성
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		//저장순서가 유지, index적용
		//객체만 저장가능.
		alist.add("apple");
		alist.add(123);  //autoBoxing(data->object)
		alist.add(45.67);
		alist.add(new Date());
		
		//toString Overriding ==> 원래는 주소값이 나와야하는데 제대로 출력값이 나오고 있기때문에 알수있다.
		//저장순서 유지
		System.out.println("alist: "+alist);
		
		for(int i=0;i<alist.size();i++) {
			//list에서는 길이를 size로 뽑아온다.
			
			System.out.println(i+" : "+alist.get(i)); //배열처럼 []가 아닌 get으로 값을 가져와야한다.
		}
		
		alist.add("apple");
		System.out.println("alist : "+alist);  //중복가능한걸 볼 수 있다.
		
		alist.add(1,"banana"); //원하는 index번호에 데이터값을 삽입할 수 있다. 그리고 자동으로 정렬된다.
		System.out.println("alist: "+alist);
		
		alist.remove(2); //삭제하고 싶은 인덱스번호를 입력하면 삭제가능하다. 그리고 자동으로 정렬된다. 
		System.out.println("alist : "+alist);
		
	}
	
	public void testArrayListSort() {
		
		//ArrayList는 오름차순 정렬 가능한 sort() 메소드
		
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("mango");
		System.out.println("list : "+list);
		
		Collections.sort(list); //오름차순
		System.out.println("listSort: "+list);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
