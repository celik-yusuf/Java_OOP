public class Ogrenci {
    int ogrenciNo;
    String isim;
    static String fakulteAdi="Muhendislik";  // static ile bir defa yaziyoruz bellekte

    Ogrenci(int ogr,String ad){  // Parametreli yapici method.

        ogrenciNo=ogr;
        isim=ad;
    }

    void bilgileriGoster(){
        System.out.println(ogrenciNo+" "+isim+" "+fakulteAdi);
    }

}
