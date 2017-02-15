package com.fortune;
/**File: ArrayStudentSoreL.java
  *对学生排序
  */
import java.util.Scanner;

public class ArrayStudentSoreL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter numbers of sutdent: ");
		int count = input.nextInt();
		String[] studentName = new String[count];		//存放学生姓名
		double[] studentScore = new double[count];		//存放学生成绩
		String[] result = new String[count];			//存放学生成绩以及姓名
		int i = 0;
		while (i < count) {
			System.out.println("Please enter student's name: ");
			studentName[i] = input.next();
			System.out.println("enter score: ");
			studentScore[i] = input.nextDouble();
			result[i] = studentName[i] + "  " + studentScore[i];
			i++;
		}
		System.out.println("排序前---------------");
		System.out.println("姓名     成绩");
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}
		System.out.println("---------------");
		sortArr(studentScore, result);	//按学生成绩降序排序
		System.out.println("排序后---------------");
		System.out.println("姓名    成绩");
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}
		System.out.println("---------------");
	}
	public static void sortArr(double[] studentScore, String[] result) {
		for (int i = 0; i < studentScore.length; i++) {
			/*double max = studentScore[i];
			@1.String maxStr = result[i];*/
			//理解：maxStr 
			for (int j = i + 1; j < studentScore.length; j++) {
				if (/*max*/studentScore[i] < studentScore[j]) {
					/*double  temp = studentScore[j];
					studentScore[j] = max;
					max = temp;	
					String tempStr = result[j];
					result[j] = maxStr;		//此处的maxStr是@1处的复制
					maxStr = tempStr; 		//此处的maxStr变了，@1处的也
					//转换后也要->result[i] = maxStr;
					System.out.println("tempStr " + tempStr);			*/
					double  temp = studentScore[j];
					studentScore[j] = studentScore[i];
					studentScore[i] = temp;	
					String tempStr = result[j];
					result[j] = result[i];
					result[i] = tempStr; 	
				}
			}	
		}
	}
}