package test;

import java.util.StringTokenizer;

public class test01 {

	public static void main(String[] args) {
		 
		String str = "안녕하세요";
		
		Object[] sarr = new String[3];
		
		sarr[0]= new String("123");
		sarr[1]= String.valueOf(new Integer(456));
		sarr[2]= (String)new Object(); //다른 타입의 객체를 String타입으로 바꾸려고 해서 오류가 나는 것이다.
		//sarr[3]=String.valueOf(789);
		
		for(Object obj:sarr) {
			System.out.println(obj);
		}
		
		
		
//		String colors = "red/yellow#green blue,orange";
//		char[] carr = {'a','b','c'};
//		char[] carr2 = colors.toCharArray();
//		String[] a;		
//		a=colors.split("[/#,]");
//		a=colors.split("/|#|,");    //위와 같은 의미이다.
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		
//		
//		
//		System.out.println(colors.valueOf(carr[1]));
//		System.out.println(carr2[2]);
//		System.out.println(colors.substring(1,4));
//		StringTokenizer st = new StringTokenizer(colors,"/#,");
//		
//		while(st.hasMoreElements()) {
//			System.out.println(st.nextToken());
//		}
			
		
	}

}
