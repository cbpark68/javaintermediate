package im.study;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam3 {

	public static void main(String[] args) {
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
		){
				out.writeInt(1000);
				out.writeBoolean(true);
				out.writeDouble(1000.5);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
