import java.util.Scanner;
public class EnBuyukSayiyiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan 3 sayı al
        System.out.println("1 .sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.println("2. sayıyı girin: ");
        int sayi2 = input.nextInt();
        System.out.println("3. sayıyı girin: ");
        int sayi3 = input.nextInt();
        // En büyük sayıyı bul
        int enBuyuk = sayi1;
        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }
        // Sonucu yazdır
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
