public class Main {
    public static void main(String[] args) {

        MustersiBilgi mustersiBilgi = new MustersiBilgi();


        mustersiBilgi.musteriEkle(123,"Yusuf","Celik",1000);
        mustersiBilgi.goster();
        mustersiBilgi.paraYatir(1000);
        mustersiBilgi.kontrol();
        mustersiBilgi.paraCek(400);
        mustersiBilgi.kontrol();
        mustersiBilgi.paraCek(400);
        mustersiBilgi.goster();

    }
}
