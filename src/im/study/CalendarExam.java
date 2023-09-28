package im.study;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.HOUR, 5);
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH)+1);
		System.out.println(cal1.get(Calendar.DATE));
		System.out.println(cal1.get(Calendar.HOUR_OF_DAY));
	}

}
