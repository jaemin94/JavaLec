package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class C05Select {

	public static void main(String[] args) {
		
		// 연결정보 저장용 변수
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/tempdb";
		
		// JDBC 참조변수
		Connection conn = null;			// DB연결용 참조변수
		PreparedStatement pstmt = null;	// SQL 쿼리 전송용 참조변수
		ResultSet rs = null;			// SQL 쿼리 결과(Select 결과) 수신용 참조변수
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");		// 드라이버 적제
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected");
			
			pstmt = conn.prepareStatement("select * from tbl_students");
			rs = pstmt.executeQuery();
			
			if(rs != null)
			{
				
			while(rs.next())
			{
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("addr") + " ");
				System.out.print(rs.getString("phone") + "\n");
			}
			
			}
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally							
		{
			try 
			{
				rs.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			try 
			{
				pstmt.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			try
			{
				conn.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		
	}

}
