package Day21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args)  {
		
		try 
		{
//			Writer out = new FileWriter("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test1.txt");
			Writer out = new FileWriter("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test1.txt",true);
			out.write("BBBB\n");
			out.write("CCCCC\n");
			out.write("DDDDDD\n");
			out.flush(); // 버퍼 초기화
			out.close(); // 스트림종류
		} 	
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
