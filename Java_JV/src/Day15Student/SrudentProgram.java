package Day15Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;

import day03.BreakEx1;

public class SrudentProgram implements Program {
	private static final Object[] list = null;
	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	private List<Student>list = new ArrayList<E>()
	
	@Override
	public void run() {
		int menu = 0;
		
	// 반복
		do {
		// 메뉴 출력
		printMenu();
		try {
			// 메뉴 선택
			menu = scan.nextInt();
			// 메뉴 실행
			runMenu(menu);
		}catch(InputMismatchException e) {
			System.out.println("잘못된 메뉴 입니다.");
			scan.nextLine();
		}
		}while (menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: 
			studentManagemont();
			break;
		case 2:
			scoreManagemont();
			break;
		case 3:
			printManagemont();
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}

	}
	private void printManagemont() {
		// 메뉴출력
		System.out.println("학생조회");
		System.out.println("1. 전체");
		System.out.println("2. 학년");
		System.out.println("3. 반");
		System.out.println("4. 학생");
		System.out.println("과목조회");
		System.out.println("5. 국어");
		System.out.println("6. 영어");
		System.out.println("7. 수학");
		System.out.print("메뉴 : ");
		
		int menu = scan.nextInt();
		int grade, classNum, num;
		switch(menu) {
		case 1:  printStudent(s ->true); break;
		case 2:
			System.out.println("학년 : ");
			grade = scan.nextInt();
			printStudent
			break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 7: break;
		default:
			throw new InputMismatchException();
		}
	}
	private void printStudent(Predicate<Student>P) {
		for(p.test(std : list)) {
			if(p.test(std)) {
			System.out.println(std);
		}
	}
}
private void printStudent(Function<Student,Integer>f) {
	for(p.test(std : list)) {
	System.out.println(std.getName() + " : " + f. apply(null));
	}

	private void scoreManagemont() {
		/* 과목 출력
		 * 과목 선택
		 * 성적 입력
		 * 선택한 과목에 맞는 성적을 수정
		 */
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 : ");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		System.out.println("성적 : ");
		int score = scan.nextInt()
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.print("과목 선택 : ");
		
		int subject = scan.nextInt();
		
		Student std = new Student(grade, classNum, num, " ");
		int index = list,indexOf(std);
		if(index == -1) {
			System.out.println("등록되지 않은 학생 입니다");
			return;
		}
		switch(subject) {
		case 1: list.get(index).setKor(score); break;
		case 2: list.get(index).setEng(score); break;
		case 3: list.get(index).setMath(score); break;
		default:
			throw new InputMismatchException();
		}
		System.err.println("성적 수정이 완료되었습니다");
		// 확인용 System.out.println(list.get(index));
		
	}

	private void searchManagemont() {
		switch(menu) {
		case 1: 
			System.out.println("학생조회");
			studentSearch();
			break;
		case 2: 
			System.out.println("성적조회");
			subjectSearch();
			break;
		default:
			return;
		
	}

	private void insertStudent() {
		/* 입력받은 정보로 인스턴스를 생성 std
		 * std 가 리스트에 있는지 확인해서 없으면 추가
		 * contains 는 object.equals(a,b)를 호출해서 a와 b의 클래스가 같으면
		 * a.equals(b)를 이용하여 있는지 없는지 확인
		 * 있으면 이미 등록했다고 알림
		 */
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 : ");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		System.out.println("이름 : ");
		scan.nextLine();
		String name = scan.toString();
		Student std = new Student(classNum,num,name);
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("학생을 등록했습니다");
			return;
		}
		System.out.println("이미 등록된 학생입니다");
	}
	private void subjectManagemont() {
		printSubjectMenu();
	}

	private void printSubjectMenu() {
		System.out.println("--------성적관리---------");
		System.out.println("1. 성적 수정");
		System.out.println("2. 성적 삭제");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");
	}

	private void studentManagemont() {
		printSubMenu();
		int menu = scan.nextInt();
		runSubMenu(menu);
		
		
	}

	public void runSubMenu(int menu) {
		String std;
		switch(menu) {
		case 1:
			System.out.println("학생 추가");
			insertStudent();
			break;
		
		case 2:
			System.out.println("학생 수정");
			studentUpdate();
			break;

		case 3:
			System.out.println("학생 삭제");
			studentDelete();
			break;
			
		default:
			System.out.println("뒤로 돌아갑니다");
			return;
			}		
	}
	private void studentDelete() {
		/* 삭제할 학년, 반, 번호를 입력
		 * 학생 인스턴스를 생성
		 * 삭제 요청 후 삭제되면 삭제되었다고 알림, 안되면 안댄다고 알림
		 */
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 : ");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		
		Student std = new Student(grade, classNum, num, " ");
		if(list.remove(std)) {
			System.out.println("학생 정보가 삭제되었습니다");
		}else {
			System.out.println("등록되지 않은 학생 정보입니다");
		}
	}
	private void studentUpdate() {
		/* 기존 학년, 반, 번호를 입력
		 * 기존 학년,반,번호와 일치하는 학생 인스턴스를 가져옴
		 * 수정할 학년, 반, 번호, 이름을 입력
		 * 수정할 학생 인스턴스를 생성
		 * 수정할 학생 정보가 등록되었는지 확인해서 있으면 알림 후 종료
		 * 수정할 학생 인스턴스에 기존 학생 성적들을 업데이트하고
		 * 기존 학생 정보를 삭제
		 * 수정할 학생 정보를 리스트에 추가
		 */
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 : ");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		
		Student std = new Student(grade, classNum, num, " ");
		
		int index = list.indexOf(std);
		if(index == -1) {
			System.out.println("등록되지 않은 학생입니다");
			return;
		}
		std = list.get(index);
		System.out.println("수정할 학년 : ");
		grade = scan.nextInt();
		System.out.println("수정할 반 : ");
		classNum = scan.nextInt();
		System.out.println("수정할 번호 : ");
		num = scan.nextInt();
		System.out.println("수정할 이름 : ");
		scan.nextLine();
		String name = scan.toString();
		
		Student newStd = new Student(grade, classNum, num, name);
		
		if(list.contains(newStd)) {
			System.out.println("이미 등록된 학생 정보이므로 수정할 수 없습니다");
			return;
		}
		newStd.setKor(std.getKor());
		newStd.setEng(std.getEng());
		newStd.setMath(std.getMath());
		
	list.remove(index);
	list.add(newStd);
	
	list.sort((o1,o2)->{
		if(o1.getGrade() != o2.getGrade();
	}
	if(o2.getClassNum() != o2.getClassNum()) {
		return o1.getClassNum() - o2.getClassNum();
	}
	return o1.getNum() - o2.getNum();
	});
	}
	System.out.println("학생정보가 수정되었습니다");
	}	
	

	private void printSubMenu() {
		System.out.println("--------학생관리---------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void printMenu() {
		System.out.println("----------메뉴----------");
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");

	}

	
}


