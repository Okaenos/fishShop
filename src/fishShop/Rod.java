package fishShop;

public class Rod {
	private String name;
	private int length;
	private int reelDistance;
	private int price;
	public Rod() {
		super();
	}
	public Rod(String name, int length, int reelDistance, int price) {
		super();
		this.name = name;
		this.length = length;
		this.reelDistance = reelDistance;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getReelDistance() {
		return reelDistance;
	}
	public void setReelDistance(int reelDistance) {
		this.reelDistance = reelDistance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void RodCard() {
		System.out.println("Olta Bilgisi");
		System.out.println("Olta İsmi:"+this.getName());
		System.out.println("Olta Uzunluğu:"+this.getLength());
		System.out.println("Olta Makara Uzunluğu:"+this.getReelDistance()+"m");
		System.out.println("Olta Fiyatı:"+this.getPrice());
		System.out.println(" ");
	}
	
}
