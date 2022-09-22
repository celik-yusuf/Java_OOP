public class Main {
    public static void main(String[] args) {

        YapiKredi yb = new YapiKredi();
        Garanti gb = new Garanti();
        İsBankasi ib = new İsBankasi();

        System.out.println("Yapi Kredi Faiz Orani: "+yb.faizOrani());
        System.out.println("Garanti Faiz Orani: "+gb.faizOrani());
        System.out.println("Is Bankasi Faiz Orani: "+ib.faizOrani());
    }
}
