package RestauranSimulasyonu;
import java.util.Date;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Siparis {
	private Yemek yemek;
	private Icecek icecek;
	private Musteri musteri;
	Garson garson;
	Date tarih = new Date();
	public static long siparisno;
	Restoran restoran = new Restoran();
	
	// Siparis sınıfı için yapıcı (constructor) metot
	public Siparis(Yemek yemek,Icecek icecek,Garson garson,Musteri musteri,Date tarih){
		this.yemek = yemek;
		this.icecek= icecek;
		this.garson = garson;
		this.musteri = musteri;
		this.tarih = tarih;
}
	// Siparişin bilgilerini yazdıran metot
	public void siparisBilgisi() {
	    System.out.println("Yemek: " + yemek.getAd() + " - " + yemek.getFiyat());
	    System.out.println("Icecek: " + icecek.getAd() + " - " + icecek.getFiyat());
	    System.out.println("Garson: " + garson.getAd());
	    System.out.println("Musteri: " + musteri.getAd());
	    System.out.println("Zaman: " + tarih);
	    System.out.println("Siparis Alindi.");
	}
	
	// Siparişin bilgilerini dosyaya yazdıran metot
	public void siparisYazdir() {
		
		// Siparişler için klasör adı ve yolu belirleniyor
		String KlasorAdi = "Siparisler";
        String KlasorYolu = System.getProperty("user.dir") + File.separator + KlasorAdi;
        File klasor = new File(KlasorYolu);
        if (!klasor.exists()) {
            boolean olusturuldu = klasor.mkdirs();
            if (olusturuldu) {
                System.out.println("\nKlasor başarıyla oluşturuldu: ");
            } 
            else {
                System.out.println("\nKlasor oluşturulurken bir hata oluştu.");
            }
        }
    
        String txtAdi = "siparis_numara.txt";
        String icerik = "Sipariş Bilgileri:\nYemek:" + yemek.ad + "-" + yemek.fiyat
                    + "\nIcecek:" + icecek.ad + "-" + icecek.fiyat + "\nGarson:" + garson.getAd()
                    + "\nMusteri:" + musteri.getAd() + "\nZaman:" + tarih + "\nSiparis Alindi.\n\n\n";
     // İçerik dosyaya yazılıyor    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(KlasorYolu + File.separator + txtAdi, true))) {
            	writer.write(icerik);    
                //System.out.println("Dosyaya yazildi"); gereksiz kalabalık yaptığı için yorum satırı yaptım.
            } 
        catch (IOException e) {
                System.out.println("Dosyaya yazilirken bir hata olustu: " + e.getMessage());
            }
        }
    }
	

