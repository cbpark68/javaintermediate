package im.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime ldt1= LocalDateTime.now();
		System.out.println(ldt1);
		LocalDate ld1 = LocalDate.of(2023, 12, 25);
		System.out.println(ld1);
		LocalTime lt1 = LocalTime.of(15, 45);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("17:13:21");
		System.out.println(lt2);
		LocalDate ld2 = ldt1.toLocalDate();
		System.out.println(ld2);
		System.out.println(ldt1.getMonthValue());
	}

}
