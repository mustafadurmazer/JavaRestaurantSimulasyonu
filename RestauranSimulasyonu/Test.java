package RestauranSimulasyonu;
public class Test {

	public static void main(String[] args) {
		// Restoran nesnesi oluşturuluyor
		Restoran restoran = new Restoran();
		
		// Menüye yemekler ekleniyor
		Yemek Kebap = new Yemek("Kebap",250,"Firin");
		restoran.menuyeUrunEkle(Kebap);
		
		Yemek Cantik = new Yemek("Cantik",50,"Kusbasili");
		restoran.menuyeUrunEkle(Cantik);
		
		Yemek Iskender = new Yemek("Iskender",225,"Yogurtsuz");
		restoran.menuyeUrunEkle(Iskender);
		
		Yemek Adana = new Yemek("Adana",50,"Acili");
		restoran.menuyeUrunEkle(Adana);
		
		
		// Menüye içecekler ekleniyor
		Icecek Ayran = new Icecek("Ayran",30,"Buyuk");
		restoran.menuyeUrunEkle(Ayran);
		
		Icecek Kola = new Icecek("Kola",40,"Buyuk");
		restoran.menuyeUrunEkle(Kola);
		
		Icecek Ayran1 = new Icecek("Ayran",20,"Kucuk");
		restoran.menuyeUrunEkle(Ayran1);
		
		Icecek MeyveSuyu = new Icecek("MeyveSuyu",15,"Kucuk");
		restoran.menuyeUrunEkle(MeyveSuyu);
		
		
		// Restorana müşteriler ekleniyor		
		Musteri musteri1 = new Musteri("AHMET");
		restoran.musteriEkle(musteri1);
		
		Musteri musteri2 = new Musteri("MUSTAFA");
		restoran.musteriEkle(musteri2);
		
		Musteri musteri3 = new Musteri("CABBAR");
		restoran.musteriEkle(musteri3);
		
		Musteri musteri4 = new Musteri("MEHMET");
		restoran.musteriEkle(musteri4);
		
		
		// Restorana garsonlar ekleniyor
		Garson garson1 = new Garson("HAKKI");
		restoran.garsonEkle(garson1);
		
		Garson garson2 = new Garson("CUMALI");
		restoran.garsonEkle(garson2);
		
		Garson garson3 = new Garson("CIGULI");
		restoran.garsonEkle(garson3);
		
		Garson garson4 = new Garson("RECEP TAYYIP");
		restoran.garsonEkle(garson4);
	
		// Menüdeki ürünler gösteriliyor
		restoran.menuyuGoster();
		System.out.println("\n");
		
		// Rastgele siparişler oluşturuluyor ve gösteriliyor
		restoran.rastgeleSiparislerOlustur(10);
		}
	}
