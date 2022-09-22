public class Main {

    void m(){
        System.out.println("Merhaba m");
    }

    void n(){
        System.out.println("Merhaba n");

        this.m(); // m(); arasinda fark yok.
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.n();
    }
}
