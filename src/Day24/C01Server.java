package Day24;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws Exception{
		
			// 192.168.2.21
			ServerSocket server = new ServerSocket(5000);
			System.out.println("[INFO] Server Socket Listening..");
			
			while(true)
			{
				Socket client = server.accept();
				System.out.println("[INFO] " + client.getInetAddress()+" 접속되었습니다.! ");
			
				OutputStream out = client.getOutputStream();
				DataOutputStream dout = new DataOutputStream(out);
				dout.writeUTF(client.getInetAddress()+" 님 접속 확인 되었습니다. by Server");
				dout.flush();
				dout.close();
			}			

			
	}

}
