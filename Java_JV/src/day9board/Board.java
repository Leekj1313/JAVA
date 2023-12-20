package day9board;
// 게시글 관라를 위한 board 클래스를 정의하시오
// 필요한 멤버변수와 메소드를 추가
public class Board {
	/* 정보 		: 게시일, 제목, 내용, 번호, 작성자, 조회수
	 * 기능		: 게시글 정보를 출력(목록조회), 게시글 정보를 출력(상세조회), getter와 setter, 게시글 수정
	 * 			: 게시글 목록에서 게시글 정보를 출력하는 메소드
	 * 			: 번호 제목 작성일 작성자 조회수 순으로 출력
	 * 셍성자		: 게시글 번호, 제목, 내용, 작성자, 게시일이 주어진 생성자
	*/ 
	private int num, views; // ALT+Shift+s => Generate gatter and setter 선택
	private String title, contents, writer, date;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void printLnfo() {
		System.out.print(num + ". ");
		System.out.print(title + " ");
		System.out.print(date + " ");
		System.out.print(writer + " ");
		System.out.print(views + "\n ");
		//System.out.println();		
		}
	 /*번호 : 2
	 *   제목 : num
	 *   내용 : title
	 *   일자 : date
	 *   작성자: writer
	 *   조회수: views
	 *   순으로 출력
	 */
	public void printIntoDetail() {
		System.out.print("번호"+ num);
		System.out.print("제목" + title);
		System.out.print("내용" + contents);
		System.out.print("일자" + date);
		System.out.print("작성자" + writer);
		System.out.print("조회수" + views);
		}
	/* 수정할 제목과 내용이 주어지면 게시글의 제목과 내용을 수정하는 메소드
	 * @param title1 수정할 제목
	 * @param contents1 수정할 내용
	 */
	public void update(String title1, String contents1) {
		title = title1;
		contents = contents1;
	}
	// 생성자 : 게시글 번호, 제목, 내용, 작성자, 게시일이 주어진 생성자
	
	// boad의 배열이 필요
	// 순서대로 배열된 내용들을 입력
			// 등록하는 인원수 통제
	// 입력한 내용들을 저장
			// 내용의 양을 결정
	// 저장된 입력사항을 게시판에 출력
	// 게시판 내용확인
	public Board(int num, String title, String contents, String writer, String date) {
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
	}

	
}
