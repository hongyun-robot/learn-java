package com.itranswarp.learnjava;

/**
 * while练习
 */
public class Main {

	public static void main(String[] args) {
		int sum = 0;
		int m = 0;
		int n = 100;
		// FIXME: 使用do while计算M+...+N:
		do {
			sum += m;
			m++;
		} while (m <= n);
		System.out.println(sum);
	}

}
