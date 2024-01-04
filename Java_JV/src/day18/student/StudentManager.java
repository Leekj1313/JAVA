package day18.student;

import java.util.ArrayList;

import day8access1.Student;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StudentManager {
	
	

	public static void main(String[] args) {
	// 학생 정보 배열	
	private ArrayList<Student> list = new ArrayList<Student>();
		
	public boolean insertStudent(Student std) {
		// 중복체크	
		if(list.contains(std)) {
			return false;
		}// 아니면 추가
		list.add(std);
		return false;
		}	
	public void printStudent() {
		list.stream().forEach(s -> System.out.print(s));
			
		
	}
		
	}
}
	
}