/**
 * 2022-05-06
 * 张鸿运
 */
package com.itranswarp.learnjava;

/**
 * @author admin
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO for each 求和
		int[] ns = { 1, 4, 9, 16, 25 };
		int sum = 0;
		for (int n : ns) {
			sum += n;
		}
		System.out.println(sum);

	}

}
