package im.study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam2 {

	public static void main(String[] args) {
		BufferedReader br1 = null;
		PrintWriter pw1 = null;
		try {
			br1 = new BufferedReader(new FileReader("src/im/study/CharIOExam2.java"));
			pw1 = new PrintWriter("test.txt");
			String line = null;
			while((line = br1.readLine()) != null) {
				pw1.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pw1.close();
			try {
				br1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
