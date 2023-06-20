package Day24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception {
		
		// 전화걸기
		Socket client = new Socket("192.168.2.20",5000);
		System.out.println("Server와 연결완료");
		
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		
		String recv = null;
		String send = null;
		
		while(true)
		{
			// 송신
			System.out.print("[Client]:" );
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				break;		
			// 수신
			recv = din.readUTF();
			if(recv.equals("q") || recv == null)
				break;
				System.out.println("[Server]"+recv);
			
				
		}
	}

}
