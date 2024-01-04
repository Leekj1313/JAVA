package day18.student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class SeverMain {

	public static void main(String[] args) {
		
		private static List<student> list;
		private static String fileName = "src/day18/student/list.txt";
		
		int port = 5001;
		load();
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			while(true) {
				Thread t = new ServerThread(ServerSocket.accept(),list);
				t.start();
				save();
			}
		}catch (IOException e) {
			System.out.println("[예외가 발생되어 서버를 종료합니다.]");
		}
		
	}
				
	}private void load() {
		
	
		try {
			ObjectInputStream fois =
					new ObjectInputStream ois(new FileInputStream(fileName));
			list = (List<student>)fois.readObject();
			
		}catch (IOException | ClassNotFoundException e) {
			list = new ArrayList<student>();
			e.printStackTrace();
		}
	}
		}
		@RequiredArgsConstructor
		class SeverThread extends Thread{
			@NonNull
		}
			private Socket socket;
			@NonNull
			List<student> list; // 			
			public void run() {
				try{
					// 클라이언트가 요청한 기능을 실행
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
					// 클라이언트가 요청한 기능을 입력
					ObjectOutputStream oos = new ObjectOutputStream(socket.OutputStream());
					String menu = ois.readUTF();
					// 요청한 기능 실행
					switch(menu) {
					case"LOAD":
						break;
					} catch (IOException e) {
						e.printStackTrace();
					}
				}private void load() {
				try {
						oos.writeObject(list);
						oos.flush();
					} catch (IOException e) {
						e.printStackTrace();
			


}
			}
		}
