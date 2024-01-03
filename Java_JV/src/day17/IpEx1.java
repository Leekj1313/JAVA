package day17;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IpEx1 {

	public static void main(String[] args) {
		InetAddress address = null;
		
		try {
			// localhost 는 내부 IP를 의미하고, 모든 PC가 동일
			address = InetAddress.getByName("localhost");
			System.out.println(address);
			
			// 네이버의 아이피 주소 중 하나를 조회

			} catch (UnknownHostException e) {
			System.out.println("해당하는 이름과 일치하는 IP 정보를 찾을 수 없습니다");
			
			address = InetAddres.getByName("www.naver.com");
			System.out.println(address);
			
			address = InetAddress.getByLocalHost();
			System.out.println(address);
			
			InetAddress [] addressesList = InetAddress.getAllByName("www.naver.com");
			Arrays.stream(addressesList).forEach(addr -> System.out.println(addr););
		}

	}

}
