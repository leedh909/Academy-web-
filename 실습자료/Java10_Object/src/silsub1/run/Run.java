package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		Member mb = new Member();
		mb.setmemberId("member");
		mb.setmemberPwd("1111");
		mb.setmemberName("하이");
		mb.setage(22);
		mb.setgender('남');
		mb.setphone("01012345678");
		mb.setemail("mmmmmm@naver.com");
		
		
		
		System.out.println("Id: "+mb.getmemberId());
		System.out.println("Pwd: "+mb.getmemberPwd());
		System.out.println("Name: "+mb.getmemberName());
		System.out.println("age: "+mb.getage());
		System.out.println("gender: "+mb.getgender());
		System.out.println("phone: "+mb.getphone());
		System.out.println("email: "+mb.getemail());
		
		
		
	}

}
