package day18.student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class student implements Serializable {
	
	private static final long serialVersionUID = -7967582947063977737L;
	
	private int grade, classNum, num;
	String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	@Override
	public String toString() {
		return "[" + grade + "학년" + classNum + "반" + num + "번호" + name + "이름" + "]";
	}
}
