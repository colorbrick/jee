package com.homepage.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class DbManager {
	public static Connection getConnection(){
		Connection conn = null;
		OracleDriver od = new OracleDriver();
		Properties info = new Properties();
		
		info.put("user", "movie");
		info.put("password", "movie");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(url,"movie","movie");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DBmanager 에게서 에러가 났음");
		}
		return conn;
	}
}
