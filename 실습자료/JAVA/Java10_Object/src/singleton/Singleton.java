package singleton;

public class Singleton {

	//싱글톤은 단 하나의 객체만을 생성해서 사용하는 디자인 패턴
	
	
	//[1]
//	private Singleton() {}
	
	//[2]
//	private Singleton() {}
//	public static Singleton getInstance() {
//		return new Singleton();
//	}
	
	//[3]
	private static Singleton one;
	private Singleton() {}
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton();
		}
		return one;
	}
	
	
	
	
	
	
	
	
}
