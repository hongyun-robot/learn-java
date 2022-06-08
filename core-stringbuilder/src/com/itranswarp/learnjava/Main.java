package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "sucess" : "error");
	}

	static String buildInsertSql(String table, String[] fields) {
		// TODO:
		return "INSERT INTO " + table + " (" + connectStringList(fields, ", ", true) + ") VALUES (?, ?, ?)";
	}
	
	static String connectStringList(String[] fields, String connector, Boolean isPop) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			sb.append(fields[i])
			.append(connector);
		}
		
		if (isPop) {
			sb.delete(sb.length() - connector.length(), sb.length());
		}
		
		return sb.toString();
	}

}
