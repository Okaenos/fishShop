package fishShop;

public class Bait {
	private String name;
	private int price;
	private int weight;
	private String color;
	public Bait() {
		super();
	}
	public Bait(String name, int price, int weight, String color) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.color = color;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void BaitCard() {
		System.out.println("Yem Bilgisi");
		System.out.println("Yem İsmi:"+this.getName());
		System.out.println("Gramı:"+this.getWeight()+"G");
		System.out.println("Rengi:"+this.getColor());
		System.out.println("Fiyatı:"+this.getPrice());
		System.out.println(" ");
	}

}
