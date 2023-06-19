package Day21;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class C03InputStreamMain {

	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test.exe");
		
		// 1byte 단위로 받기
//		while(true)
//		{
//			int data = in.read();
//			if(data == -1)
//				break;
//			System.out.println((char)data);
//		}
		
		// 문자열(UTF8)받기
		byte[] buffer = new byte[4096];
		while(true)
		{
			int bytedata = in.read(buffer); // buffer배열의 크기만큼 input으로 받아오는 byte값을 저장
											// 읽어들인 byte의 개수를 반환 -> bytedata변수가 저장
			if(bytedata == -1)		
				break;
			System.out.println(bytedata);
			System.out.println(Arrays.toString(buffer));
		}

	}

}
