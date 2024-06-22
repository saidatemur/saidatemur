
import java.util.Date;
public class Konusma implements Comparable<Konusma> {
    private String arayan;
    private String aranan;
    private int konusmaSuresi;
    private Date konusmaTarihi;


    public Konusma(String arayan,String aranan,int konusmaSuresi,Date konusmaTarihi) {
    this.arayan=arayan;
    this.aranan=aranan;
    this.konusmaSuresi=konusmaSuresi;
    this.konusmaTarihi=konusmaTarihi;
    }


    public String toString() {
return "Arayan"+arayan+",Aranan"+aranan+",Sure "+konusmaSuresi;
    }


    public int compareTo(Konusma o) {
        return Integer.compare(this.konusmaSuresi,o.konusmaSuresi);
    }

    public String getArayanNumara(){
        return arayan;
    }

    public void setArayanNumara(String arayan) {
        this.arayan = arayan;
    }

    public String getArananNumara() {
        return aranan;
    }

    public void setArananNumara(String aranan) {
        this.aranan = aranan;
    }

    public int getAramaSuresi() {
        return konusmaSuresi;
    }

    public void setAramaSuresi(int konusmaSuresi) {
        this.konusmaSuresi = konusmaSuresi;
    }

    public Date getKonusmaTarihi() {
        return konusmaTarihi;
    }

    public void setKonusmaTarihi(Date konusmaTarihi) {
        this.konusmaTarihi = konusmaTarihi;
    }
}
