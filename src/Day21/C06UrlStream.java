package Day21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C06UrlStream {

	public static void main(String[] args) throws Exception{
		
		URL url = new URL("https://n.news.naver.com/mnews/article/469/0000744859?sid=105");
		InputStream bin = url.openStream(); // 자바 < - 브라우저 출력내용
		BufferedInputStream buffIn = new BufferedInputStream(bin); 	// 보조스트림 추가
																	// 버퍼공간을 둬서 한번에 받기
																	
		Reader r = new InputStreamReader(buffIn);					// 보조스트림 추가
																   	// byte -> char사이즈로 받아온다
		
		OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\index.html");
		Writer wout = new OutputStreamWriter(out);
		while(true)
		{
			int data = r.read();
			if(data == -1)
				break;
			System.out.print((char)data);
			wout.write(data);
		}
		
	
		

	}

}
