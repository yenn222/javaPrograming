package enumeration;

import java.util.Calendar;


public class EnumWeek {
	public enum Week { SUNDAY, MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };
	public static void main(String[] args) {
//		Week today = null;
//		Week today = Week.TUESDAY; 
//		열거형 이름(week)를 붙여줘야함.
//		System.out.println(today);
//		
//		System.out.println(today.ordinal());
//
//		String name = today.name();
//		System.out.println(name);
		
		Week today = null;
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);//1부터 시작
		
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(week);
		
		if (today == Week.TUESDAY) {
			System.out.println("화요일에는 랩실 출근하세용 !~");
		}else {
			System.out.println("열심히 랩실 출근하세용.");
		}
	}
}
