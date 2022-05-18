package com.itranswarp.learnjava;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO 倒序输出数组元素
		int[] ns = { 1, 4, 9, 16, 25 };
		for (int i = ns.length - 1; i >= 0; i--) {
			System.out.println(ns[i]);
		}
	}

}
