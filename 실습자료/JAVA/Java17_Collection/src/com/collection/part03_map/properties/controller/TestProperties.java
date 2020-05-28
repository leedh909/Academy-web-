package com.collection.part03_map.properties.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	//키값 value값 모두 문자열만 들어간다.
	
	public void testProp() {
		
		//설정 파일의 값을 읽어서 적용할 때 사용한다.
		//Jdbc에서 사용하게 된다.
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver"); 
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("user", "KH");
		prop.setProperty("password", "KH");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.properties"), "jdbc driver");    //(매개변수) ->( 기반스트림, 메모 )
			
			prop.store(new FileWriter("driver.txt"), "JDBC DRIVER");
			
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc DRIVER");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
	public void testProp2() {
		
		//파일에서 읽어와 Properties에 저장
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileInputStream("driver.properties"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
//			prop.load(new FileInputStream("driver.txt"));
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
//			System.out.println(prop.getProperty("passw")); //일부로 오타를 내보았다. 그럼 결과값은 null값이 출력된다.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
