import java.util.Scanner;
public class NotDegerlendirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Notunuzu girin (0-100): ");
        int not = scanner.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not girdiniz");
        } else {
            int bolum = not / 10;
            switch (bolum) {
                case 10: // 100 için
                case 9:
                    System.out.println("Harf notu: A");
                    break;
                case 8:
                System.out.println("Harf notu: B");
                break;
                case 7:
                System.out.println("Harf notu: C");
                break;
                case 6:
                    System.out.println("Harf notu: D");
                    break;
                default:
                    System.out.println("Harf notu: F");
            }
        }
        scanner.close();
    }
}
