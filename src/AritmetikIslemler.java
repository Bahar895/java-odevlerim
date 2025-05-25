import java.util.Scanner ;
public class AritmetikIslemler {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan iki sayı al
        System.out.println("Birinci sayıyı girin");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin");
        double sayi2 = scanner.nextDouble();

        //İşlemler
        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        double bolum = sayi2 !=0 ? sayi1 / sayi2 : Double.NaN;

        // Sonuçları yazdır
        System.out.println("Toplama: " + toplam);
        System.out.println("Çıkarma: " + fark);
        System.out.println("Çarpma: " + carpim);
        System.out.println("Bölme: " + (sayi2 !=0 ? bolum : "Tanımsız (sıfıra bölünemez"));

        scanner.close();
    }
}
