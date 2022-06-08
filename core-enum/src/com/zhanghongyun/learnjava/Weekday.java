package com.zhanghongyun.learnjava;

public enum Weekday {
	MON("星期一"),
	TUE("星期二"),
	WED("星期三"),
	THU("星期四"),
	FRI("星期五"),
	SAT("6"),
	SUN("星期日");
	
	private String chinese;
	
	private Weekday(String chinese) {
		this.chinese = chinese;
	}
	
	@Override
	public String toString() {
		return chinese;
	}
}
