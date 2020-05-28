package mini.com.miniproj.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import mini.com.miniproj.model.AdminUserinfo;
import mini.com.miniproj.model.BuyerList;
import mini.com.miniproj.model.Drugstoreinfo;
import mini.com.miniproj.model.Maskinfo;
import mini.com.miniproj.model.Personinfo;
import mini.com.miniproj.view.MainView;

public class MainController {

	private ArrayList<Drugstoreinfo> storeList = new ArrayList<>();
	private ArrayList<Personinfo> personList = new ArrayList<>();
	private ArrayList<AdminUserinfo> adminList = new ArrayList<>();
	private ArrayList<BuyerList> buyerList = new ArrayList<BuyerList>();
	
	private MainView mv;
	
	Scanner sc = new Scanner(System.in);
	private int count=0;
	private int select=0;
	
	public MainController() {
		adminList.add(new AdminUserinfo("admin", "123"));
	}
	
	//약국 목록 추가(수동)
	public ArrayList storeview() {
		
		
		if(count==0) {
			ArrayList<Maskinfo> maskList = new ArrayList<>();
			maskList.add(new Maskinfo("KF94",100));
			maskList.add(new Maskinfo("KF80",80));
			maskList.add(new Maskinfo("일반마스크",40));
			storeList.add(new Drugstoreinfo("하나약국","서울시 서초구 양재1동","02-1234-1211",maskList));
			maskList = new ArrayList<Maskinfo>();
			maskList.add(new Maskinfo("KF94",70));
			maskList.add(new Maskinfo("KF80",100));
			maskList.add(new Maskinfo("일반마스크",30));
			storeList.add(new Drugstoreinfo("둘약국","서울시 서초구 양재2동","02-1234-1222",maskList));
			count++;
		}

		
		return storeList;
		
	}
	
	//getter & setter
	public ArrayList<Drugstoreinfo> getStoreList() {
		return storeList;
	}
	public void setStoreList(ArrayList<Drugstoreinfo> storeList) {
		this.storeList = storeList;
	}
	
	
	//유저 데이터와 날짜 비교 메소드
	private int usercount=0;
	public int usercheck(String name, String num) {
		
		int check = 1;
		int today = new Date().getDay();
//		System.out.println("오늘 요일은 " + today);
		personList.add(new Personinfo(name, num));
		try {
			BufferedReader br = new BufferedReader(new FileReader("logs/data.txt"));
			String string;
			while ((string = br.readLine()) != null) {
				String[] strArr = string.split(", ");
				int day = 0;
//				System.out.println(strArr[0] + ", " + strArr[1]);
				if (strArr[0].equals(personList.get(usercount).getUserName())
						&& strArr[1].equals(personList.get(usercount).getUserNumber())) {
					check = 0;
					usercount++;
					return check;
				} 
				else {
					switch (Integer.parseInt((personList.get(usercount).getUserNumber().substring(1, 2)))) {
						case 1:
						case 6:
							day = 1;
							break;
						case 2:
						case 7:
							day = 2;
							break;
						case 3:
						case 8:
							day = 3;
							break;
						case 4:
						case 9:
							day = 4;
							break;
						case 5:
						case 0:
							day = 5;
					
					}
					if (day == today) {
						check = 1;
//						System.out.println("유저의 생년월일:" + personList.get(usercount).getUserNumber().substring(1, 2));
					}
					else if (today == 6 || today == 7) {
						check = 1;
//						System.out.println("유저의 생년월일:" + personList.get(usercount).getUserNumber().substring(1, 2));
					}
					else {
						check = 2;
//						System.out.println("유저의 생년월일:" + personList.get(usercount).getUserNumber().substring(1, 2));
//						System.out.println("오늘은 구매 불가능합니다.");
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		usercount++;
		return check;
	}
	
	
	//마스크 수량 체크 메소드
	public void maskinfo(int indexnum, int num1, int num2, int num3) {
		select = indexnum;
		((Maskinfo)storeList.get(select).getMaskinfo().get(0)).setMaskNum(((Maskinfo)storeList.get(select).getMaskinfo().get(0)).getMaskNum()-num1);
		((Maskinfo)storeList.get(select).getMaskinfo().get(1)).setMaskNum(((Maskinfo)storeList.get(select).getMaskinfo().get(1)).getMaskNum()-num2);
		((Maskinfo)storeList.get(select).getMaskinfo().get(2)).setMaskNum(((Maskinfo)storeList.get(select).getMaskinfo().get(2)).getMaskNum()-num3);
	
	}
	
	//유저정보 저장하는 메소드
	public void dataSave(String name, String password, String store, String num1, String num2, String num3) {
		String changeLine = System.getProperty("line.separator");
		String log = name + ", " + password + ", " + store + ", " + num1 + ", " + num2 + ", " + num3 + changeLine;
		File file = new File("logs/data.txt");
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.write(log);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void storeDataSave(String name, String address, String phone, int kf94, int kf80, int common) {
		String changeLine = System.getProperty("line.separator");
		String storeData = name + ", " + address + ", " + phone + ", " + kf94 + ", " + kf80 + ", " + common
				+ changeLine;
		File file = new File("logs/storeData.txt");
		FileWriter writer = null;

		try {
			writer = new FileWriter(file, true);
			writer.write(storeData);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	//로그인페이지 ID,PW 확인 메소드
	public boolean adminCheck(String ID, String password) {
		
		boolean check=false;
		
		for(int i=0; i<adminList.size();i++) {
			if(ID.equals(adminList.get(i).getUserID()) && password.equals(adminList.get(i).getUserPassword())) {
//				System.out.println("로그인 되었습니다.");
				check=true;
				return check;
			}			
		}
		
		
		return check;
	}

	//구매자 정보파일 읽어오는 메소드
	public ArrayList viewPerson() {

		buyerList = new ArrayList<BuyerList>();
	      try {
	         BufferedReader in = new BufferedReader(new FileReader("logs/data.txt"));
	         String string;
	         try {
	            while ((string = in.readLine()) != null) {
	               String[] strArr = string.split(", ");
	               viewPersonData(strArr);
	            }
	         } 
	         catch (IOException e) {
	            e.printStackTrace();
	         }  
	      } 
	      catch (FileNotFoundException e) {
	         e.printStackTrace();
	      }

	      return buyerList;
	}
	
    //buyerList에 값 넣는 메소드
    public void viewPersonData(String[] strArr) {
      BuyerList b = new BuyerList();
      b.setPname(strArr[0]);
      b.setPnum(strArr[1]);
      b.setStorename(strArr[2]);
      buyerList.add(b);
   }
   
    //getter&setter
    public ArrayList<BuyerList> getbuyerList() {
      return buyerList;
   }   
    public void setbuyerList(ArrayList<BuyerList> buyerList) {
      this.buyerList = buyerList;
   }
	
}






















