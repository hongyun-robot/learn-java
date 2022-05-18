package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock"); // 石头
		System.out.println(" 2: Scissors"); // 剪刀
		System.out.println(" 3: Paper"); // 布
		// 用户输入:
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = (int) (1 + Math.random() * 3);
		System.out.println(random);
		switch (choice) {
		// TODO:
		case 1 -> System.out.print(random == 1 ? "tie" : random == 2 ? "victory" : "defeated");
		case 2 -> System.out.print(random == 1 ? "defeated" : random == 2 ? "tie" : "victory");
		case 3 -> System.out.print(random == 1 ? "victory" : random == 2 ? "defeated" : "tie");
		default -> System.out.print("Input irregularities");
		}
	}

}
