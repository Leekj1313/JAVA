package test;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;



/* TCP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 네트워크 프로그램을 구동하였으나 서버와 연결이 되지 않았다. 문제점이 있는 코드를 찾아 [원인](30점)에 파악된 문제점을 기술하고, 해결 방안을 구상하여 [조치내용](30점)에 해결방법을 작성하여 보고서를 완성하시오. (총 60점)
 * - 서버 IP : 192.168.20.34, 포트번호 : 3000
 */
public class test3 {
	String serverIP = "192.168.20.34"; 
	int port = 3000;

	
	try (Socket socket = new Socket(serverIP, port)){ //  try 문의 (조건식) 이 없다
		
		serverIP = InetAddress.getLocalHost().getHostAddress();
		
		}
}

