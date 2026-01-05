package day3;

import java.util.Scanner;

public class BMICal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weight, height, Bmi;

		System.out.println("Enter the Height in inches ");
		height = scanner.nextDouble();
		System.out.println("Enter the weight in pounds");
		weight = scanner.nextDouble();

		Bmi = (weight / height * height) * 703;

		if (Bmi < 18.5) {
			System.out.println("underweight");
		} else if (Bmi >= 18.5 && Bmi <= 24.9) {
			System.out.println("Healthy weight");
		} else if (Bmi >= 25 && Bmi <= 29.9) {
			System.out.println("Healthy weight");
		} else {
			System.out.println("Obese");
		}

	}

}
