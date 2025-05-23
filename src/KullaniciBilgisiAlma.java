import java.util.Scanner;

public class KullaniciBilgisiAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan veri alma
        System.out.println("Adınızı giriniz: ");
        String isim = input.nextLine();

        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        //Verileri ekrana yazdırma
        System.out.println("Adınız: " + isim);
        System.out.println("Yaşınız: " + yas);
        input.close();

    }
}
