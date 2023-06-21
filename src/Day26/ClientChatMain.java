package Day26;

import java.net.ServerSocket;
import java.net.Socket;

public class ClientChatMain {

	public static void main(String[] args) throws Exception{
				
				// 1 서버로 연결 요청
				Socket client = new Socket("",9999);
				
		
				// 3 송수신 쓰레드 생성
				ClientSendThread snd = new ClientSendThread(client);
				ClientReceiveThread rev = new ClientReceiveThread(client);
				Thread th1 = new Thread(snd);
				Thread th2 = new Thread(rev);
				
				
				// 4 송수신 쓰레드 실행
				th1.start();
				th2.start();
	}

}
