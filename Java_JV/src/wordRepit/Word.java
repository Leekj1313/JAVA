package wordRepit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.swing.plaf.basic.BasicLookAndFeel;

import lombok.Data;

// 영어 단어 하나를 의미하는 클래스
@Data
public class Word {
	
	private String word; // 단어
	private List<Mean> meanList; // 품사와 뜻 리스트
	private int views; // 조회수
	
	// equals 는 단어만 같아도 같은 단어로 판별하기 위해 재정의 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
	
	// 단어와 뜻 리스트를 출력하는 메서드
	public void printWord() {
		if(meanList == null || meanList.size() == 0) {
			System.out.println("등록된 뜻이 없습니다");
			return;
		}
		System.out.println("단어 : " + word);
		for(int i = 0; i<meanList.size(); i++) {
			System.out.println(i+1+". " + meanList.get(i)); // 해당하는 번호의 단어와 뜻을 수정
		}
	}
	
	// 뜻을 추가하는 메서드
	public boolean addMean(int pos, String partOfSpeech, String mean) {
		// 뜻을 저장하는 리스트가 생성되어 있지 않으면
		if(meanList == null) {
			return false;
		}
		// 이미 등록된 뜻이면
		if(meanList.contains(new Mean(null, mean))) {
			return false;
		}
		// 새 뜻을 추가
		meanList.add(new Mean(partOfSpeech, mean));
		return true;
	}
	// 뜻을 수정하는 메서드
	public boolean setMean(int pos, String partOfSpeech, String mean) {
		// 뜻을 저장하는 리스트가 생성되어 있지 않으면
		if(meanList == null) {
			return false;
		}
		// pos 가 잘못된 경우
		if(pos < 0 || pos >= meanList.size()) {
			return false;
		}
		if(meanList.contains(new Mean(mean))) {
			return false;
		}
		// 수정
		meanList.set(pos, new Mean(partOfSpeech, mean));
		return true;
	}
	// 뜻을 삭제하는 메서드
	public boolean removeMean(int pos) {
		if(meanList == null) {
			return false;
		}
		if(pos < 0 || pos >= meanList.size()) {
			return false;
		}
		meanList.remove(pos);
		return true;
	}
	@Override
	public String toString() {
		return "단어 : " + word + "\n" + meanList + "\n조회수 : " + views;
	}
	public Word(String word) {
		this.word = word;
	}
	public Word(String word, String partOfSpeech, String mean) {
		this.word = word;
		meanList = new ArrayList<Mean>();
		meanList.add(new Mean(partOfSpeech, mean));
	}
	
}
