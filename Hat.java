import java.util.ArrayList;
public abstract class Hat {
    private String numara;
    private ArrayList<Konusma> yapilanAramalar=new ArrayList<>();
    private ArrayList<Konusma> gelenAramalar=new ArrayList<>();

    public Hat(String numara){
        this.yapilanAramalar=new ArrayList<>();
        this.gelenAramalar=new ArrayList<>();

        if(numara.length()==10)
            this.numara=numara;
    }


    public String getNumara() {
        return this.numara;
    }

    public String toString(){
        return numara;
    }

    public abstract void AramaYap(String aranan,int aramaSuresi);
    public abstract void GelenArama(String arayan, int aramaSuresi);


    public void yapilanAramaListesi(Konusma konusma){
        yapilanAramalar.add(konusma);
    }

    public void gelenAramaListesi(Konusma konusma){
        gelenAramalar.add(konusma);
    }


    public Konusma EnUzunKonusma()
    {Konusma uzunKonusma=yapilanAramalar.get(0);

        ArrayList<Konusma> konusmalar=new ArrayList<>();
        for(int i=0;i<yapilanAramalar.size();i++){
            konusmalar.add(yapilanAramalar.get(i));}
        for(int i=0;i<gelenAramalar.size();i++){
            konusmalar.add(gelenAramalar.get(i));}

        for(int i=0;i<konusmalar.size();i++){
            if(konusmalar.get(i).getAramaSuresi() > uzunKonusma.getAramaSuresi()){
                uzunKonusma=konusmalar.get(i);
            }

            }

        return uzunKonusma;
    }
    public ArrayList<String> AramaSikliginaGoreSirala() {
        ArrayList<String> numaralar = new ArrayList<>();
        for (Konusma k : yapilanAramalar) {
            numaralar.add(k.getArananNumara());
        }
        for (Konusma k : gelenAramalar) {
            numaralar.add(k.getArayanNumara());
        }
return null;

    }


    public ArrayList<Konusma> getYapilanAramalar() {
        return yapilanAramalar;
    }

    public ArrayList<Konusma> getGelenAramalar() {
        return gelenAramalar;
    }
}
