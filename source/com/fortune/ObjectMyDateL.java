package com.fortune;
/**File: ObjectMyDateL.java
  *Calendar c = new Calendar(); //抽象类
  */
import java.util.GregorianCalendar;
import java.util.Calendar;
public class ObjectMyDateL {
	private long year;
	private long month;
	private long day;
	public ObjectMyDateL() {
		GregorianCalendar gTime = new GregorianCalendar();
		year = gTime.get(GregorianCalendar.YEAR);
		month = gTime.get(GregorianCalendar.MONTH);
		day = gTime.get(GregorianCalendar.DAY_OF_MONTH);

		/*long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		
		long totalDay = totalSeconds / 86400;
	
		long totalMonth = totalDay / 30;
		long month = totalDay % 30; //31\28\29
		long year = totalMonth / 12;*/
		
	}
	public ObjectMyDateL(long elapsedTime) {
		setDate(elapsedTime);
	}
	public ObjectMyDateL(long year, long month, long day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setDate(long elapsedTime) {
		GregorianCalendar eTime = new GregorianCalendar();
		eTime.setTimeInMillis(elapsedTime);
		year = eTime.get(GregorianCalendar.YEAR);
		month = eTime.get(GregorianCalendar.MONTH);
		day = eTime.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public long getYear() {
		return year;
	}
	public long getMonth() {
		return month;
	}
	public long getDay() {
		return day;
	}
	public static void main(String[] args) {
		ObjectMyDateL date1 = new ObjectMyDateL();
		ObjectMyDateL date2 = new ObjectMyDateL(561555550000L);
		System.out.println(date1.getYear() + "年" + date1.getMonth() + "月" + date1.getDay() + "日");
		System.out.println(date2.getYear() + "年" + date2.getMonth() + "月" + date2.getDay() + "日");

	}
}