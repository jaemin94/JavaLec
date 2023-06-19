package Day22;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class C04PrintStreamEx {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test1.txt");
		PrintStream pout = new PrintStream(out);
		
		pout.println("[프린트 보조 스트림사용 확인!]");
		pout.println("[프린트 보조 스트림사용 확인!]");
		
		pout.flush();
		pout.close();
		
	}

}
