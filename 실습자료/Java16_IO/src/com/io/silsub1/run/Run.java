package com.io.silsub1.run;

import com.io.silsub1.model.dao.FileI0Test;
import com.io.silsub1.model.dao.FileI0Test_1;

public class Run {

	public static void main(String[] args) {

//		File0Test ft = new File0Test();
//		ft.fileRead();
		
		FileI0Test_1 ft = new FileI0Test_1();
		ft.fileSave();
		ft.fileRead();
		
		
		
		
	}

}
