package com.fortune;
/**File: ArrayJinZiGameL.java
  *井字游戏
  */
import java.util.Scanner;

public class ArrayJinZiGameL {
	public static void main(String[] args) {
		//执行一个赋值函数改变
		Scanner input = new Scanner(System.in);
		//
		String[][] qiPan = {
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
			{"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "}, 
		};
		printQiPan(qiPan);
		boolean flag = true;
		int count = 0;
		int playerX = 0, playerO = 0;
		//System.out.println(qiPan.length);
		while (flag) {
			System.out.print("Enter a row(0, 1, 2..., 7, 8) for player X: ");
			int xRow = input.nextInt();
			System.out.print("Enter a column(0, 1, 2..., 7, 8) for player X: ");
			int xCol = input.nextInt();
			qiPan[xRow][xCol] = " X ";
			
			count++;
			printQiPan(qiPan);
			if (/*judge(qiPan)*/judge44(qiPan, xRow, xCol, " X ") || judge33(qiPan, xRow, xCol, " X ") || judge22(qiPan, xRow, xCol, " X ") || count > 80) {//判断
				playerX++;
				break;	
			}				
			//
			System.out.print("Enter a row(0, 1, 2..., 7, 8) for player O: ");
			int oRow = input.nextInt();
			System.out.print("Enter a column(0, 1, 2..., 7, 8) for player O: ");
			int oCol = input.nextInt();
			qiPan[oRow][oCol] = " O ";
			
			count++;
			printQiPan(qiPan);
			if (/*judge(qiPan)*/judge44(qiPan, oRow, oCol, " O ") || judge33(qiPan, oRow, oCol, " O ") || judge22(qiPan, oRow, oCol, " O ") || count > 80) {//判断
				playerO++;
				break;
			}
		}
		if (count == 81) {
			System.out.println("和局");
		}
		else {
			if (playerX > 0) {
				System.out.println("X player win.");	
			}
			else
				System.out.println("O player win."); 
		}	
	}	
	/** 打印棋盘函数 */
	public static void printQiPan(String[][] qiPan) {
		System.out.println("    0     1     2     3     4     5     6     7     8\n" + " -------------------------------------------------------\n" 
				+ "0" + "| " + qiPan[0][0] + " | " + qiPan[0][1] + " | " + qiPan[0][2] + " | " + qiPan[0][3] + " | " + qiPan[0][4] + " | " + qiPan[0][5] + " | " + qiPan[0][6] + " | " + qiPan[0][7] + " | " + qiPan[0][8] + " |\n" 
				+ " -------------------------------------------------------\n" 
				+ "1" + "| " + qiPan[1][0] + " | " + qiPan[1][1] + " | " + qiPan[1][2] + " | " + qiPan[1][3] + " | " + qiPan[1][4] + " | " + qiPan[1][5] + " | " + qiPan[1][6] + " | " + qiPan[1][7] + " | " + qiPan[1][8] + " |\n"  
				+ " -------------------------------------------------------\n" 
				+ "2" + "| " + qiPan[2][0] + " | " + qiPan[2][1] + " | " + qiPan[2][2] + " | " + qiPan[2][3] + " | " + qiPan[2][4] + " | " + qiPan[2][5] + " | " + qiPan[2][6] + " | " + qiPan[2][7] + " | " + qiPan[2][8] + " |\n" 
				+ " -------------------------------------------------------\n"
				+ "3" + "| " + qiPan[3][0] + " | " + qiPan[3][1] + " | " + qiPan[3][2] + " | " + qiPan[3][3] + " | " + qiPan[3][4] + " | " + qiPan[3][5] + " | " + qiPan[3][6] + " | " + qiPan[3][7] + " | " + qiPan[3][8] + " |\n" 
				+ " -------------------------------------------------------\n"
				+ "4" + "| " + qiPan[4][0] + " | " + qiPan[4][1] + " | " + qiPan[4][2] + " | " + qiPan[4][3] + " | " + qiPan[4][4] + " | " + qiPan[4][5] + " | " + qiPan[4][6] + " | " + qiPan[4][7] + " | " + qiPan[4][8] + " |\n" 
				+ " -------------------------------------------------------\n"
				+ "5" + "| " + qiPan[5][0] + " | " + qiPan[5][1] + " | " + qiPan[5][2] + " | " + qiPan[5][3] + " | " + qiPan[5][4] + " | " + qiPan[5][5] + " | " + qiPan[5][6] + " | " + qiPan[5][7] + " | " + qiPan[5][8] + " |\n" 
				+ " -------------------------------------------------------\n"
				+ "6" + "| " + qiPan[6][0] + " | " + qiPan[6][1] + " | " + qiPan[6][2] + " | " + qiPan[6][3] + " | " + qiPan[6][4] + " | " + qiPan[6][5] + " | " + qiPan[6][6] + " | " + qiPan[6][7] + " | " + qiPan[6][8] + " |\n" 
				+ " -------------------------------------------------------\n"
				+ "7" + "| " + qiPan[7][0] + " | " + qiPan[7][1] + " | " + qiPan[7][2] + " | " + qiPan[7][3] + " | " + qiPan[7][4] + " | " + qiPan[7][5] + " | " + qiPan[7][6] + " | " + qiPan[7][7] + " | " + qiPan[7][8] + " |\n" 
				+ " -------------------------------------------------------\n"
				+ "8" + "| " + qiPan[8][0] + " | " + qiPan[8][1] + " | " + qiPan[8][2] + " | " + qiPan[8][3] + " | " + qiPan[8][4] + " | " + qiPan[8][5] + " | " + qiPan[8][6] + " | " + qiPan[8][7] + " | " + qiPan[8][8] + " |\n" 
				+ " -------------------------------------------------------\n");
	}
	/** 判断输赢函数 
			有输入的点判断行，列，正斜线，反斜线。
			遍历所在的行、列、斜线，用一个标记记录是否是连续的棋子，
			若是连续的四个棋子则判断执此棋子的玩家赢，否则重置标记，继续...
			
	*/

