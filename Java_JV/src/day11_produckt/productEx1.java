package day11_produckt;

import java.util.Scanner;

public class productEx1 {
	
	private static Scanner scan = new Scanner(System.in);
	private static product[]list = new product[10];
	private static int count = 0;
	private static int i; 
	private static product[] salelist = new product[10];
	private static int saleCount = 0;
		
	public static void main(String[] args) {
		/* 제품을 관리하는 프로그램을 구현하시오
		 * 메뉴
		 * 1. 제품 입고
		 * 	- 제품을 판매하기 위해 다른 곳에서 제품을 구매
		 * 2. 제품 판매
		 * 	- 입고된 제품을 판매
		 * 3. 제품 수정 [가격]
		 * 4. 매출 내역조회
		 * 	- 일자별로 조회
		 * 5. 종료
		 */
		
		// 반복문 : 프로그램 종료 선택전까지
		int menu;
		do {
			// 메뉴 출력
			printMenu();
			// 메뉴 선택
			menu = scan.nextInt();
			// 선택 메뉴에 맞는 기능 실행
			runMenu(menu);
		}while(menu != 5);
		// 프로그램 종료 안내문구
		System.out.println("프로그램 종료");
		
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			storeProduct();
			break;
		case 2:
			saleProduct();
			break;
		case 3:
			updataproduct();
			break;
		case 4:
			printSaleList();
			break;
		case 5:
			break;
			default:
				System.out.println("잘못된 메뉴 입니다.");	
		}
	}
	private static void printSaleList() {
		// 매출내역 조회
		// 반복문 : 전체 매출 내역 조회
		for(int i = 0; i<saleCount; i++) {
			// 판매 제품 정보 출력
			salelist[i].print();
		}
	}
	private static void updataproduct() {
		// 제품명 입력
		System.out.print("제품명 :");
		scan.nextLine();
		String name = scan.nextLine();
		// 제품할인 금액입력
		System.out.println("금액 : ");
		int salePrice = scan.nextInt();
		// 일치하는 제품의 할인금액을 수정
		// 반벅문 : 등록된 제품 전체
			if(list[i].equals(name)) {
			// 제품의 이름과 제품명이 같으면 
			list[i].updateSalePrice(salePrice);
				return;
				// 제품의 할인 금액을 수정후 종료
		
		// 일치하는 제품이 없다고 출력
		System.out.println("일치하는 제품이 없습니다.");
		
	}
	private static void saleProduct() {
		// 등록 제품 목록을 출력
		// 반복문 : 등록된 제품 전체
		for(int i = 0; i<count; i++) {
		list[i].print();
		}
		// 제품명 입력
		System.out.print("제품명 :");
		scan.nextLine();
		String name = scan.nextLine();	
		// 판매 개수를 입력
		System.out.print("수량 :");
		int amount = scan.nextInt();
		// 기존 제품의 수량 변경
		// 반목문 : 등록된 제품전체
		int index = -1;
		for(int i = 0; i<count; i++) {
			// 제품의 제품명과 판매한 제품명이 같으면
			if(list[i].equals(name)) {
				// 번지를 index에 저장
				index = i;
			}
		}
		// 일치하는 제품이 없으면
		if(index == -1); {
			// 매서드 종료
		System.out.println("일치하는 제품이 없습니다.");
			return;
		}
		//  제품 수량이 입력한 제품 수량보다 작으면 
		if(list[index].getAmount() < amount) {
			// 수량이 잘못됐다고 출력
			System.out.println("수량을 확인하세요.");
			// 메서드 종료
			return;
		}
		//제품 수량변경
		list[index].updateAmount(-amount);
		// 매출내역을 위해 판매 제품 리스트에 추가
		// 제품명과 입력된 제품수량을 이용하여 인스턴스를 생성
		product tmp = new product(name, amount, list[index], 
				getPrice(), list[index].getsalPrice());
		// 생성된 인스턴스를 판매 제품 리스트에 추가
		salelist[saleCount] = tmp;
		// 판매 횟수를 1증가
		saleCount++;
		System.out.println("판매가 등록되었습니다.");
	}
	private static int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void storeProduct() {
		//제품정보 입력
		System.out.print("제품명");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("수량: ");
		int amount = scan.nextInt(count);
		System.out.print("구매가격");
		int buyPrice = scan.nextInt();
		System.out.print("판매가격");
		int price = scan.nextInt();
		// 일치하는 제품정보가 있으면 수량을 변경하고 
		for(int i = 0; i<count; i++); {
			if(list[i].equals("제품명")) {
				list[i].updateAmount("수량");
				return;
			}
		}
		// 없으면 추가
		list[count] = new product(name, amount, buyPrice, price);	// 클래스명의 차이로 메서드를 불러오지 못함
		count++;
		
		// 배열이 차면 확장
		if(count == list.length) {
		list = expandList(list);
		}
	}
	/*	주어진 리스트를 확장하는 메서드
	 * @param list 확장할 매서드
	 * @param 주어진 list에 크기 10만큼 늘어난 배열을 반환
	 */
	public static product[] expandList(product[] list) {
		// 기존 commodityList 의 확장
		product[] tmpList = new product[list.length + 10];
		// 새 제품입고 명단에 덮어쓰기
		System.arraycopy(list, 0, tmpList, 0, list.length); // 재사용을 위해서 수정
		// 새 재품명단
		return tmpList;
	}
	private static void printMenu() {
		System.out.println("-------메인메뉴-------");
		System.out.println("1. 제품입고");
		System.out.println("2. 제품판매");
		System.out.println("3. 제품수정");
		System.out.println("4. 제품내역");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("메뉴선택 :");
		}
	
}