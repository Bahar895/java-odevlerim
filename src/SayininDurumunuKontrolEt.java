import java.util.Scanner;
public class SayininDurumunuKontrolEt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        double sayi = scanner.nextDouble();
        if (sayi > 0) {
            System.out.println("Pozitif sayı");
        } else if (sayi < 0) {
            System.out.println("Negatif sayı");
        } else {
            System.out.println("Sayı sıfır");
        }
        scanner.close();

    }
}




