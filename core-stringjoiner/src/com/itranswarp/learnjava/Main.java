package com.itranswarp.learnjava;

import java.util.StringJoiner;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "success" : "error");
	}

	static String buildSelectSql(String table, String[] fields) {
		// TODO:
		return "SELECT " + connectStringList(fields, ", ", "", "") + " FROM " + table;
	}
	
	static String connectStringList(String[] fields, String connector, String startStr, String endStr) {
		StringJoiner sj = new StringJoiner(connector, startStr, endStr);
		for (String field: fields) {
			sj.add(field);
		}
		return sj.toString();
	}

}
