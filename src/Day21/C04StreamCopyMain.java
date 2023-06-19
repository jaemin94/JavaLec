package Day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C04StreamCopyMain {

	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\차우차우.jpg");
		OutputStream out = new FileOutputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\임베디드_이재민\\\\IO_TEST\\\\copyDog.jpg");
		
		byte[] buffer = new byte[4096];
		
		while(true)
		{
			int cnt = in.read(buffer);
			if(cnt == -1)
				break;
			
			out.write(buffer,0,cnt);
		}

	}

}
