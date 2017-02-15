package com.fortune;

import java.util.Scanner;

public class ArrayJingGame {
	static Scanner sc=new Scanner(System.in);
	static boolean flag = true;
	static int flagXO = 0; //标记X、O
	public static void main(String[] args) {
		//原来棋盘的上下界线我把他放到Print()方法里了
		String[][] m = { 			
				/*{ '-', '-', '-', '-', '-', '-', '-' }, 
				{ '|', ' ', '|', ' ', '|', ' ', '|' },
				{ '-', '-', '-', '-', '-', '-', '-' }, 
				{ '|', ' ', '|', ' ', '|', ' ', '|' },
				{ '-', '-', '-', '-', '-', '-', '-' }, 
				{ '|', ' ', '|', ' ', '|', ' ', '|' },
				{ '-', '-', '-', '-', '-', '-', '-' }, */	
				{"| ", "| ", "| ", "|"},
				{"| ", "| ", "| ", "|"},
				{"| ", "| ", "| ", "|"},
				};	
		while(flag){
			Print(m);
			playerX(m);
			//每次输入后就开始判断
			if (judge(m) == 1) {	//flagXO判断X、O哪个棋子赢
				System.out.println("PlayerO won!");
				break;	//出现赢家，结束循环
			}
			else if (judge(m) == -1) {
				System.out.println("PlayerX won!");
				break;	//出现赢家，结束循环
			}
			playerO(m);
			if (judge(m) == 1) {
				System.out.println("PlayerO won!");
				break;	//出现赢家，结束循环
			}
			else if (judge(m) == -1) {
				System.out.println("PlayerX won!");
				break;	//出现赢家，结束循环
			}
			/*if((m[1][1]=='x' && m[1][3]=='x' && m[1][5]=='x')
				||(m[3][1]=='x' && m[3][3]=='x' && m[3][5]=='x')
				||(m[5][1]=='x' && m[5][3]=='x' && m[5][5]=='x')
				||(m[1][1]=='x' && m[3][1]=='x' && m[5][1]=='x')
				||(m[1][3]=='x' && m[3][3]=='x' && m[5][3]=='x')
				||(m[1][5]=='x' && m[3][5]=='x' && m[5][5]=='x')
				||(m[1][1]=='x' && m[3][3]=='x' && m[5][5]=='x')
				||(m[1][5]=='x' && m[3][3]=='x' && m[5][1]=='x')){
				System.out.println("PlayerX won!");
				break;	//出现赢家，结束循环
			}
			else if((m[1][1]=='O' && m[1][3]=='O' && m[1][5]=='O')
				||(m[3][1]=='O' && m[3][3]=='O' && m[3][5]=='O')
				||(m[5][1]=='O' && m[5][3]=='O' && m[5][5]=='O')
				||(m[1][1]=='O' && m[3][1]=='O' && m[5][1]=='O')
				||(m[1][3]=='O' && m[3][3]=='O' && m[5][3]=='O')
				||(m[1][5]=='O' && m[3][5]=='O' && m[5][5]=='O')
				||(m[1][1]=='O' && m[3][3]=='O' && m[5][5]=='O')
				||(m[1][5]=='O' && m[3][3]=='O' && m[5][1]=='O')){
				System.out.println("PlayerO won!");
				break; //出现赢家，结束循环
			}
			else {
				PlayerX(m);
				PlayerY(m);
			}*/
		}
	}	
	/** 总判断行、斜线是否有相同的连续的三个棋子，并返回一整型值*/
	public static int judge(String[][] m) {
		if ((hzfLineJudge(m) || lLineJudge(m)) && flagXO == 1) {
			return 1;
		}
		else if ((hzfLineJudge(m) || lLineJudge(m)) && flagXO == -1) {
			return -1;
		}
		return 0;
	}
	//判断行/正斜线、反斜线是否有相同的连续的三个棋子
		public static boolean hzfLineJudge(String[][] m) {
			for (int i = 0; i < m.length; i++) {	
				if ((m[i][0] == "|O" && m[i][1] == "|O" && m[i][2] == "|O") || (m[2][0] == "|O" && m[1][1] == "|O" && m[0][2] == "|O") || (m[0][0] == "|O" && m[1][1] == "|O" && m[2][2] == "|O")) {
					flagXO = 1;
					return true;
				}
				else if ((m[i][0] == "|X" && m[i][1] == "|X" && m[0][2] == "|X") || (m[2][0] == "|X" && m[1][1] == "|X" && m[0][2] == "|X") || (m[0][0] == "|X" && m[1][1] == "|X" && m[2][2] == "|X")) {
					flagXO = -1;
					return true;											
				}
			}
			return false;
		}
		//判断列是否有相同的连续的三个棋子
		public static boolean lLineJudge(String[][] m) {
			for (int i = 0; i < m.length; i++) {	
				if (m[0][i] == "|O" && m[1][i] == "|O" && m[2][0] == "|O") {
					flagXO = 1;
					return true;
				}
				else if (m[0][i] == "|X" && m[1][i] == "|X" && m[2][i] == "|X") {
					flagXO = -1;
					return true;				
				}
			}
			return false;
		}
		/*//判断正斜线是否有相同的连续的三个棋子
		public boolean zLineJudge(char[] m) {
			for (int i = 0; i < m.length; i++) {				
				return (m[2][0] == 'O' && m[1][1] == 'O' && m[0][2] == 'O') || (m[2][0] == 'X' && m[1][1] == 'X' && m[0][2] == 'X');								
			}
		}
		//判断反斜线是否有相同的连续的三个棋子
		public boolean fLineJudge(char[] m) {
			for (int i = 0; i < m.length; i++) {				
				return (m[0][0] == 'O' && m[1][1] == 'O' && m[2][2] == 'O') || (m[0][0] == 'X' && m[1][1] == 'X' && m[2][2] == 'X');
			}
		}*/
	public static void Print(String[][] m){
		System.out.println("-------");	//顶线
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				System.out.print(m[i][j]);
			}
			System.out.println("\n-------");//底线
		}
		//System.out.println("-------");
	}
	
	/*public static void PlayerX(char[][] m){
		int r,c;
		System.out.println("Enter a row(0,1 or 2) for play x:");
		int x=sc.nextInt();
		if(x==0){
			r=x+1;
		}
		else if(x==1){
			r=x+2;
		}
		else{
			r=x+3;
		}
		System.out.println("Enter a column(0,1 or 2) for play x:");
		int y=sc.nextInt();
		if(y==0){c=y+1;}else if(y==1){c=y+2;}else{c=y+3;}
		if(m[r][c]!=' '){
			System.out.println("Error Input，Please Enter Again！");
			PlayerX(m);
			}else{m[r][c]='X';Print(m);}	
	}
	
	public static void PlayerY(char[][] m){
		int r,c;
		System.out.println("Enter a row(0,1 or 2) for play Y:");
		int x=sc.nextInt();
		if(x==0){r=x+1;}else if(x==1){r=x+2;}else{r=x+3;}
		System.out.println("Enter a column(0,1 or 2) for play Y:");
		int y=sc.nextInt();
		if(y==0){c=y+1;}else if(y==1){c=y+2;}else{c=y+3;}
		if(m[r][c]!=' '){
		System.out.println("Error Input，Please Enter Again！");
		PlayerY(m);
		}else{m[r][c]='O';Print(m);}		
	}*/
	public static void playerX(String[][] m) {
		System.out.println("Enter a row(0,1 or 2) for play X:");
		int xX=sc.nextInt();
		System.out.println("Enter a column(0,1 or 2) for play X:");
		int yX=sc.nextInt();
		if(m[xX][yX] != "| "){
			System.out.println("Error Input，Please Enter Again！");
			playerX(m);
		}
		else {
			m[xX][yX] = "|X";
		}
		Print(m);
	}
	public static void playerO(String[][] m) {
		System.out.println("Enter a row(0,1 or 2) for play O:");
		int xO=sc.nextInt();
		System.out.println("Enter a column(0,1 or 2) for play O:");
		int yO=sc.nextInt();
		if(m[xO][yO] != "| "){
			System.out.println("Error Input，Please Enter Again！");
			playerO(m);
		}
		else {
			m[xO][yO] = "|O";
		}
		Print(m);
	}
}
