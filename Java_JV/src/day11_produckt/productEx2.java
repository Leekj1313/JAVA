package day11_produckt;
	
	/* 중복된 제품명 = X
	 * 
	 */
public class productEx2 {
	// 제품명, 수량, [금액, 구매금액, 기본판매금액, 할인금액 - 소득을 판별하기 위해]
	private String name;
	private int amount, buyPrice, price, salePrice;
	// getter, setter, 제품정보 출력, 제품할인 금액 수정
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public void print() {
		System.out.print("제품명 : " + name + ", 수량 : " + amount + 
				", 가격 : " + salePrice);
	}
	public void updateSalePrice(int price) {
		salePrice = price;
	}
	// 생성자 : 제품명, 수량, 금액이 주어진 생성자
	public productEx2(String name,int amount, int butPrice, int price) {
		this.name = name;
		this.amount = amount;
		this.buyPrice =butPrice;
		this.price = price;
		this.salePrice = price; 
	}
	public void updateAmount(int amount) {
		
		this.amount  += amount;
	}
	public boolean equals(String name) {
		return this.name.equals(name);		
	}
}
