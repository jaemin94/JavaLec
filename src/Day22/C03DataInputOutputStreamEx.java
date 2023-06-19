package Day22;

import java.io.DataInputStream;
import java.io.FileInputStream;

// DataInputStream	: byte 데이터를 가져올때 기본 자료형으로 단위로 받아올수 있다.
// DataOutputStream	: byte 데이터를 파일로 저장할때 기본자료형 단위로 저장 가능

public class C03DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception{
		
//		FileOutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test1.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		
//		dout.writeUTF("홍길동");
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		
//		dout.writeUTF("이상중");
//		dout.writeDouble(55.5);
//		dout.writeInt(200);
//		
//		dout.flush();
//		dout.close();
//		out.close();
		
		FileInputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\test1.txt");
		DataInputStream din = new DataInputStream(in);
		
		for(int i = 0; i < 2; i ++)
		{
		String name = din.readUTF();
		double dval = din.readDouble();
		int val = din.readInt();
		
		System.out.printf("%s %f %d\n", name, dval,val);
		}
		
	}

}
