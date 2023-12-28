package Day14;

public class MassageFormatEx1 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		
		String str = "num1 = " + num1 + ", num2 = " + num2;
		System.out.println(str1);
		
		String patter = "num1 = {0}, num2 = {1}";
		String str2 = MassageFormat.format(pattern, num1, num2);
		System.out.println(str2);

	}

}
