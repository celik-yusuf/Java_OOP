public class Main {

    public static void main(String[] args) {
        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli harflerdir.");
                break;
            default:
                System.out.println("İnce sesli harflerdir.");
        }

    }
}
