package test;

import java.net.ServerSocket;

public class test4 {
	int port = 3000;
	
	ServerSocket server;

	String fileName = "src/day17/socket1/chat.txt";
	list = load(fileName);
	System.out.println(list);
	System.out.println("불러오기 성공");
	try {
		serverSocket = new ServerSocket(port);
		
		Socket socket =  serverSocket.accept();
		
	while(true) {
		Socket client = server.accept();
				
		}

	}
}
