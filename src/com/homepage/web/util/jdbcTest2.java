package com.homepage.web.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.homepage.web.bean.MemberBean;

import oracle.jdbc.OracleDriver;

public class jdbcTest2 {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Connection getConnection() throws NamingException, SQLException{
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}

	
	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "oracle";
		// String memberId = "", password = "", name = "", email = "";
		// import 단축키 : Ctrl + Shift + O
		OracleDriver od = new OracleDriver();
		Properties info = new Properties();

		info.put("user", user);
		info.put("password", pass);
		
		MemberBean bean = new MemberBean();
		
		try {
			conn = od.connect(url, info);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from member2");
			while (rs.next()) {
				bean.setId(rs.getString("USER_ID"));
				bean.setPassword(rs.getString("USER_PW"));
				bean.setName(rs.getString("NAME"));
				
				System.out.print(bean.getId() + "\t");
				System.out.print(bean.getPassword());
				System.out.print(bean.getName());
				System.out.println(
						);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
