package day11_produckt;

public class produckt {
	
	String commodity;
	int price;
	int commodityNum;
	
	public int getCommodityNum() {
		return commodityNum;
	}
	public void setCommodityNum(int commodityNum) {
		this.commodityNum = commodityNum;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// 상품의 상품명과 가격을 출력
	public void print() {
		System.out.print(commodityNum + commodity + " = " + price);
	}
	// 상품영이 주어지면 주어진 상품명과 내 상품명의 동일여부를 알려주는 메서드
	public void Update(int price) {
		this.price = price;
	}
	// @param commodity 같은지 다른지를 확인
	// @return 주어진 상품명과 내 상품명이 같으면 true, 다르면 false return
	public boolean equals(String commodity) {
		return this.commodity.equals(commodity);
	}
	// 주어진 상품명과 가격을 바탕으로 최신화를 시켜주는 생성자
	public void commodity(String commodity, int price) {
		this.commodity = commodity;
		this.price = price;
	}

}
