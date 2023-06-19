package Day21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C02FileCopyMain {

	public static void main(String[] args) throws Exception{
		
		for(String str : args) 
		{
			System.out.println(str);
		}
		
		
//		Reader in = new FileReader("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\" + args[0]);
		Reader in = new FileReader("C:\\Users\\Administrator\\Desktop\\임베디드_이재민\\IO_TEST\\Origin.txt");
		Writer out = new FileWriter("C:\\\\Users\\\\Administrator\\\\Desktop\\\\임베디드_이재민\\IO_TEST\\copy.txt");
//		Writer out = new FileWriter("C:\\\\Users\\\\Administrator\\\\Desktop\\\\임베디드_이재민\\IO_TEST\\"+ args[1]);
		
		while(true)
		{
			int data = in.read();
			if(data==-1)
				break;
			out.write((char)data);
			out.flush();
			
		}
		in.close();
		out.close();

	}

}
