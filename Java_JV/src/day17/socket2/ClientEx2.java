package day17.socket2;

import java.io.IOException;

public class ClientEx2 {

	public static void main(String[] args) {
		// ip, port 번호 설정
				String ip = "192.168.30.196";
				int port = 5001;
				
		
				// 1. ip 와 port 를 이용해 소켓 생성 및 대기
				try(Socket socket = new Socket(ip, port)) {
					// 2. 연결 요청
					socket.connect(new InetSocketAddress(ip, port));
					// 3. 작업
					System.err.println("연결성공");
					Thread receiveThread = new thread(()->{
						try(ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
						while(true) {
							String str = ois.readUTF();
						if(str.equals("-1")) {
							break;
							}
					
				} catch (UnknownHostException e) {
					System.out.println("연결할 수 없습니다.");
				} catch (IOException e) {
					System.out.println("예외발생");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				System.out.println("서버 : 메인 기능 종료");

			}

		}

	}

}
