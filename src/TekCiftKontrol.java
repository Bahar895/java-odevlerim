import java.util.Scanner;
public class TekCiftKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı girin: ");
        int sayi = scanner.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
        }
        scanner.close();
    }

}
