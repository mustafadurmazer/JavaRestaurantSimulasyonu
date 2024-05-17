package RestauranSimulasyonu;

public class Yemek extends Urun {
	private String tur;
	//Yemek sınıfı için yapıcı (constructor) metot
	public Yemek(String ad,double fiyat,String tur) {
		super(ad,fiyat);
		this.tur = tur;
	}
    // UrunBilgisi metodu, ürünün adını ve fiyatını ekrana yazdırır.

	 public void UrunBilgisi() {
	        System.out.println("Ürün Adı: " + ad);
	        System.out.println("Fiyat: " + fiyat + " TL");
	        System.out.println("Tür: " + tur);
	    }
	 //Tur donduren metot
	 public String getTur() {
		 return tur;
	 }
	}
	
	

