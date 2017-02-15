package com.fortune;
/**File: ArrayAnalysisScore.java
  *判断个人成绩和平均分的比较
  */
import java.util.Scanner;

public class ArrayAnalysisScore {
	public static void main(String[] args) {
		final int COUNT_OF_ARRAY = 100;
		double[] arrScore = new double[COUNT_OF_ARRAY];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter scores：");
		double score = input.nextDouble();
		int  i = 0;
		while (score >= 0 ) {
			arrScore[i++] = score;
			score = input.nextDouble();
		}
		//System.out.println(average);
		System.out.println("分数大于或等于平均分的个数：" + analysis(arrScore, i) + " 分数小于平均分的个数：" + (i - analysis(arrScore, i)));

	}
	public static int analysis(double[] arrScore, int i) {
		int j = 0, sum = 0;
		while (j < i) {
			sum += arrScore[j++];
		}
		
		int average = sum / i;
		int count = 0;
		for (int k = 0; k < i; k++) {
			if (arrScore[k] >= average) {
				count++;
			}
		}
		return count;
	}
}