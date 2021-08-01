package com.Algo;

import java.util.Scanner;

public class Permutation {
	static void printPermution(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// i'th character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the i'th character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermution(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printPermution(s, "");
	}
}
