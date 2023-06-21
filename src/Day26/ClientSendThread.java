package Day26;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread implements Runnable{
	Socket client;
	Scanner sc = new Scanner(System.in);
	DataOutputStream dout;
	
	ClientSendThread(Socket client)
	{
		this.client = client;
	}
	
	@Override
	public void run() {
		
		
		try {
			dout = new DataOutputStream(client.getOutputStream());
		String send = null;
		while(true)
		{
		// 송신				
			System.out.print("[Server(q:종료)] : " );				
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				System.exit(-1);				
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
