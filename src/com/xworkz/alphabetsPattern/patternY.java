package com.xworkz.alphabetsPattern;

public class patternY {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i+j==num-1||(i==j&&i!=3&&i!=4))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
