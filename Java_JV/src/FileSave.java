import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileSave {
	
	private List<Book> list;
	
	int index;
	
	public FileSave(List<Book>list) {
		if(list == null) {
			list = new ArrayList<Book>();
		}
		this.list = list;
	}
	public boolean addTitle(String title) {
		if(list == null){
			return false;
		}
		if(index < 0) {
			list.add(new Title(title, titleList));
			return true;
		}
	Book selectedTitle = list.get(index);
	
	List<Title> selectedTitle = selectedTitle.getTitleList();
	}
	public boolean add(int price) {
		if(list == null){
			return false;
		}
		if(index < 0) {
			list.add(new price(price, priceList));
			return true;
		}
	Book selectedPrice = list.get(index);
	
	List<Price> selectedPrice = selectedPrice.getPriceList();
	}
}
