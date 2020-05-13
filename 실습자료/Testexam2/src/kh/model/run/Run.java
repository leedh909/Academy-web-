package kh.model.run;
import kh.model.controller.FileWrite;
import kh.model.controller.Q4;
public class Run {
	
	public static void main(String[] args) {
//		FileWrite fw = new FileWrite();
//		fw.fileSave("book.dat");
		
		Q4 fo = new Q4();
		fo.fileOpen();
	}
}
