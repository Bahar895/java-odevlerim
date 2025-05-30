
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Lütfen bir gün sayısı giriniz:");
//        int day = scanner.nextInt();
//
//        if (day<=0 || day>7) {
//            throw new RuntimeException("hatalı bir gün sayısı girildi");
//        }
//
//        switch (day) {
//            case 1:
//                System.out.println("pazartesi");
//                break;
//            case 2:
//                System.out.println("salı");
//                break;
//            case 3:
//                System.out.println("çarşamba");
//                break;
//            case 4:
//                System.out.println("perşembe");
//                break;
//            case 5:
//                System.out.println("cuma");
//                break;
//            case 6:
//                System.out.println("cumartesi");
//                break;
//            case 7:
//                System.out.println("pazar");
//                break;
////        Araba araba1 = new Araba("Lamborghini","v12",2025);
////        araba1.bilgileriYazdir();
//        Car araba1 = new Car("Tesla","Model S",2024);
//        araba1.bilgileriYazdir();
        Car araba = new Car();
        araba.setBrand("Mercedes");
        araba.setModel("GLA 200");
        araba.setYear(2023);

        System.out.println("Marka: " + araba.getBrand());
        System.out.println("Model: " + araba.getModel());
        System.out.println("Yıl: " + araba.getYear());
    }
}
