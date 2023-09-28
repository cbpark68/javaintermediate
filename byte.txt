package im.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		
		try {
			fis1 = new FileInputStream("src/im/study/ByteExam1.java");
			fos1 = new FileOutputStream("byte.txt");
			int readCount = -1;
			byte[] buffer = new byte[512];
			while((readCount = fis1.read(buffer)) != -1) {
				fos1.write(buffer,0,readCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
