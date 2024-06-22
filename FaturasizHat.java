import java.util.ArrayList;
import java.util.Date;

public class FaturasizHat  extends Hat {

    private int bakiye;
    public FaturasizHat(String numara,int bakiye) {
        super(numara);
        this.bakiye=bakiye;


    }
    public int BakiyeYukle(int bakiye){
       return getBakiye()+bakiye;
    }
    public void AramaYap(String aranan, int aramaSuresi) {
        double topucret=  (aramaSuresi*0.05);
        if(bakiye>=topucret) {
            Konusma konusma=new Konusma(getNumara(),aranan,aramaSuresi,new Date());
            yapilanAramaListesi(konusma);
            bakiye-=topucret;
        }else {
            int kalanSure=(bakiye/60);
            Konusma konusma=new Konusma(getNumara(),aranan,kalanSure,new Date());
            yapilanAramaListesi(konusma);
            bakiye=0;
        }

    }
    public void GelenArama(String arayan, int aramaSuresi) {
        Konusma konusma=new Konusma(arayan,getNumara(),aramaSuresi,new Date());
        gelenAramaListesi(konusma);

    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}

