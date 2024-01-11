
public class Exam {
	public static final String SUBJECT = "JAVA";
	public double score;
	
	public Exam(double score) {
		this.score = score;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public static String getSubject() {
		return SUBJECT;
	}
	public void print() {
		System.out.println(SUBJECT + "과목점수는" + score + "점 입니다");
	}
}
