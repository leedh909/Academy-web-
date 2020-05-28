package silsub1.model.vo;

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public Member() {}
//	public Member(String memberId,String memberPwd,String memberName,int age, char gender, String phone, String email) {
//		this.memberId = memberId;
//		this.memberPwd = memberPwd;
//		this.memberName = memberName;
//		this.age = age;
//		this.gender = gender;
//		this.phone = phone;
//		this.email = email;	
//		
//	}
	
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getmemberPwd() {
		return memberPwd;
	}
	public void setmemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getmemberName() {
		return memberName;
	}
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public char getgender() {
		return gender;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
//	public String info() {
//		return memberId+", "+memberPwd+", "+memberName+", "+age+", "+gender+", "+phone+", "+email;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
