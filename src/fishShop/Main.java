package fishShop;

public class Main {

	public static void main(String[] args) {
		Fish fish1=new Fish();
		fish1.setName("Lepistes");
		fish1.setAge(8);
		fish1.setGender("erkek");
		fish1.setPrice(140);
		fish1.FishCard();
		
		Fish fish2=new Fish();
		fish2.setName("Vatoz");
		fish2.setGender("Kadın");
		fish2.setAge(10);
		fish2.setPrice(240);
		fish2.FishCard();

		Bait bait1=new Bait();
		bait1.setName("100g kekikli Balık Yemi");
		bait1.setColor("pembe");
		bait1.setWeight(100);
		bait1.setPrice(160);
		bait1.BaitCard();
		
		Bait bait2=new Bait();
		bait2.setName("1 Kilo El Karması Yem");
		bait2.setColor("sarı");
		bait2.setWeight(1000);
		bait2.setPrice(780);
		bait2.BaitCard();
		
		Rod rod1=new Rod();
		rod1.setName("Okuma Spin Olta");
		rod1.setLength(165);
		rod1.setReelDistance(890);
		rod1.setPrice(890);
		rod1.RodCard();
		
		Rod rod2=new Rod();
		rod2.setName("quick retro 360");
		rod2.setLength(150);
		rod2.setReelDistance(790);
		rod2.setPrice(980);
		rod2.RodCard();
		
		Aquarium aquarium1=new Aquarium();
		aquarium1.setName("Tuzlu Su Akvaryumu");
		aquarium1.setLength(180);
		aquarium1.setType("Dikdörtgen ");
		aquarium1.setPrice(1300);
		
		Aquarium aquarium2=new Aquarium();
		aquarium2.setName("Büyük Akvaryum");
		aquarium2.setLength(100);
		aquarium2.setType("Yuvarlak");
		aquarium2.setPrice(800);
		aquarium2.AquariumCard();

	}

}
