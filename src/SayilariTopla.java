import java.util.Scanner;
public class SayilariTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pozitif bir sayı girin: ");
        int n = input.nextInt();
        int toplam = 0;
        for (int i =1; i <= n; i++) {
            toplam += i; // toplam = toplam + i
        }
        System.out.println("1'den " + n + "'e kadar olan sayıların toplamı: " + toplam);
    }
}
