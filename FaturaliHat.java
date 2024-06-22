import java.util.Date;

public class FaturaliHat extends Hat {
        private int bedavaDakika;
        private int faturaTutari;
        public FaturaliHat(String numara,int bedavaDakika,int faturaTutari) {
            super(numara);
            this.bedavaDakika=bedavaDakika;
            this.faturaTutari=faturaTutari;

        }

        public void AramaYap(String aranan,int aramaSuresi) {
            Konusma konusma=new Konusma(getNumara(),aranan,aramaSuresi,new Date());
            yapilanAramaListesi(konusma);
            if((konusma.getAramaSuresi())/60>bedavaDakika){
               int fazlaDakika=konusma.getAramaSuresi()/60-bedavaDakika;
               faturaTutari+=((fazlaDakika/60)*2);
            }


        }

        public void GelenArama(String arayan, int aramaSuresi) {
            Konusma konusma=new Konusma(arayan,getNumara(),aramaSuresi,new Date());
            gelenAramaListesi(konusma);



        }
        public int FaturaTutari(){
            int topsure=0;
            int sonFturaTutari;
            int ekucret = 0;
            for (Konusma a:getYapilanAramalar()){
                topsure+=a.getAramaSuresi();
            }
            if((topsure/60)>bedavaDakika) {
                int fazlaDakika = (topsure / 60) - bedavaDakika;
                ekucret = (fazlaDakika / 60) * 2;}

                sonFturaTutari = getFaturaTutari() + ekucret;


            return sonFturaTutari;
        }

        public int getBedavaDakika() {
            return bedavaDakika;
        }

        public void setBedavaDakika(int bedavaDakika) {
            this.bedavaDakika = bedavaDakika;
        }

        public int getFaturaTutari() {
            return faturaTutari;
        }

        public void setFaturaTutari(int faturaTutari) {
            this.faturaTutari = faturaTutari;
        }
    }
