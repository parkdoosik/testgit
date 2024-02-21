package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 공통 템플릿 : 매번 반복적으로 작성될 코드를 메소드로 정의해두는 것
public class JDBCTemplate {
	
	// * 모든 메소드들은 [static] 메소들 작성할 것
	// 싱글톤 패턴 : 메모리영역에 단 한번만 올려두고 매번 재사용하는 것
	
//	1. Connection 객체 생성(DB접속) 후 해당 Connection 객체를 반환해주는 메소드
	//	JDBC 작업 순서 : [1], [2] 해당
	public static Connection getConnection() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:thin:@localhost:1521:xe", "SEMI", "SEMI");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
//	2. commit 처리 해주는 메소드
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//	3. rollback 처리해주는 메소드
	public static void rollback(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	JDBC관련 객체 반납
//	4. Statement 관련 객체를 반납하는 메소드
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	5. Connection 객체 반납하는 메소드
	public static void close(Connection conn) {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
//	6. ResultSet 객체 반나바하는 메소드
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
























