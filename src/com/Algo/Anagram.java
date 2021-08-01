package com.Algo;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		int string = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String ");
		String str1 = sc.next();
		System.out.println("Enter second String ");
		String str2 = sc.next();

		int len1 = str1.length();
		int len2 = str2.length();

		// Method to check if the Strings are Anagram or not.
		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				for (int j = 0; j < len2; j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						string = 1;
						break;
					}
				}
			}
		} else {
			System.out.println("length is different of the given string");
		}
		if (string == 1) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}
}
