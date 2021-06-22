package com.prime.multithreading;

import java.util.Scanner;

public class MultiThreadApplication extends Thread {

	public void run() {

		String prime = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number till which prime has to be calculated : ");
		int number = scan.nextInt();

		for (int i = 2; i <= number; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter++;
				}
			}

			if (counter == 2) {
				prime = prime + i + " ";
			}
		}

		System.out.println("\nPrime numbers are : \n" + prime);
	}

	public static void main(String[] args) {

		MultiThreadApplication thread = new MultiThreadApplication();
		thread.start();

	}
}
