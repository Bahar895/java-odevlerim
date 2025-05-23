import java.util.Scanner;
public class KullanıcıYasKontrolu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = input.nextInt();
        if (yas <= 45) {
            System.out.println("45 yaş ve altındakiler başvurabilir");
        } else {
            System.out.println("45 yaş üstü başvuramaz");
        }
        input.close();
    }
}

