package day17.socket2;

import java.io.ObjectOutputStream;

public class ServerEx2 {

	public static void main(String[] args) {
		int port = 5001;
		
		ServerSocket serverSocket = null;
		
		try {
			// 2. 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			// 3. 대기
			// 4. 요청 수락 후 소켓 객체 생성
			Socket socket = serverSocket.accept();
			// 작업
			System.out.println("[연결 성공]");
			Thread receiveThread = new thread(()->{
				try(ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				while(true) {
					String str = ois.readUTF();
				if(str.equals("-1")) {
					break;
					}
					System.oun.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
				}
		});
		receiveThread.start();
		// 문자열을 입력받아 클라이언트에 전송하는 쓰레드
		Thread sendThread = new Thread(()-> {
			try(ObjectOutputStream oos = new ObjectOutputStream(socket.getOutPutStream());
			Scanner scan = new Scanner(System.in);
					while(true) {
						String str = scan.nextLine();
						oos.writeUTF(str);
						oos.fiush();
						if(str.equals("-1")) {
							break;
						}
						System.out.println(str);
					}
						
					}
	}catch (IOExeption e) {
		e.printStackTrace();
	}
	System.out.println("서버 : 보내는 기능 종료");
		});
			sendThread.start();
				}catch (IOException e) {
	e.printStackTrace();
				}
				System.out.println("서버 : 메인 기능 종료");
				