	/*//根据输入的点的坐标，判断他的周围是否有四个连在一起的相同的棋子
	/** 简版 */
	/*public static boolean judge(String[][] qiPan) {
		//判断行
		for (int i = 0; i < qiPan.length; i++) {
			if (qiPan[i][0] != "   " && qiPan[i][1] == qiPan[i][0] && qiPan[i][2] == qiPan[i][0]) {
				return true;
			}
		}

		//判断竖
		for (int i = 0; i < qiPan[0].length; i++) {
			if (qiPan[0][i] != "   " && qiPan[1][i] == qiPan[0][i] && qiPan[2][i] == qiPan[0][i]) {
				return true;
			}
		}
		//判断斜线
		if (qiPan[0][0] == qiPan[1][1] && qiPan[2][2] == qiPan[0][0] && qiPan[0][0] != "   ") {
				return true;
			}
		if (qiPan[0][2] == qiPan[1][1] && qiPan[2][2] == qiPan[0][2] && qiPan[0][2] != "   ") {
				return true;
		}
		return false;
	}*/
	/** 横竖 */
	public static boolean judge22(String[][] qiPan, int row, int col, String cr) {
		//遍历行
		int count = 0;
		for (int i = 0; i <qiPan[row].length; i++) {
			if (qiPan[row][i] == cr) {
				count++;
				if (count == 4) {
					return true;
				}
			}
			else{
				count = 0;
			}
		}
		System.out.println("judge22 " + count);
		//遍历列
		for (int i = 0; i <qiPan.length; i++) {
			if (qiPan[i][col] == cr) {
				count++;
				if (count == 4) {
					return true;
				}
			}
			else{
				count = 0;
			}
		}
		
		return false;
	}
	/** 反斜线 
		row - col 大于0，坐标一都是0，
		左上角的row - col 小于0，右下角相反，并且坐标一是row - col 开头
	*/

	public static boolean judge33(String[][] qiPan, int row, int col, String cr) {
		//判断是哪条斜线,后判断是否有连四个的棋子
		int count = 0;
		if (row - col > 0) {
			for (int i = row - col, j = 0; i < qiPan.length - (row - col); i++, j++) {
				if (qiPan[i][j] == cr) {
					count++;
					if (count == 4) {
						return true;
					}
				}
				else {
					count = 0;
				}
			}
		}
		else if (row - col < 0){
			for (int i = col - row, j = 0; i < qiPan.length - (col - row); i++, j++) {
				if (qiPan[j][i] == cr) {
					count++;
					if (count == 4) {
						return true;
					}
				}
				else {
					count = 0;
				}
			}
		}
		else {
			for (int i = 0, j = 0; i < qiPan.length; i++, j++) {
				if (qiPan[j][i] == cr) {
					count++;
					if (count == 4) {
						return true;
					}
				}
				else {
					count = 0;
				}
			}
		}
		return false;
	}
	/** 正斜线 
		row + col 大于8，是左下角，小于8是左下角
	
	*/
	public static boolean judge44(String[][] qiPan, int row, int col, String cr) {
		int count = 0;
		if (row + col  <= 8) {
			for (int i = 0, j = row + col; i <= row + col; i++, j--) {
				if (qiPan[i][j] == cr) {
					count++;
					if (count == 4) {
						return true;
					}
				}	
				else {
					count = 0;
				}		
			}
		}
		else {
			for (int i = row + col - (qiPan.length - 1), j = qiPan.length - 1, k = 1; i < qiPan.length - i; i++, j--, k += 2) {
				if (qiPan[i][j] == cr) {
					count++;
					if (count == 4) {
						return true;	
					}
				}
				else {
					count = 0;
				}
			}
		}
		return false;
	}
}
