package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C00PracDB {

	// DB정보
		static String id = "root";
		static String pw = "1234";
		static String url = "jdbc:mysql://localhost:3306/tempdb";
		// JDBC참조변수
		static Connection conn = null; // DB연결용 참조변수
		static PreparedStatement pstmt = null; // SQL쿼리 전송용 참조변수
		static ResultSet rs = null; // SQL쿼리 결과(SELECT결과) 수신용 참조변수
		static int result = 0;

		public static void ConnectionDB() throws Exception {
			// 연결시 사용
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 적재
			System.out.println("Driver Loading Success..");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..");
		}

		public static void disConnectDB() throws Exception {
			// 연결해제시 사용
			conn.close();
		}

		public static boolean InsertDB(String product_id, String product_name, int amount) {
			// 완성시켜야 되는 코드
			// tbl_products
			// prod_id varchar(45) , prod_name varchar(45) , amount int
			
			try {
				pstmt = conn.prepareStatement("insert into tbl_products values(?,?,?)");
				pstmt.setString(1, product_id);
				pstmt.setString(2, product_name);
				pstmt.setInt(3, amount);

				result = pstmt.executeUpdate();
				if (result > 0)
					return true;

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			}

			return false;
		}
		public static boolean UpdateDB(String product_id, String product_name, int amount)
		{
			
			//update table_name set product_name=?,amount=? where product_id=?
			try {
				pstmt = conn.prepareStatement("update tbl_products set prod_name=?,amount=? where prod_id=? ");
				pstmt.setString(1, product_name);
				pstmt.setInt(2, amount);
				pstmt.setString(3, product_id);

				result = pstmt.executeUpdate();
				if (result > 0)
					return true;

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			}
			
			return false;
		}
		public static boolean DeleteDB(String product_id)
		{
			//delete from tbl_name where product_id=?
			try {
				pstmt = conn.prepareStatement("delete from tbl_products where prod_id=?");
				pstmt.setString(1, product_id);

				result = pstmt.executeUpdate();
				if (result > 0)
					return true;

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			}
			return false;
		}
		public static void SelectAll() {
			
			//select * from tbl_name
			//print console;
			try
			{
				pstmt = conn.prepareStatement("select * from tbl_products");
				rs = pstmt.executeQuery();
				if(rs != null)
				{
					while(rs.next())
					{
						System.out.print(rs.getString("prod_id") + " ");
						System.out.print(rs.getString("prod_name") + " ");
						System.out.print(rs.getInt("amount") + "\n");
					}
				}
			}
		catch (Exception e) 
			{
			e.printStackTrace();
			} 
			finally 
			{
			try 
			{
				pstmt.close();
			} 
				catch (Exception e) {
			}
		}
			
		}
	
	public static void main(String[] args) {
		try {
			ConnectionDB();
			InsertDB("5", "컴퓨터", 5);
			InsertDB("6", "노트북", 7);
			UpdateDB("5","Computer",11);
			DeleteDB("6");
			SelectAll();
			disConnectDB();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
