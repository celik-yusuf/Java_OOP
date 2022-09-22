public class Ogrenci {

    int ogrenciNo;
    String isim,ders;
    float burs;

    Ogrenci(int ogrenciNo,String isim,String ders){

        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.ders = ders;

    }
    Ogrenci(int ogrenciNo,String isim,String ders,float burs){

        this(ogrenciNo, isim, ders);
        this.burs=burs;
    }

    void bilgileriGoster(){

        System.out.println(ogrenciNo+" "+" "+isim+" "+" "+ders+" "+burs);
    }
}
