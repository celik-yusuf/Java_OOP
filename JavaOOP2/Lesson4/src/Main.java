public class Main {
    public static void main(String[] args) {

        Ogrenci.degistir();
        Ogrenci nesne1 = new Ogrenci(123,"Yusuf");
        Ogrenci nesne2 = new Ogrenci(23323,"Mehmet");

        nesne1.bilgiGoster();
        nesne2.bilgiGoster();
    }
}
