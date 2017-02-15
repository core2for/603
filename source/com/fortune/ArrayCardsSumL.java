package com.fortune;
/** File: ArrayCardsSumL.java
  */
public class ArrayCardsSumL {
	public static void main(String[] args) {
		int[] deck = new int[52];
		int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int sum = 0;
		int count = 0;
		do {
			sum  = 0;
			cardMachine(deck);
			for (int i = 0; i < 4; i++) {
				sum += ranks[deck[i] % 13];
			}
			count++;
		}while (sum != 24);
		System.out.println("number of sum is 24: " + count);
	}
	/** card machine */
	public static void cardMachine(int[] deck) {
		//Initialize the cards
		for (int i = 0; i <deck.length; i++) {
			deck[i] = i;
		}
		//Shulffle the cards
		for (int i = 0; i < deck.length; i++) {
			//Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}
	
}