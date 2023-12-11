package day02;

public class TestEx1 {
	
	//연산자 예제
	public static void main(String[] args) {
		/* 다음 코드를 이용하여 국어,영어,수학 성적의 평균을 구하여 콘솔에 출력하는 코드를 작성하세요. */
		int korScore = 100, engScore = 50, mathscore = 92;
		int sum = 0;
		double avg = 0.0;
		
		//총점
		sum = korScore + engScore + mathscore;
		avg = (double)sum / 3.0;
		System.out.println("3과목의 총합 : " + sum);
		System.out.println("3과목의 평균 : " + avg);
		
		int korScore1 = 23, engScore1 = 54, mathscore1 = 92;
		System.out.println("3과목의 점수 : " + (korScore1 + engScore1 + mathscore1));
		System.out.println("3과목의 평균점수 : " + (korScore1 + engScore1 + mathscore1)/1.5);
	}

}
