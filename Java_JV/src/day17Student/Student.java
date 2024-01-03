package day17Student;

import java.io.Serializable;

import javax.management.loading.PrivateClassLoader;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Student {
	
	@Data // @gatter @setter @toString @EqualsAndHashCode
	@AllArgsConstructor
	public class implements Serializable{/**
		 * 
		 */
		private static final long serialVersionUID = -4186259494164119597L;
		
	}
	public static void main(String[] args) {
		
		Private int grade, classNum, num;
		private String name;

	}
	@Override
	pubilc int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	@Override
	public String toString() {
		return grade + "학년" + classNum + "반" + num + "번호" + name + "이름" + "]";
	}
}
