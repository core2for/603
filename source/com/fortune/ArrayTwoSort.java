package com.fortune;

public class ArrayTwoSort {
	public static void main(String[] args) {
		int[][] aa = {
				{4, 2},
				{1, 7},
				{4, 5},
				{1, 2},
				{1, 1},
				{4, 1},
		};
		//排序二维数组
		 sort(aa);
		 for (int i = 0; i < aa.length; i++) {
		 	System.out.print("[ ");
			 for (int j = 0; j < aa[i].length; j++) {
				 	System.out.print(aa[i][j] + " ");
			 }
			 System.out.println("]");
			 System.out.println();
		 }
	}
	public static void sort(int m[][]) {
		//先排序里面的一维数组的第一个数字，后排序一维数组的第二个数字
				/*for (int j = 0; j < m.length / 2; j++) {
					int[] temp = m[m.length - 1 - j];
					  m[m.length - 1 - j]= m[j];
					  m[j] = temp;
				}*/
		for (int j = 0; j < m.length; j++) {
			for (int i = j; i < m.length; i++) {
				//比较一维数组的第一个元素
				if (m[j][0] > m[i][0]) {
					int[] temp = m[j];
					m[j]= m[i];
					m[i] = temp;
				}
			}
			for (int k = 0; k < m.length; k++) {
				//比较一维数组的第二个元素
				if (m[j][0] == m[k][0]) {
					if (m[j][1] > m[k][1]) {
						int[] temp = m[j];
						m[j] = m[k];
						m[k] = temp;
					}
				}
			}
		}	
	}
}