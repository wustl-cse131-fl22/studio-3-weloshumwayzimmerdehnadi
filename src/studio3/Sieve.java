package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Select an integer: ");
		int n = in.nextInt();

		boolean[] allNumbers = new boolean[n + 1];

		// Puts all numbers until n into array
		for (int i = 0; i <= n; i++) {
			allNumbers[i] = true;
		}

		// allNumbers[x] = x+1

		boolean isPrime = true;

		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == 1) {
				allNumbers[i] = false;
			} else if (i == 2) {
				allNumbers[i] = true;
				System.out.println(i);
			} else {
				for (int j = 2; j < Math.sqrt(i) + 1; j++) {
					if (i % j == 0) {
						allNumbers[i] = false;
					}
				}

				if (allNumbers[i] == true) {
					System.out.println(i);
				}
			}

		}
	}

}
