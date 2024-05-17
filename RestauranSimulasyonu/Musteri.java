package RestauranSimulasyonu;
import java.util.Date;

public class Musteri {
	private Kisi kisi;
	
	// Musteri sınıfı için yapıcı (constructor) metot
	public Musteri(String ad) {
		this.kisi = new Kisi(ad);
	}	
	
	// Müşterinin sipariş vermesini sağlayan metot
	public Siparis siparisVer(Yemek yemek,Icecek icecek,Garson garson,Musteri musteri,Date tarih) {
		Siparis yeniSiparis = new Siparis(yemek,icecek,garson,musteri,tarih);
		return yeniSiparis;
	}
	
	// Müşterinin adını döndüren metot
	public String getAd() {
	        return kisi.ad;
    }
}
