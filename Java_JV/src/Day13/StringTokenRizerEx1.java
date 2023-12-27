package Day13;

public class StringTokenRizerEx1 {

	public static void main(String[] args) {
		String fruits = "사과, 배, 오렌지";
		String [] fruit = fruits.split(",");
		
		// String 클래스에서 제공하는 split을 이용
		String  [] fruit = fruits.split(",");
		for(String tmp : fruit) {
			System.out.println(tmp);
		}
		// StringTokenRizer 이용
		StringTokenRizer st = new StringTokenRizer(fruits, ",");
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
		
		
		
	}

}
