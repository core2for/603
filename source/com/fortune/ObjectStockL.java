package com.fortune;
/**File: ObjectStockL.java
  *股票类：显示市值变化的百分比
  */
public class ObjectStockL {
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;
	public ObjectStockL() {

	}
	public ObjectStockL(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public double getChangePercent() {
		return Math.abs(this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice;
	}
	public static void main(String[] args) {
		ObjectStockL stock = new ObjectStockL("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34;
		stock.currentPrice = 33;
		double percent = (int)(stock.getChangePercent() * 10000) / 100.0;
		System.out.println("The percent is " + percent + "%");
	}

}