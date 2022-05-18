package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		int flag = 1;
		for (int i = 1; i < 10000; i += 2) {
			// TODO: 计算 pi
				pi += (double) (1.0 / i) * flag;
			flag = -flag;
		}
		System.out.println(pi * 4.0);
	}

}
