package dat18.socket2;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	public static void main(String[] args) {
		int port = 5001;
		String ip = "192.168.30.196";
		try(ServerSocket serverSocket = new ServerSocket(port)){
			while(true) {
			Socket socket = serverSocket.accept();
			
			Client client = new Client(socket);
			client.send();
			client.recive();
			}
		}catch(Exception e) {
			System.out.println("서버 소켓 생성에서 에외가 발생하여 종료합니다.");
		}

	}

}
