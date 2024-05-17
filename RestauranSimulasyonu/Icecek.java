package RestauranSimulasyonu;

public class Icecek extends Urun {
	// İçeceğin boyutunu tutan değişken
	private String boy;
	
	// Icecek sınıfı için yapıcı (constructor) metot
	public Icecek(String ad,double fiyat,String boy) {
		super(ad,fiyat);
		this.boy = boy;
	}
	
	// Ürünün bilgilerini yazdıran metot
    public void UrunBilgisi() {
        System.out.println("Ürün Adı: " + ad);
        System.out.println("Fiyat: " + fiyat + " TL");
        System.out.println("Boy: " + boy);
    }
    
    // İçeceğin boyutunu döndüren metot
    public String getBoy() {
    	return boy;
    }	
}
