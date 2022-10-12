package fishShop;

public class Aquarium {
	private String name;
	private int price;
	private int length;
	private String type;
	public Aquarium() {
		super();
	}
	public Aquarium(String name, int price, int length, String type) {
		super();
		this.name = name;
		this.price = price;
		this.length = length;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void AquariumCard() {
		System.out.println("Akvaryum Bilgisi");
		System.out.println("Akvaryum İsmi:"+this.getName());
		System.out.println("Akvaryum Uzunluğu:"+this.getLength()+"m");
		System.out.println("Akvaryum Türü:"+this.getType());
		System.out.println("Akvaryum Fiyatı:"+this.getPrice());
		System.out.println(" ");
	}
	

}
