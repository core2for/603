package com.fortune;

public class TestTime {
	public static void main(String[] args) {

		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		//秒
		long second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		//分钟
		long minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		//小时
		long hour = totalHours % 24;
		System.out.println("current time is " + hour + ":" + minute + ":" + second + " GMT");
		System.out.println(" totalSeconds " + totalSeconds + " second " + second);
		System.out.println("totalMinutes " + totalMinutes);
	}
}