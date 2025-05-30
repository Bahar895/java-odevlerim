public class Car {
//    //Özellikler(fields)
//    String marka;
//    String model;
//    int yil;
//
//    // Constructor (yapıcı metod)
//    public Car(String marka, String model, int yil) {
//        this .marka = marka;
//        this. model = model;
//        this . yil = yil;
//    }
//    //Metod: Bilgi yazdır
//    public void bilgileriYazdir() {
//        System.out.println("Marka: " + marka);
//        System.out.println("Model: " + model);
//        System.out.println("Yıl: " + yil);
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
    return brand;
    }
    public String getModel() {
    return model;
}
public int getYear() {
return year;
}
public void setBrand(String brand) {
    this.brand = brand;
}
    public void setModel(String model) {
        this.model = model;
    }
            public void setYear(int year) {
            this.year = year;
        }
        }



