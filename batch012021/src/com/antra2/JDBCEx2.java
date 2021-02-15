package com.antra2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx2 {

	public static void main(String[] args) throws SQLException {
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id:");
		int id=sc.nextInt();
		System.out.println("please enter name:");
		String name=sc.next();
		System.out.println("please enter sal:");
		int sal=sc.nextInt();
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "manas");
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, sal);
		pstmt.execute();
		con.close();
		
		/*Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into employee values("+id+","+"'"+name+"'","+sal+")");
*/	}
}
