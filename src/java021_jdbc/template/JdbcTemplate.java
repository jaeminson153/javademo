package java021_jdbc.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Expression Edition : xe
 * Enterprise Edition : orcl
 */
public class JdbcTemplate {
	public static Connection getConnection() {
		Connection conn = null;
		
		//1. 드라이버 연동
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// db 서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			
			conn = DriverManager.getConnection(url, username, password);				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		
		return conn;
	}
	
	public static boolean isConnection(Connection conn) throws SQLException {
		boolean valid = true;
		if(conn == null || conn.isClosed()) {
			valid = false;
		}
		return valid;
	}
	
	public static void close(ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Statement stmt) {
		if(stmt != null)
			try {
				stmt.clearBatch();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Connection conn) {
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void commit(Connection conn) {
		try {
			if(isConnection(conn))				
				conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(isConnection(conn))
				conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
