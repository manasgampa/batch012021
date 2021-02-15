package com.antra2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx4 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "manas");
		try {
			
			con.setAutoCommit(false);
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			
			pstmt.setInt(1, 8);
			pstmt.setString(2, "Helen");
			pstmt.setInt(3, 937);
			pstmt.execute();
			
			pstmt.setInt(1, 9);
			pstmt.setString(2, "Ying");
			pstmt.setInt(3, 545);
			pstmt.execute();
			
			pstmt.setInt(1, 10);
			pstmt.setString(2, "Rahul");
			pstmt.setInt(3, 789);
			pstmt.execute();
			
		con.commit();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			con.rollback();
			e.printStackTrace();
		}finally {
		con.close();
		}
	}
}
