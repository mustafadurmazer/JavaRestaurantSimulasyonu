package RestauranSimulasyonu;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public class Restoran {
	  private ArrayList<Urun> menu = new ArrayList<>();
	  private ArrayList<Siparis> siparisler = new ArrayList<>();
	  private ArrayList<Musteri> musteriler = new ArrayList<>();
	  private ArrayList<Garson> garsonlar = new ArrayList<>();	

	// Restoran sınıfı için yapıcı (constructor) metot
	  public Restoran() {
	        this.menu = new ArrayList<>();
	        this.siparisler = new ArrayList<>();
	        this.musteriler = new ArrayList<>();
	        this.garsonlar = new ArrayList<>();
	    }
	  

	  public void menuyeUrunEkle(Urun urun) {
	        menu.add(urun);
	  }
	  
	  public void musteriEkle(Musteri musteri) {
	        musteriler.add(musteri);
	  }
	  
	  public void garsonEkle(Garson garson) {
	        garsonlar.add(garson);
	  }
	
	// Menüdeki tüm ürünleri gösteren metot
	  public void menuyuGoster() {
		    System.out.println("Menu:");
		    for (Urun urun : menu) {
		        if (urun instanceof Yemek) {
		            Yemek yemek = (Yemek) urun;
		            System.out.println("Yemek Adi: " + yemek.getAd() + ", Fiyati: " + yemek.getFiyat() + ", Turu: " + yemek.getTur());
		        } 
		        else if (urun instanceof Icecek) {
		            Icecek icecek = (Icecek) urun;
		            System.out.println("Icecek Adi: " + icecek.getAd() + ", Fiyati: " + icecek.getFiyat() + ". Boyutu:" + icecek.getBoy());
		        }
		    }
		}
	  
	// Rastgele siparişler oluşturan metot
	 public void rastgeleSiparislerOlustur(int sayi) {
		Random random = new Random();
		int a,b,c,d=0;
		Date f = new Date();
		for(int i=1;i<=sayi;i++) {
			 a = random.nextInt(musteriler.size());
			 b = random.nextInt(garsonlar.size());
			 c = random.nextInt(menu.size()/2-1);
			 d = random.nextInt(menu.size()/2-1)+ menu.size()/2;
			 System.out.println("\n");
			 Yemek yemek = (Yemek) menu.get(c); 
		     Icecek icecek = (Icecek) menu.get(d); 
			 garsonlar.get(b).siparisAl(musteriler.get(a).siparisVer(yemek,icecek,garsonlar.get(b),musteriler.get(a),f), siparisler);
			 System.out.println(i+". Siparis:");
			 siparisler.get(i-1).siparisBilgisi();
			 siparisler.get(i-1).siparisYazdir();}
		System.out.println("\n\n");
	}
}
	 

