package com.fortune;
public class TestAb {
	public static void main(String[] args) {
		int a;
		{
			int b = 0;
			a = b++;
			System.out.println(a);
		}
		System.out.println(a);
	}
}