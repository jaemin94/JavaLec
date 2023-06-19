package Day21;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C03OutPutStreamMain {

	public static void main(String[] args) throws Exception{
		
		OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test.exe");
		
		out.write("가".getBytes(StandardCharsets.UTF_8)); // 문자열을 byte 형식으로 변환
		out.write('b');
		out.write('c');
		out.flush();
		out.close();

	}

}
