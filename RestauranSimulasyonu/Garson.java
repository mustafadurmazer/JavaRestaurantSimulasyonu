package RestauranSimulasyonu;
import java.util.ArrayList;

public class Garson {
	// Garsonun kişisel bilgilerini tutan Kisi nesnesi
	Kisi kisi;
	
	// Garson sınıfı için bir yapıcı (constructor) metot
	public Garson(String ad) {
		this.kisi = new Kisi(ad);
	}
	
	// Garsonun siparişi alıp siparişler listesine eklediği metot
	public void siparisAl(Siparis s,ArrayList<Siparis> siparisler ) {
		siparisler.add(s);
	}
	
	// Garsonun adını döndüren metot
	public String getAd() {
		return kisi.ad;
	}
}
