import Day15Student.Student;

public class Test2 {

	public static void main(String[] args) {

		Student[] sArr = new Student[2];

		// 학생 배열 추가

		 sArr[0] = new Student(0, 0, 0, null);

		         sArr[1] = new Student(0, 0, 0, null);

		// 범위 수정

		for(int i = 0; i < sArr.length; i++) {

		System.out.println(sArr[i].getScore());

		}



		}



		}