package Day26;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientReceiveThread implements Runnable{

	Socket client;
	DataInputStream din;
	
	
	ClientReceiveThread(Socket client)
	{
		this.client = client;
	}
	
	@Override
	public void run() {
		
		try {
			din = new DataInputStream(client.getInputStream());
		String recv = null;
		
		while(true)
		{			// 수신
			recv = din.readUTF();
			if(recv.equals("q") || recv == null)
				System.exit(-1);
				System.out.println("[Server]: "+recv);	
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			

}
	

}
