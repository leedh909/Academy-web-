package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		ArrayTest03 at03 = new ArrayTest03();
		//at03.shallowCopy();
		//at03.deepCopy();
		//at03.deepCopy2();
		at03.deepCopy3();
		
	}
	
	
	public void shallowCopy() {
		
		//얕은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str ="";		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}		
		System.out.println("1.originArr: "+str);
		
		str="";		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}		
		System.out.println("2.copyArr: "+str);
		
		
		//원본배열 변경
		originArr[0]=99;
		
		str="";		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}		
		System.out.println("1.originArr: "+str);
		
		str="";		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}		
		System.out.println("2.copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr.hashCode());
		System.out.println("copyArr의 hashcode: "+copyArr.hashCode());
		
	}
	
	public void deepCopy() {
		
		//1. 깊은 복사는 동일한 새로운 배열을 하나 생성하고 값을 복사.
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		//for문을 이요하여 1:1 복사
		for(int i=0;i<originArr.length;i++) {
			
			copyArr[i]=originArr[i];			
		}
		String str ="";		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}		
		System.out.println("1.originArr: "+str);
		
		str="";		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}		
		System.out.println("2.copyArr: "+str);
		
		
		//원본배열의 0번 인덱스의 값을 99로 변경
		originArr[0]=99;
		
		str="";		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}		
		System.out.println("1.originArr: "+str);
		
		str="";		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}		
		System.out.println("2.copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr.hashCode());
		System.out.println("copyArr의 hashcode: "+copyArr.hashCode());
		
	}
	
	public void deepCopy2() {
		
		//2.arraycopy()를 이용한 복사
		//java.lang.System 안에 있는 메소드이다.
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src : 원본배열, srcPos : 복사 시작위치
		//dest : 카피배열, destPos : 붙여넣기 시작위치
		//length : 복사될 길이
		System.arraycopy(originArr, 0, copyArr, 1, originArr.length);
		
		String str ="";		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}		
		System.out.println("1.originArr: "+str);
		
		str="";		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}		
		System.out.println("2.copyArr: "+str);
		
		
		
		
	}
	
	public void deepCopy3() {
		
		//3.clone()을 이용한 복사
		int[] originArr= {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("준비된 복사본 배열의 주소: "+copyArr.hashCode());
		copyArr = originArr.clone();
		//복제품을 만들어서 넣어주는것이다. 기존에 가지고 있던 배열은 버려진다.
		
		System.out.println("준비된 복사본 배열의 주소: "+copyArr.hashCode());
		
		
	}
	
	
	
	
}
