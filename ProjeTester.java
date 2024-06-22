public class ProjeTester {
    public static void main(String[] args) {
        // Örnek bir test vakası oluşturma
        Konusma kHoca = new Konusma("1234567890", "0987654321", 120, "2023-05-24");
        Konusma k = new Konusma("1234567890", "0987654321", 120, "2023-05-24");

        // Karşılaştırma
        if(k == null || !k.getArayanNumara().equals(kHoca.getArayanNumara()) ||
                !k.getArananNumara().equals(kHoca.getArananNumara()) ||
                k.getAramaSuresi() != kHoca.getAramaSuresi()) {
            System.out.println("Hata: Beklenen değerler ile uyuşmuyor.");
        } else {
            System.out.println("Başarılı: Beklenen değerler ile uyuşuyor.");
        }

        // Sonuçları yazdırma
        System.out.println("Sizin Sonucunuz: arayan: " + k.getArayanNumara() +
                " aranan: " + k.getArananNumara() +
                " sure: " + k.getAramaSuresi());
    }
}
