public class Ogrenci {
    int ogrenciNo;
    String isim;
    static String fakulteAdi="Muhendislik";

    static void degistir(){
        fakulteAdi="Hukuk";

        Ogrenci(int ogr, String ad){

            ogrenciNo=ogr;
            isim=ad;
        }
    }

    void bilgiGoster(){

        System.out.println(ogrenciNo+" "+isim+" "+fakulteAdi);
    }




}
