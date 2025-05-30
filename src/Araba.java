public class Araba {
    //Özellikler(fields)
    String marka;
    String model;
    int yil;

    // Constructor (yapıcı metod)
    public Araba(String marka,String model,int yil) {
        this .marka = marka;
        this. model = model;
        this . yil = yil;
    }
    //Metod: Bilgi yazdır
    public void bilgileriYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}
