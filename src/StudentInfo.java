import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgi alalım
        System.out.print("Adınızı girin: ");
        String name = input.nextLine();

        System.out.print("Yaşınızı girin: ");
        int age = input.nextInt();

        System.out.print("1. sınav notunu girin: ");
        int exam1 = input.nextInt();

        System.out.print("2. sınav notunu girin: ");
        int exam2 = input.nextInt();

        // Ortalama hesapla
        double average = (exam1 + exam2) / 2.0;

        // Geçti mi kontrol et
        boolean isPassed = average >= 50;

        // Harf notu
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Sonuçları yazdır
        System.out.println("\n--- Öğrenci Bilgisi ---");
        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Not Ortalaması: " + average);
        System.out.println("Geçti mi?: " + isPassed);
        System.out.println("Harf Notu: " + grade);

        input.close();
    }
}
