package com.antra2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEX5 {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "manas");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		
		ResultSetMetaData metaData = rs.getMetaData();
		System.out.println(metaData.getTableName(1));
		System.out.println(metaData.getColumnCount());
		for(int i=1;i<=metaData.getColumnCount();i++) {
			System.out.println(metaData.getColumnName(i));
		}
		
	}
}
