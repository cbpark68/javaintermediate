package im.study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date dt1 = new Date();
		System.out.println(dt1);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(sdf1.format(dt1));
		System.out.println(dt1.getTime());
		long today = System.currentTimeMillis();
		System.out.println(today);
		System.out.println(today - dt1.getTime());
	}

}
