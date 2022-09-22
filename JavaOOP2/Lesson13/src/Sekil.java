abstract class Sekil {
    abstract void ciz();
}

class Dikdortgen extends Sekil{
    void ciz(){
        System.out.println("Dikdortgen ciziliyor");
    }
}

class Cember(){
    void ciz(){
        System.out.println("Cember ciziliyor");
    }
}
class Main{
    public static void main(String[] args) {

        Sekil s = new Cember();
        s.ciz();

    }
}
