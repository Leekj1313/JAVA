package day10.word;

public class Word {
	
	private String word;
	private String meaning;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	/* wordClass 
 		* word : 영단어
 		* meaning : 뜻
 		* 단어확인
	 */
	public void print() {
		System.out.println(word + " : " + meaning);
	}
	/* 뜻이 주어지면 뜻을 수정하는 기능
	 * @param meaning 수정할 뜻
	 * 
	 */
	public void Update(String meaning) {
		this.meaning = meaning;
	}
	/* 단어가 주어지면 주어진 단어와 내 단어가 같은지 다른지를 알려주믄 매소드
	 * @param word 같은지 다른지를 확인할 단어
	 * @return 주어진 word와 내 word가 같으면 true, 다르면 false return
	 */
	
	public boolean equals(String word) {
		return this.word.equals(word);
	}
	// 주어진 단어와 뜻으로 단어와 뜻을 초기화 하는 생성자
	public void word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
}
