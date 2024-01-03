package day17Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MulticastSocket;
import java.util.InputMismatchException;
import java.util.Scanner;

import program;
public class StudentProgram implements program {

	private StudentManager sm = new StudentManager();
	private Scanner scan = new Scanner(System.in);
	private int EXIT = 3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int menu = 0;
		String fileName = "src/day17/student/student.txt";
		//불러오기
		load(fileName);
		do {
			// 메뉴 출력
			printMenu();
			try {
				// 메뉴 선택
				menu = scan.nextInt();
				// 메뉴 실핼
				runMenu(menu);
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
		//저장
		save(fileName);
	}

	private void load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName); 
			ObjectInputStream ois = new ObjectInputStream(fis)){
			sm.setList((ArrayList<Student>ois.read.object());
			System.out.println("불러오기에 성공했습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		}
		
	}
	private void save (String fileName) {
	private void save() {
		try(FileOutputStream fos = new FileOutputStream(); 
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(sm.getList());
			System.out.println("저장이 되었습니다.");
		} catch (FileNotFoundException e) {
			// 폴더 경로가 잘못된 경우
			System.out.println("저장된 위치에 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		}
		
		}
	}

	@Override
	public void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회[전체]");
		System.out.println("3. 종료");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");

	}

	@Override
	public void runMenu(int Menu) {
		switch(menu) {
		case 1: 
			 insertStudent();
			break;
		case 2:
			// StudentManager 를 통해 출력
			sm.printAll();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			throw new InputMismatchException();
				
		}

	}

	private void insertStudent() {
		// 학생 정보입력
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print(" 반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		String name = scan.next();
		// 학생 객체생성
		Student std = new Student(grade, classNum, num, name);
		// 추가를 해서 성공하면 알림, 실패하면 살패 알림
		if(sm.insertStudent(std)) {
			System.out.println("학생을 추가했습니다.");
			return;
		}
		System.out.println("이미 중복된 학생 입니다.");
		
	}

}
