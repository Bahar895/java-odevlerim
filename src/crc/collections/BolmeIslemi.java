package crc.collections;
import java.util.Scanner;

public class BolmeIslemi {
    public static void baslat() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Birinci sayıyı girin: ");
            int sayi1 = scanner.nextInt();
            System.out.println("İkinci sayıyı girin: ");
            int sayi2 = scanner.nextInt();
            int sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme yapılamaz");
        } catch (Exception e) {
            System.out.println("Geçersiz giriş: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
