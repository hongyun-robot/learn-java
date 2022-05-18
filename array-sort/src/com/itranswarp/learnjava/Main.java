package com.itranswarp.learnjava;

import java.util.Arrays;

/**
 * 降序排序
 */
public class Main {
	public static void main(String[] args) {
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// 排序前:
		System.out.println(ns);
		System.out.println(Arrays.toString(ns));
		int result = 0;
		// TODO:
		for (int i = 0;i < ns.length;i++) {
			for (int j = i + 1;j < ns.length;j++) {
				result++;
				if (ns[i] < ns[j]) {
					int temp = ns[i];
					ns[i] = ns[j];
					ns[j] = temp;
				}
			}
		}
		System.out.println(result);
		// 排序后:
		Arrays.sort(ns);
		System.out.println(ns);
		System.out.println(Arrays.toString(ns));
		if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
			System.out.println("success");
		} else {
			System.out.println("error");
		}
	}
}
