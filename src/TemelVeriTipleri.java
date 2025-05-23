public class TemelVeriTipleri {
    public static void main(String[] args) {
        // Temel veri tipleriyle değişken tanımları
        int yas = 25;
        double maas = 15500.75;
        float sicaklik = 27.3f;
        boolean ogrenciMi = true;
        char cinsiyet = 'K' ;
        String isim = "Bahar" ;

        // Sabit (final) değişken
        final String ULKE ="Türkiye";

        // Değerleri ekrana yazdırma
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Öğrenci mi?: " + ogrenciMi);
        System.out.println("Sıcaklık: " + sicaklik);
        System.out.println("Maaş: " + maas);
        System.out.println("Ülke: " + ULKE);
    }
}
