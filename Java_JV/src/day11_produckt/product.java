package day11_produckt;

import java.util.Scanner;

public class product {

	private static Object[] list;
	public product(String name, int amount, int buyPrice, int price) {
		// TODO Auto-generated constructor stub
	}
	public product(String name, int amount, product product, int price, Object price2) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	private static Scanner scan = new Scanner(System.in);	
		
	/* 제품을 관리하는 프로그램을 구현하시오
		 * 메뉴
		 * 1. 제품입고
		 * 		- 제품을 판매하기 위해 다룬 곳에서 재품을 구매
		 * 2. 제품판매
		 *  	- 입고된 제품을 판매
		 * 3. 제품수정(가격)
		 * 4. 제품내역 조회
		 * 5. 프로그램 종료
		 */
		
		/* 작업정리
		 * 1. 기능
		 * 		-------메인메뉴-------
		 * 			1. 제품입고
		 * 			2. 제품선택 + 제품구매
		 * 			3. 제품수정
		 * 			4. 제품조회
		 * 			5. 프로그램 종료
		 * 			메뉴 선택 :
		 * 		--------------------
		 * 2. 틀 
		 * 메인메뉴 출력
		 * 상품의 내용입력 list 작성 => 작성된 list 에서 상품을 불러오기 getter, setter 이용
		 * 작성된 list 에서 제품 판매
		 * 		제품을 검색해서 판매하는지 / 전체 제품에서 선택하여 판매하는지
		 * 		선택된 제품을 하나씩 계산하는지 / 전체 선택상품 계산인지
		 * 		구매가 완료되면 메인 메뉴로 복귀
		 * 제품의 가격 수정
		 * 제품의 내역 조회 => 수정된 가격이 입력되었는지 확인
		 * 프로그램 종료
		 * 3.필요한 메서드
		 * 	- 메인메뉴 출력
		 *  - 기능메뉴 출력
		 *  - 입고상품 리스트 생성
		 *  - 상품리스트의 확장
		 *  - 상품메뉴 선택
		 *  - 상품선택 리스트 생성
		 *  - 상품수정 생성
		 *  - 상품삭제 생성
		 *  - 상품명의 번호와 상품명, 가격 출력
		 * 4.제한사항
		 */
		
		private static Scanner scan = new Scanner(System.in);
		int menu;
		
		// 반복문 - 메뉴선택 / 프로그램 종료선택까지 반복	
		do{	
			// 메인 메뉴출력
			printMenu();
			// 메뉴선택
			menu = scan.nextInt();
			// 선택된 메뉴에 따른 기능실행
	
		// 메인메뉴에 대한 메서드 입력
		}while(menu != 5);
		}
		private static void printMenu() {
			System.out.println("-------메인메뉴-------");
			System.out.println("1. 제품입고");
			System.out.println("2. 제품선택");
			System.out.println("3. 제품수정");
			System.out.println("4. 제품삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("메뉴선택 :");
			}
		private static void runMenu(int menu) {
			// 제품입고 기능
			switch(menu) {
			case 1:
				// 제품의 입고는 상품을 등록하는 것이 아니라 입고된 list 에서 불러오는 것
				
					// 입고된 list 를 불러오기 위해
						// 상품등록 
				System.out.println("상품입고");
				productWareHousing();
				break;
			case 2:
				System.out.println("제품선택");
				selectCommodity();
				break;
			case 3:
				System.out.println("제품수정");
				updateCommodity();
				break;
			case 4:
				System.out.println("제품삭제");
				deletCommodity();
			case 5:
				System.out.println("프로그램 종료");
				
			}	while(menu != 5);
		}
		private static void productWareHousing(); {
			// commodity 명 입력
			System.out.print("상품명 :");
			String commodity = scan.next();
			// price 입력, 상품의 명 = String
			System.out.print("가격 :");
			int price = scan.nextInt();
			// commodity 의 인스턴스를 생성, 가격의 명 = int
			commodity tmp = scan.nextLine();
			// commodity 의 인스턴스 list 에 저장
			list[count] = tmp;
			count++;
			
			if(count == list.length) {
				ExpandcommodityList();
			}
		}
		private static void ExpandcommodityList() {
			// 기존 commodityList 의 확장
			commodity[] tmpList = new commodity[list.lenght + 10];
			// 새 제품입고 명단에 덮어쓰기
			System.arraycopy(list, 0, tmpList, 0, count);
			// 새 재품명단
			list = tmpList;
		}
		private static void selectCommodity() {
			// 입고되어 있는 상품의 list 를 출력
			ExpandcommodityList();
			// 예시
			System.out.print("구매가능 상품목록");
			ExpandcommodityList(); 
			// System.out.print("1." + "사과" + " = " + " 1000원");
			// System.out.print("2." + "포도" + " = " + " 2000원");
			// System.out.print("3." + "수박" + " = " + " 8000원");		
			selectMenu();
			// 제품선택 - 제품 앞의 번호를 선택하여 구매
			System.out.print("제품선택 :");
			int num = scan.nextInt();
			// 선택된 상품의 '합'을 구하여 정산
			int [] price = num;
			// 선택된 상품의 합산 = 선택한 상품의 수가 단수 아니면 복수일 때
			sum = scan.nextInt[] +  scan.nextInt[];
			// 선택된 상품의 합산식
			System.out.println("선택된 상품의 합계 :" + sum);
			// 구매종료
			System.out.println("구매해 주셔서 감사합니다.");
				return;
			// 등록된 상품의 번호와 상품의 번호에 등록된 가격을 합산하여 식과 금액을 출력한다
		}
		private static void selectMenu() {
			// 등록한 상품의 상품번호와 상품명, 가격을 선택메뉴로 생성 후 출력
			// 선택한 상품의 가격을 합산
			System.out.print("String commodity" + "setPrice" + "원");
			System.out.print("합계" + sum);
		}
		private static void updateCommodity() {
			// 수정할 상품입력
			System.out.print("수정할 상품:");
			String commodity = scan.next();
			System.out.print("수정할 금액:");
			int price = scan.next();
				// 일치하는지 확인
				for(int i = 0; i<count; i++) {
					if(list[i].equals(commodity)) {
						list[i].Update(price);
				// 상품수정 종료문
				System.out.print("상품의 정보가 변동되었습니다.");
				return;	
				}
			}
				System.out.print("일치하는 상품이 없습니다.");
		}
		private static void deletCommodity() {
			// 삭제할 상품입력
			System.out.print("삭제할 상품 :");
			String commodity = scan.nextLine();
			// 반복문
			// 음수로 초기화. 배열의 번지는 0번지 이상
			int index = -1;
			for(int i = 0; i<count; i++) {
				// 입력한 상품명과 같을 시,
				if(list[i].equals(commodity)) {
					// 현재 위치를 index 에 저장
					index = i;
					break;
					}
				}
				// 저장된 상품의 개수를 1개 줄임	
				if(index == -1) {
					System.out.print(true);
				}
				// 일치하는 단어가 마지막이면 종료
				if(index == count) {
					return;
				
				// 현재 배열과 같은 크기의 새 배열을 생성
				commodity[] tmpList = new commodity[list.length];
				// 새 배열에 현재 배열을 복붙
				System.arraycopy(list, 0, tmpList, 0, list.length);
				/* 현재배열에서 index+1 번지부터 상품 리스트의 마지막 번지에 복사 후
				 * 새 배열에 index 번지부터 복사
				 */
				System.arraycopy(tmpList, index+1, list, index, count-index);
				}
	}
		public void getPrice() {
			// TODO Auto-generated method stub
			return ;
		}
}
