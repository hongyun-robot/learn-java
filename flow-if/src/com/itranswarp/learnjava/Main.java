package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 计算BMI
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Height (m): ");
		double height = scanner.nextDouble();
		System.out.print("Weight (kg): ");
		double weight = scanner.nextDouble();
		// FIXME:
		double bmi = weight / (height * height);
		// TODO: 打印BMI值及结果
		if (bmi <= 18.5) {
			System.out.printf("体重过轻: %.2f", bmi);
		} else if (bmi <= 25) {
			System.out.printf("体重正常: %.2f", bmi);
		} else if (bmi <= 28) {
			System.out.printf("体重过重：%.2f", bmi);
		} else if (bmi <= 32) {
			System.out.printf("体重肥胖：%.2f", bmi);
		} else {
			System.out.printf("体重非常肥胖：%.2f", bmi);
		}
	}

}
