package com.fortune;
/**File: ObjectStopWatchL.java
  *秒表
  */
import java.util.Date;
public class ObjectStopWatchL {
	private long startTime = 0;
	private long endTime = 0;
	public ObjectStopWatchL() {
		this.startTime = (new Date()).getTime() / 1000;
	}
	public void setStartTime(long startTime) {
		startTime = startTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setEndTime(long endTime) {
		endTime = endTime;
	}
	public long getEndTime() {
		return endTime;
	}
	/** 将startTime 设置为当前时间 */
	public void start() {
		startTime = (new Date()).getTime() / 1000;
	}
	/** 将endTime 设置为当前时间 */
	public void stop() {
		endTime = (new Date()).getTime() / 1000;
	}
	/** 以毫秒为单位返回秒别记录的流逝时间 */
	public long getElapsedTime() {

		return endTime - startTime;
	}
	/** 对数字进行排序 */
	public static void sore(int[] array) {
		//方式一：
		for (int j = 0; j < array.length; j++) {
			for (int i = j; i < array.length; i++) {
				if (array[j] > array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}	
	}
	/** 选择排序 */
	public static void sore2(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			//如果大于则交换
			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}
	public static void main(String[] args) {
		ObjectStopWatchL time = new ObjectStopWatchL();
		int[] arrayNum = new int[100000];
		//随机产生number个数字，并放入数组里面
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = (int)(Math.random() * i);
		}
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");
		}
		System.out.println("--");
		//对100000个数字进行排序
		//sore(arrayNum);
		time.start();
		long startTime = time.getStartTime();
		sore2(arrayNum);
		time.stop();
		long endTime = time.getEndTime();
		System.out.println("time " + (endTime - startTime));
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");
		}
	}
}