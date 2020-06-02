package product.view;

import java.util.List;
import java.util.Scanner;

import product.controller.ProductController;
import product.model.vo.Product;

public class ProductView {

	Scanner sc = new Scanner(System.in);
	
	
	public int getMenu() {
		
		System.out.println("=====메뉴====");
		System.out.println("1.전체출력");
		System.out.println("2.선택출력");
		System.out.println("3.추가");
		System.out.println("4.수정");
		System.out.println("5.삭제");
		System.out.println("6.종료");
		System.out.println("============");
		System.out.print("메뉴 선택: ");
		int select = sc.nextInt();
		
		return select;
	}
	
	public ProductView() {
	
		int select = 0;
		ProductController pc = new ProductController();
		
		while(select != 6) {
			
			select = getMenu();
			
			switch(select) {
			case 1://전체출력
				List<Product> res = pc.selectAll();
				for(Product p : res) {
					System.out.println(p);
				}
				break;
			case 2://선택출력
				System.out.print("찾고 싶은 P_ID명 입력: ");
				String pid = sc.next();
				Product one = pc.selectOne(pid);
				System.out.println(one);
				break;
			case 3://추가
				System.out.println("***항목 추가***");
				System.out.print("P_ID : ");
				String in_pid = sc.next();
				System.out.print("P_NAME : ");
				String in_pname = sc.next();
				System.out.print("PRICE : ");
				int in_price = sc.nextInt();
				System.out.print("DES : ");
				String in_des = sc.next();
				Product in = new Product(in_pid, in_pname,in_price,in_des);
				int res1 = pc.insert(in);
				if(res1>0) {
					System.out.println("항목 추가가 성공하였습니다.@@@");
				}else {
					System.out.println("항목 추가가 실패하였습니다.@@@");
				}
				break;
			case 4://수정
				System.out.println("***항목 수정***");
				System.out.print("P_ID : ");
				String up_pid = sc.next();
				System.out.print("P_NAME : ");
				String up_pname = sc.next();
				System.out.print("PRICE : ");
				int up_price = sc.nextInt();
				System.out.print("DES : ");
				String up_des = sc.next();
				Product up = new Product(up_pid, up_pname,up_price,up_des);
				//Product update = new Product(up_pid,up_price); // 생성자를 하나 추가해서 객체를 만드는 것이다.
				int res2 = pc.update(up);
				if(res2>0) {
					System.out.println("항목 수정이 성공하였습니다.!!!");
				}else {
					System.out.println("항목 수정이 실패하였습니다.!!!");
				}
				break;
			case 5://삭제
				System.out.println("***항목 삭제***");
				System.out.print("P_ID : ");
				String del_pid = sc.next();
				int res3 = pc.delete(del_pid);
				if(res3>0) {
					System.out.println("항목 삭제가 성공하였습니다.###");
				}else {
					System.out.println("항목 삭제가 실패하였습니다.###");
				}
				break;
			case 6://종료
				System.out.println("시스템 종료");
			}
			
			
			
		}
		
	
	}
	
	
	
	
	
	
}
