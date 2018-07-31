package test.mysql.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	
	static final String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
	static final String user = "hbstudent";
	static final String pass = "hbstudent";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println(conn);
			System.out.println("connect successfuly");
		}catch(Exception ex){
			System.out.println("exception: "+ex);
		}
	}

}
