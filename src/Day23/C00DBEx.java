package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C00DBEx {

	//DB정보
		static String id="root";
		static String pw="1234";
		static String url="jdbc:mysql://localhost:3306/tempdb";
		//JDBC참조변수	
		static Connection conn=null;			// DB연결용 참조변수
		static PreparedStatement pstmt = null;	// SQL쿼리 전송용 참조변수
		static ResultSet rs = null;			// SQL쿼리 결과(SELECT결과) 수신용 참조변수
	
		public static void ConnectionDB() throws Exception
		{
			// 연결시 사용
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected");
			
		}
		public static void DisConnectDB() throws Exception
		{
			// 연결 해제시				
				conn.close();
		}
		
		public static boolean InsertDB(String product_id,String product_name,int amount) 
		{	
			int result =0;
			try
			{
				pstmt = conn.prepareStatement("insert into tbl_products values(?,?,?)"); // 값은 밖에서 넣어준다
				pstmt.setString(1,product_id);
				pstmt.setString(2,product_name);
				pstmt.setInt(3,amount);
				result = pstmt.executeUpdate();
				if(result > 0 )
				{
					return true;
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
					pstmt.close();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
			}
			return false;
		}
		
	public static void main(String[] args) {
		
		try 
		{
			ConnectionDB();
		
			InsertDB("3","컴퓨터",5);
			InsertDB("4","노트북",7);
			DisConnectDB();
		}
		catch (Exception e) 
		{			
			e.printStackTrace();
		}

	}

}
