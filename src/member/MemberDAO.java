package member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import oracle.jdbc.OracleDriver;

public class MemberDAO {
	
	public Connection getConnection() throws NamingException, SQLException{
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "movie";	
		String pass = "movie";
		
		MembersBean bean = new MembersBean();
//		String name = "", birthday="", gender="", userId = "", userPw = "", email = "", phone="";
		
		OracleDriver od = new OracleDriver();
		Properties info = new Properties();
		


		info.put("user", user);
		info.put("password", pass);
		
		try {
			conn = od.connect(url, info);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from member");
			while (rs.next()) {
				bean.setName(rs.getString("NAME"));
				bean.setBirthday(rs.getString("BIRTHDAY"));
//				bean.setBirthdayRadio(rs.getString("BIRTHDAY_RADIO"));
				bean.setGender(rs.getString("GENDER"));
				bean.setUserId(rs.getString("USER_ID"));
				bean.setUserPw(rs.getString("USER_PW"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setPhone(rs.getString("PHONE"));
				
				System.out.print(bean.getName()+ "\t");
				System.out.print(bean.getBirthday() + "\t");
//				System.out.print(bean.getBirthdayRadio() + "\t");
				System.out.print(bean.getGender() + "\t");
				System.out.print(bean.getUserPw() + "\t");
				System.out.print(bean.getUserPw() + "\t");
				System.out.print(bean.getEmail() + "\t");
				System.out.print(bean.getPhone() + "\t");
				System.out.println();
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
