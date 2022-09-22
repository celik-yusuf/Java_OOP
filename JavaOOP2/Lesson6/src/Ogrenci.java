public class Ogrenci {
    int ogrenciNo;
    String isim;
    float burs;

    Ogrenci(int ogrenciNo, String isim, float burs){

        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.burs = burs;
    }

    void bilgiGoster(){
        System.out.println(ogrenciNo+" "+isim+" "+burs);
    }
}
