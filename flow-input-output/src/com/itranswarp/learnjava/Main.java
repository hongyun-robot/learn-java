package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input 输入上次考试成绩：");
		int prev = scanner.nextInt();
		System.out.print("输入本次考试成绩");
		int score = scanner.nextInt();
		double percent = (((double) score - (double) prev) / (double) prev) * 100;
		System.out.println(percent);
		System.out.printf("成绩提高了：%.2f%%", percent);
	}
}
