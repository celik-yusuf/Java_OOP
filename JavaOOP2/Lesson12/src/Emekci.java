public class Emekci extends Personel{

    float ucret;
    Emekci(int id,String isim,float ucret){

        super(id,isim);
        this.ucret=ucret;
    }
    void goster(){

        System.out.println(id+" "+isim+" "+ucret);
    }
}
