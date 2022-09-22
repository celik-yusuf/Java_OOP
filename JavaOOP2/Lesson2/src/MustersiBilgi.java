public class MustersiBilgi {

    int hesapNo;
    String musteriAdi;
    String musteriSoyadi;
    float bakiye;

    void musteriEkle(int hN,String mA,String mS,float b){

        hesapNo = hN;
        musteriAdi=mA;
        musteriSoyadi=mS;
        bakiye=b;

    }

    void paraYatir(float tutar){

        bakiye = bakiye+ tutar;
        System.out.println(tutar+" Para Yatirildi.");

    }

    void paraCek(float tutar){

        if(tutar>bakiye){
            System.out.println("Yetersiz Bakiye");
        }
        else{

            bakiye=bakiye-tutar;
            System.out.println(tutar+" Hesabina cekildi.");
        }
    }

    void kontrol(){

        System.out.println("Hesabin Guncel Bakiyesi: "+bakiye);
    }

    void goster(){

        System.out.println(hesapNo+" "+musteriAdi+" "+musteriSoyadi+" "+bakiye);
    }

}
