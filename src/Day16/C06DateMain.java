package Day16;

import java.util.Calendar;
import java.util.Date;

public class C06DateMain {

	public static void main(String[] args) {
		
//		Date d1 = new Date();
//		System.out.println(d1);
//
//		System.out.println(d1.getYear());
//		System.out.println(d1.getMonth()+1); // 1월 : 0 ~ 12월 : 11
//		System.out.println(d1.getDay()); 	 // 요일 0~6 (일~토)
//		System.out.println(d1.getDate());
//		System.out.println(d1.getHours());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getSeconds());
		//-------------------------------------
		// Calendar
		Calendar cal = Calendar.getInstance(); // 기본은 현재 시스템의 시간
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR)); 		// 년도
		System.out.println(cal.get(Calendar.MONTH)+1);		// 월
		System.out.println(cal.get(Calendar.DATE));			// 날짜
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 날짜
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); 	// 요일 1~7 (일~토)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); 	// 시간
		System.out.println(cal.get(Calendar.MINUTE)); 		// 분
		System.out.println(cal.get(Calendar.SECOND)); 		// 초
		
	}

}
