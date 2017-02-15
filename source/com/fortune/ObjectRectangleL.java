package com.fortune;
/**File: ObjectRectangleL.java
  *矩形的面积类
  */
public class ObjectRectangleL {
	private double width = 1;
	private double height = 1;
	public ObjectRectangleL() {

	}
	public ObjectRectangleL(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return this.width * this.height;
	}
	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}
	public static void main(String[] args) {
		ObjectRectangleL rectangle = new ObjectRectangleL(4, 40);
		ObjectRectangleL rectangle2 = new ObjectRectangleL(3.5, 35.9);
		double rectangleArea = rectangle.getArea();
		double rectanglePerimeter = rectangle.getPerimeter();
		double rectangle2Area = rectangle2.getArea();
		double rectangle2Perimeter = rectangle2.getPerimeter();
		System.out.printf("rectangle: width: %-7.2fheight: %-7.2fArea: %-7.2fPerimeter: %-7.2f\n", rectangle.width, rectangle.height,rectangleArea, rectanglePerimeter);
		System.out.printf("rectangle2: width: %-7.2fheight: %-7.2fArea: %-7.2fPerimeter: %-7.2f", rectangle2.width, rectangle2.height,rectangle2Area, rectangle2Perimeter);
	}
}