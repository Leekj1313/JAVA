package dat18.socket1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import day03.BreakEx1;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
	
	private Socket socket;
	
	public void recive() {
		Thread t = new Thread(()->{
			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(socket.getInputStream());
					while(true) {
						String str = ois.readUTF();
					if(str.equals("-1")) {
					break;
					}
					System.out.println(str);
				}
				System.out.println("읽기 기눙이 정상 종료됩니다.");
			}catch (Exception e) {
				System.out.println("예외가 발생하여 읽기 기능을 종료합니다.");
		}
		
	});
		t.start();
		/*Thread t1 = new Thread(Runnable()) {
			<< 람다식 이용 연습 = 코드의 단순화
			@Override
			pubilc void run() {
			}
		});*/
	}
	public void send() {
		Thread t = new Thread(()->{
			ObjectOutputStream oos = null;
				try {
					oos = new ObjectOutputStream(socket.getOutputStream());
						Scanner scan = new Scanner(System.in);
						while(true) {
							String str = scan.nextLine();
							oos.writeUTF(str);
							oos.flush();
							if(str.equals("-1")){
								break;
							}
						}
						System.out.println("전송 기능이 정상적으로 종료됩니다.");
					}catch (Exception e) {
						e.printStackTrace(); // 예외발생 추적
						System.out.println("예외가 발생해서 전송 기능을 종료합니다.");
					
					}
				});
					t.start();
		}
}
