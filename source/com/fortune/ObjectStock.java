package com.fortune;
/**File: ObjectStock.java
  *股票类：显示市值变化的百分比
  */
public class ObjectStock {
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;
	public Stock() {

	}
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public double getChangePercent() {
		return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice;
	}
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		double percent = stock.getChangePercent();
		System.out.println("The percent is " + percent);
	}

}