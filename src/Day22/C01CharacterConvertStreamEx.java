package Day22;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// 보조스트림
// 기본스트림에 용도에 따른 부가적인 기능을 추가하는 스트림

// InputStreamReader	: 바이트 스트림을 문자 스트림으로 변경
// OutputStreamWriter	: 바이트 스트림을 문자 스트림으로 변경
public class C01CharacterConvertStreamEx {

	public static void main(String[] args) throws Exception{
		
//		String str = "문자 변환 스트림 사용";
//		FileOutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test.txt");
//		BufferedOutputStream bout = new BufferedOutputStream(out);
//		OutputStreamWriter wout = new OutputStreamWriter(out);
//		
//		wout.write(str);
//		wout.flush();
//		wout.close();
		
		FileInputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		InputStreamReader rin = new InputStreamReader(in);
		
		char[] buffer = new char[100];
		while(true)
		{
			int cnt = rin.read(buffer);
			if(cnt == -1)
				break;
			System.out.println(buffer);						
		}
		
		
		
	}

}
