package com.fortune;

public class ArrayStudentSortL {
	/** Main method */
	public static void main(String[] args) {
		//students'answers to the questions
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		};
		//KEY to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int[] array = new int[answers.length];
		for (int i = 0; i < answers.length; i++) {
			//Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			System.out.println("Student " + i + " 's " + " correct count is " + correctCount);
			array[i] = correctCount;
		}
		System.out.println("---------------------------");
		int[] index = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
					int temp2 = index[i];
					index[i] = index[j];
					index[j] = temp2;
				}
			}
			System.out.println("Student " + index[i] + " 's " + " correct count is " + array[i]);
		}
	}
}
