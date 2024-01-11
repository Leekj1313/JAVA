import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Book implements Serializable {
	
	private static final long serialVersionUID = 7149046893444036827L;

	private String title = "자바를 정복하자";
	private int price= 35000;
	private List<FileSave>list;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}
	@Override
	public String toString() {
		return "kh_model_vo_Book [title=" + title + ", price=" + price + "]";
	}
	public boolean addBook(String title, int price) {
		if(bookList == null) {
			return false;
		}
	}
	
}

