package oop0827;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test01_Calendar {

	public static void main(String[] args) {
		// 날짜 관련 클래스
		//Date
		//Calendar
		//GregorianCalendar
		
		GregorianCalendar now=new GregorianCalendar();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)); // month가 0부터 count되기 때문
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		
		//12 시간을 기준
		System.out.println(now.get(Calendar.HOUR));	// 0
		//24 시간을 기준
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); //12
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		//요일(1일 2월 3화 4수 5목 6금 7토)
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		//날짜 데이터의 연산
		//now 날짜에 3년 더하기
		now.add(Calendar.YEAR, 3);
		System.out.println(now.get(Calendar.YEAR));
		//now 날짜에 2달 더하기
		now.add(Calendar.MONTH, 2);
		System.out.println(now.get(Calendar.MONTH)+1);
		//now 날짜에 5일 빼기
		now.add(Calendar.DATE, -5);
		System.out.println(now.get(Calendar.DATE));
		
		
		
		
	}// main() end
}//class end
