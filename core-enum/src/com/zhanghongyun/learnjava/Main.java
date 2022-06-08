package com.zhanghongyun.learnjava;

public class Main {
	public static void main(String[] args) {
		Weekday day = Weekday.SAT;
		
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("Today is " + day + ". Work at office!");
			break;
		case SAT:
		case SUN:
			System.out.println("Today is " + day + ". Work at home!");
			break;
		default:
			throw new RuntimeException("cannot process " + day);
		}
	}
}
