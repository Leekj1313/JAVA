package wordRepit;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

// 단어장
@ToString
public class Vocabulary {
	
	private List<Word> list; // 단어리스트

	public Vocabulary(List<Word> word) {
		if(list == null) {
			list = new ArrayList<Word>();
		}
		this.list = word;
	}
	
	// 단어 추가기능
	public boolean addWord(String word, String partOfSpeech, String mean) {
		if(list == null) { // 항상 이변체크하기
			return false;
		}
		// 이미 등록된 단어이고, 뜻도 등록되었으면 
		// index = 해당하는 번지를 알려줌
		int index = list.indexOf(new Word(word));
		if(index >= 0 && list.get(index).getMeanList().contains(new Mean(mean))) {
			return false; // 단어도 중독되고 뜻도 중복되어 기능하지 않음
		}
		// 이미 등록된 단어이면
		if(index >= 0) {
			list.get(index).addMean(index, partOfSpeech, mean);
			return true;
		}
		// 새로 추가된 단어이면
		list.add(new Word(word, partOfSpeech, mean));
		
			return true;
	}
	// 단어수정 기능
	public boolean setword(String oldWord,String newWord) {
		// list 가 없으면
		if(list == null) { // 안정적인 코드 처리를 위한 null
			return false;
		}
		// 이미 등록된 단어이면
	
		if(list.contains(new Word(newWord))) {
			return false;
		}
		int index = list.indexOf(new Word(oldWord));
		if(index < 0) {
			return false;
		}
		// 수정
		list.get(index).setWord(newWord);
		return true;
	}
	// 단어 삭제 기능
	public boolean removeWord(String word) { 
		// 리스트가 비어 있으면
		if(list == null) { // 이 부분 놓침
			return false;
		}
		return list.remove(new Word(word));
	}
	
	public Word getWord(String word) {
		Word selectedWord = list.get(index);

		int index = list.indexOf(new Word(word));
		/*if(index < 0) {
			
		return null;
		}
		return list.get(index);
		*/
		return index < 0 ? null : list.get(index); // 위의 네줄을 한줄로 요약
	}
	
}