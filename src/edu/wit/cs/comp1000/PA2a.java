package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int posSum = 0;
		int negSum = 0;
		int totalSum = 0;
		int posCount = 0;
		int negCount = 0;

		System.out.print("Enter five whole numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();

		totalSum = num1 + num2 + num3 + num4 + num5;

		if (num1 > 0) {
			posSum += num1;
			posCount++;
		} else {
			negSum += num1;
			negCount++;
		}

		if (num2 > 0) {
			posSum += num2;
			posCount++;
		} else {
			negSum += num2;
			negCount++;
		}

		if (num3 > 0) {
			posSum += num3;
			posCount++;
		} else {
			negSum += num3;
			negCount++;
		}

		if (num4 > 0) {
			posSum += num4;
			posCount++;
		} else {
			negSum += num4;
			negCount++;
		}

		if (num5 > 0) {
			posSum += num5;
			posCount++;
		} else {
			negSum += num5;
			negCount++;
		}

		double totalAvg = totalSum / 5.0;

		double posAvg;
		if (posCount > 0) {
			posAvg = posSum / (double) posCount;
		} else {
			posAvg = 0.0;
		}

		double negAvg;
		if (negCount > 0) {
			negAvg = negSum / (double) negCount;
		} else {
			negAvg = 0.0;
		}

		String posPlural;
		if (posCount == 1) {
			posPlural = "number";
		} else {
			posPlural = "numbers";
		}

		String negPlural;
		if (negCount == 1) {
			negPlural = "number";
		} else {
			negPlural = "numbers";
		}

		System.out.printf("The sum of the %d positive %s: %d%n", posCount, posPlural, posSum);
		System.out.printf("The sum of the %d non-positive %s: %d%n", negCount, negPlural, negSum);
		System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
		System.out.printf("The average of the %d positive %s: %.2f%n", posCount, posPlural, posAvg);
		System.out.printf("The average of the %d non-positive %s: %.2f%n", negCount, negPlural, negAvg);
		System.out.printf("The average of the 5 numbers: %.2f%n", totalAvg);

	}

}
