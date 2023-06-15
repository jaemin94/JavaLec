package Day19;

import java.io.FileInputStream;
import java.util.Properties;

public class C06PropertiesMain {

	public static void main(String[] args) {
		
		// db 설정
		Properties properties = new Properties();
		
		try
		{
			FileInputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\Java수업\\src\\Day19\\ApplicationProperties");
			properties.load(in);
			
			String url=properties.getProperty("url");
			System.out.println("url: " + url);
			String username=properties.getProperty("username");
			System.out.println("username: " + username);
			String password=properties.getProperty("password");
			System.out.println("password: " + password);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
