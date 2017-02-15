package com.fortune;
/**File: ObjectGregorianCalendarL.java
  *公历类GregorianCalendar
  */
import java.util.GregorianCalendar;
public class ObjectGregorianCalendarL {
	public static void main(String[] args) {
		GregorianCalendar calendarNow = new GregorianCalendar();
		int year = calendarNow.get(GregorianCalendar.YEAR);
		int month = calendarNow.get(GregorianCalendar.MONTH);
		int dayOfMonth = calendarNow.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
		calendarNow.setTimeInMillis(1234567898765L);
		int year2 = calendarNow.get(GregorianCalendar.YEAR);
		int month2 = calendarNow.get(GregorianCalendar.MONTH);
		int dayOfMonth2 = calendarNow.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year2 + "年" + month2 + "月" + dayOfMonth2+ "日");
	}
}