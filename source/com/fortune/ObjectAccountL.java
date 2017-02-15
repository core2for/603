package com.fortune;
/**File: ObjectAccountL.java
  *账户类
  */
import java.util.Scanner;
import java.util.Date;
public class ObjectAccountL {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private static Date dateCreated = null;
	public ObjectAccountL() {

	}
	public ObjectAccountL(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public void setId(int id) {
		id = id;
	}
	public int getId() {
		return id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	/** 返回月利率 */
	public double getMonthlyInterestRate() {

		return annualInterestRate / 12;
	}
	/** 从账户提取特定数额 
		明确一：返回值类型 double
		二：参数类型，个数；double balance, int draw
	*/
	public double withDraw(int draw) {
		if (balance < draw) {
			return -1;
		}
		return balance - draw;
	}
	/** 向账户存储特定数额 */
	public double deposit(int posit) {
		if (posit < 0) {
			return -1;
		}
		return balance + posit;
	}
	/** 返回月利息 */
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ObjectAccountL account = new ObjectAccountL(1122, 20000);
		dateCreated = new Date();
		account.setAnnualInterestRate(0.045);
		System.out.print("Enter the draw: ");
		int draw = input.nextInt();
		account.setBalance(account.withDraw(draw));
		System.out.print("Enter the posit: ");
		int posit = input.nextInt();
		account.setBalance(account.deposit(posit));
		double monthlyInterest = account.getMonthlyInterest();
		System.out.println("balance: " + account.getBalance() + " monthlyInterest: " + monthlyInterest + " Date: " + account.dateCreated.toString());
		ObjectAccountL a2 = new ObjectAccountL();
		a2.setId(1133);
		a2.setBalance(3000);		
		Date dateCreated2 = new Date();
		a2.setAnnualInterestRate(0.06);
		System.out.println("balance: " + a2.getBalance() + " monthlyInterest: " + a2.getMonthlyInterest() + " Date: " + a2.dateCreated.toString() + " " + a2.getAnnualInterestRate());		
	}
}
