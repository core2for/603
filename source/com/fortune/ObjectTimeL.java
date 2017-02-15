package com.fortune;

import java.util.Date;

public class ObjectTimeL {
	private long hour;
	private long minute;
	private long second;
	public ObjectTimeL() {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		//秒
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		//分钟
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		//小时
		this.hour = totalHours % 24;
	}
	public ObjectTimeL(long elapseTime) {
		setTime(elapseTime);
	}
	public ObjectTimeL (long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	/**
	  *
	  */
	public void setTime(long elapseTime) {

		long totalSeconds = elapseTime / 1000;
		//秒
		this.second = totalSeconds % 60;
		long totalMinutes = elapseTime / 60;
		//分钟
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		//小时
		this.hour = totalHours % 24;
	}
	public long getHour() {
		return hour;
	}
	public long getSecond() {
		return second;
	}
	public long getMinute() {
		return minute;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectTimeL time1 = new ObjectTimeL();
		ObjectTimeL time2 = new ObjectTimeL(555550000);
		System.out.println((time1.getHour() + 8) + ":" + time1.getMinute() + ":" + time1.getSecond() + " Beijing");
		System.out.println((time2.getHour() + 8) + ":" + time2.getMinute() + ":" + time2.getSecond() + " Beijing");
	}

}