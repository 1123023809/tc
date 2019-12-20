package com.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123123");
		Statement yuju=conn.createStatement();
		String sql="update tc set email='jack@qq.com' where id=1";
		yuju.execute(sql);
	}

}
