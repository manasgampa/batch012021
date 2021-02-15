package com.antra2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCEx1 {

	public static void main(String[] args) throws SQLException {
		
		//Driver d=new oracle.jdbc.driver.OracleDriver();
		//Driver d=new com.mysql.jdbc.Driver();
		//DriverManager.registerDriver(d);
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "manas");
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into employee values(2,'kumar',331)");
		ResultSet rs=stmt.executeQuery("select * from employee");
		System.out.println(rs);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		con.close();
		//System.out.println(con);
	}

}
