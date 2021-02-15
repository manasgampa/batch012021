package com.antra2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx3 {
	
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "manas");
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		
		pstmt.setInt(1, 5);
		pstmt.setString(2, "Bob");
		pstmt.setInt(3, 564);
		pstmt.addBatch();
		
		pstmt.setInt(1, 6);
		pstmt.setString(2, "clob");
		pstmt.setInt(3, 980);
		pstmt.addBatch();
		
		pstmt.setInt(1, 7);
		pstmt.setString(2, "Nancy");
		pstmt.setInt(3, 745);
		pstmt.addBatch();
		
		pstmt.executeBatch();
		con.close();
	
	}

}
