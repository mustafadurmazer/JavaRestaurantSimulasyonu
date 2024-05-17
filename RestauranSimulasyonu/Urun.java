package RestauranSimulasyonu;

//Urun sınıfı, restoran simülasyonunda kullanılacak genel ürün özelliklerini tanımlar.

public abstract class Urun {
	protected String ad;
	protected double fiyat;
	
	public Urun(String ad , double fiyat) {
		this.ad = ad;
		this.fiyat = fiyat;}
	
	public String getAd(){
		return ad;}
	
	public double getFiyat(){
		return fiyat;
	}	
    // UrunBilgisi metodu, ürünün adını ve fiyatını ekrana yazdırır.
	 public void UrunBilgisi() {
	        System.out.println("Ürün Adı: " + ad);
	        System.out.println("Fiyat: " + fiyat + " TL");
	}
}
