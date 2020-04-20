package com.test.io.part03_addStream.ch04_objectStream;

public class Member implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String userId;
		private String userPwd;
		private String userName;
		private String email;
		private int age;
		private char gender;
		
		//
		private double point;     //저장값이랑 불러올때 필드값이 다를때는  버전을 맞추어줘서 불러오면 된다.
		
		
		//생성자(기본, 매개변수), getter&setter
		//hashcode() & equals() & toString() 오버라이딩
		
		public Member() {}

		public Member(String userId, String userPwd, String userName, String email, int age, char gender) {
			super();
			this.userId = userId;
			this.userPwd = userPwd;
			this.userName = userName;
			this.email = email;
			this.age = age;
			this.gender = gender;
		}

				
		
		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserPwd() {
			return userPwd;
		}

		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}
		
		
		

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + gender;
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			result = prime * result + ((userName == null) ? 0 : userName.hashCode());
			result = prime * result + ((userPwd == null) ? 0 : userPwd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Member other = (Member) obj;
			if (age != other.age)
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (gender != other.gender)
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			if (userName == null) {
				if (other.userName != null)
					return false;
			} else if (!userName.equals(other.userName))
				return false;
			if (userPwd == null) {
				if (other.userPwd != null)
					return false;
			} else if (!userPwd.equals(other.userPwd))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", email=" + email
					+ ", age=" + age + ", gender=" + gender + "]";
		}
		
	
	
	
	
	
	
	
	
	
}
