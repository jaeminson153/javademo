package java021_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JdbcTest() {
	
	}
	
	public void process() {
		try {
			//1. 드라이버 연동
			Class.forName("oracle.jdbc.OracleDriver");
			
			// db 서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			
			conn = DriverManager.getConnection(url, username, password);
						
			
			//3. 쿼리문 실행을 위한 Statement 객체를 생성 
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행.   update, insert , delete 는 excuteUpdate() 읠 리턴타입은 int 
			// select 는 executeQuery() 의 리턴타입은 ResultSet ;
			String sql = "select * from mem";
			rs = stmt.executeQuery(sql);			
			//System.out.println(rs.getRow());
			
			//5. 쿼리의 결과 출력
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String loc = rs.getString("loc");
				int age = rs.getInt("age");
				System.out.printf("num:%d, name:%s, age:%d, loc:%s\n",num,name,age,loc);				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}						
			}
		}
	}
}
