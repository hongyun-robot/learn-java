package com.itranswarp.learnjava;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i = 10;
		Integer n1 = new Integer(i);
		System.out.println(n1);
		Integer n2 = Integer.valueOf(i);
		System.out.println(n2);
		Integer n3 = Integer.valueOf("100");
		System.out.println(n3);
		double d = 0.3 - 0.2;
		System.out.println(d);
		byte x = 1;
		byte y = 127;
		System.out.println(Byte.toUnsignedInt(x));
		System.out.println(Byte.toUnsignedInt(y));
		Integer n4 = null;
		int i2 = n4;
		System.out.printf("%d, %d", n4, i2);
		
	}

}
