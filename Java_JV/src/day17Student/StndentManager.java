package day17Student;

import java.util.ArrayList;

import lombok.Data;

@Data
public class StndentManager {

		private ArrayList<Student> list = new ArrayList<Student>();
		
		/* 학생 정보가 주어지면 학생 정보를 추가하는 메서드 
		 * -> 학년,반,번호 중복이 있는 경우 학생 정보를 추가하지 않음
		 * @param student 학생정보
		 * @return 학생 정보를 추가했는지에 대한 여부
		 */
		public boolean insertStudent(Student std) {
			if(list.contains(std)) {
				return false;
			}
			list.add(std);
			// 학년, 반, 번호 순으로 정렬
			sort();
			
			return true;
		}
		/* 가지고 있는 학생 정보들을 정렬하는 메소드
		 * 
		 */
		public void sort() {
			list.sort((s1, s2)-> {
				if(s1.getgrade() != s2.getgrade();
				return s1.getgrade() - s2.getgrade();
				}
			if (s1.getclassNum() != s2.getclassNum()) {
				return s1.getclassNum() - s2.getclassNum();
				}
				return s1.getNum() - s2.getNum();
			});
		}
	
		// 학생 정보 출력
		public void printAll() {
			list.stream().forEach(s ->System.out.print(s));
}
		public void setList(ArrayList<Student>list) {
			if(list == null) {
				return;
			}
			this.list = list;
			}
		}
