package fishShop;

public class Fish {
	private String name;
	private int price;
	private String gender;
	private int age;
	public Fish() {
		super();
	}
	public Fish(String name, int price, String gender, int age) {
		super();
		this.name = name;
		this.price = price;
		this.gender = gender;
		this.age = age;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void FishCard() {
		System.out.println("Balık Bilgilendirme Kartı");
		System.out.println("Balık Türü:"+this.getName());
		System.out.println("Balık Yaşı:"+this.getAge()+"Aylık");
		System.out.println("Cinsiyeti:"+this.getGender());
		System.out.println("Fiyatı:"+this.getPrice());
		System.out.println(" ");
	}
}
