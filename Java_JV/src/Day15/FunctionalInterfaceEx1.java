package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>list = new ArrayList<Student>();
		list.add(new Student(1,1,1, "홍길동", 90, 80, 70));
		list.add(new Student(1,1,2, "임꺽정", 100, 100, 100));
		list.add(new Student(1,1,3, "고길동", 60, 50, 60));
		// 학생들의 학년 반 이름 출력
		print(list, s -> {
			System.out.println(s.getGlade() + "학년" + s.getClassNum() + "반"
										+ s.getName() + "번호" + s.getName());
		});
		// 학생들의 국어,영어,수학 성적 출력
		print(list, s -> {
			System.out.println(s.getName() + "국어 - " + s.getKor() 
										   + "영어 - " + s.getEng()
										   + "수햑 - " + s.getMath());
		});
		// 학생들의 국어 총점
		System.out.println("국어 ");
		printTotalScore(list, (s)->{ s.getKor());
			return s.getKor();
		});
		// 학생들의 영어 총점
		System.out.println("영어 ");
		printTotalScore(list, (s)->{ s.getEng());
			return s.getEng();
		});
		// 학생들의 수학 총점
		System.out.println("수학 ");
		printTotalScore(list, (s)->{ s.getMath());
			return s.getMath();
		});
		
		// 1학년 학생들의 정보를 출력
		printStudent(list,s->s.getGrade()==1);
		// 국어 성적이 50점 이상인 학생들의 정보를 출력
		printStudent(list,s->s.getkor()>=60);
		// 평균이 85점 이상인 학생들의 정보를 출력
		printStudent(list,s->
		(s.getKor() + s.getEng() + s.getMath())/3.0  >= 85);
	}
	
	
	public static void print(List<Student>list, Consumer<Student>consumer) {
		for(Student student : list) {
			consumer.accept(student);
		}
	}
	public static void printTotalScore(List<Student>list, Function<Student, Integer> op) {
		int total = 0;
		for(Student std : list) {
			total += fn.apply(total, std);
		}
		System.out.println("총점 : " + total);
	}
	
	public static void printScore(List<Student>list, Predicate<Student>p) {
		for(Student std : list) {
			if(p.test(std)) {
				System.out.println(std);
			}
		}
		
	}
	
}


@Data
@AllArgsConstructor
class Student{
	public String getGlade() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMath() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEng() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getKor() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getClassNum() {
		// TODO Auto-generated method stub
		return null;
	}
	int grade, classNum, num;
	String name;
}