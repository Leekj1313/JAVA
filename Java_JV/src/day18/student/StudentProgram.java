package day18.student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

import program.program;

public class StudentProgram implements program {

	private Scanner scan = new Scanner(System.in);
	private int EXIT = 3;
	private class StudentManager sm = new StudentManager sm;
	private Socket socket;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public void run() {
		String ip = "192.168.30.196";
		int port = 5001;
		// 서버와 연결
		connectServer(ip, port);
		// 서버에서 학생 정보를 불러옴
		load();
		int menu = 0;
		String fileName;
		// 불러오기 -> 서버애서 불러오기 기능생각
		do {
			// 메뉴출력
			printMenu();
			try {
				// 메뉴선택
				menu = scan.nextInt();
				// 메뉴실행
				runMenu(menu);
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				scan.nextLine(); // 입력버퍼에 잘못 입력된 값을 제거 또는 공백을 제거
			}
		} while (menu != EXIT);

	}

	
	private void connectServer(String ip, int port) {
		try {
		socket = new Socket(ip, port);
			System.out.println("[서버 연결 성공]");
		}catch (IOException e) {
			System.out.println("[서버 연결 실패]");
		}
	}
	private void load() {
		if(socket == null) {
			System.out.println("[서버애 연결되지 않아 불러올 수 없습니다.]");
		}
		try {
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("LOAD");
			oos.flush();	
			// 읽어옴	
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			List<student> list = (List<student>)ois.readObject();
			sm = new StudentManager(list);
			System.out.println("[불러오기 성공]");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("[불러오기 중 예외가 발생하였습니다.]");
			}
	}
	public void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. 학생 추가"); // 학생을 추가할 때 클라이언트에서 입력 가능케
		System.out.println("2. 학생 조회[전체]");
		System.out.println("3. 학생 수정[이름]");
		System.out.println("3. 종료");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
	}


	public void runMenu(int Menu) {
		switch(Menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			printStudent();
			break;
		case 3:
			updateStudent();
			break;
		case 4:
			exit();
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			throw new InputMismatchException();
		save();
		}

	}

	private void updateStudent() {
		// TODO Auto-generated method stub
		
	}


	private void exit() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("SAVE");
			oos.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private void save() {
		ObjectInputStream foos =
				new ObjectInputStream(new FileOutputStream(FileName));
		foos.writeObject();
	}


	private void printStudent() {
		// 메니저에게 전체 학생 정보를 출력
		sm.printStudent();
	}

	private void insertStudent() {
		// 학생 정보입력을 클라이언트로 송신 -> 
		// 학생 정보입력
		// 메니저에게 입력받은 학생 정보를 추가
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print(" 반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		// 메니저에게 입력받은 학샹 정보를 추가
		student std = new student(grade, classNum, num, name);
		if(sm.insertStudent(std)) { // 실패할 수도 있느니 if 문 사용
			System.out.println("학생을 추가했습니다.");
			sendStudent(std);
		} else {
			System.out.println("이미 중복된 학생입니다. ");
		}
	}


	private void sendStudent(student std) {
		try{
			// 클라이언트가 요청한 기능을 실행
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			// 클라이언트가 요청한 기능을 입력
			ObjectOutputStream oos = new ObjectOutputStream(socket.OutputStream());
			String menu = ois.readUTF();
			// 요청한 기능 실행
			switch(menu) {
			case"LOAD":
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}private void load() {
		try {
				oos.writeObject(list);
				oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
	
		
	}

}
