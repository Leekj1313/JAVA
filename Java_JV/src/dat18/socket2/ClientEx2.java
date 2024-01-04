package dat18.socket2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx2 {

	public static void main(String[] args) {
		int port = 5001;
		String ip = "192.168.30.196";
		try {
			Socket socket = new Socket(ip,port);
			Client client = new Client(socket);
			client.send();
			client.recive();
		} catch (Exception e) {
			System.out.println("예외가 발생하여 종료합니다");
		}
		
	}

}
