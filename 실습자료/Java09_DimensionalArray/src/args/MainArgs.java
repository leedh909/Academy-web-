package args;

public class MainArgs {

	public static void main(String[] test) {
	
		System.out.println("전달값 갯수: "+test.length);
		
		for(int i=0;i<test.length;i++) {
			
			System.out.println(i+"번째 값: "+test[i]);
			
		}
		

	}

}
