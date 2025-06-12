package crc.main;
//import crc.model.Gun;
//
//public class Main {
//    public static void main(String[] args) {
//        Gun bugun = Gun.CUMA;
//        System.out.println("Bugün günlerden: " + bugun);
//import crc.collections.SehirListesi;
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> sehirler = SehirListesi.sehirleriGetir();
//        for (String sehir : sehirler) {
//            System.out.println("Şehir: " + sehir);
import crc.collections.MeyveSeti;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<String > meyveler = MeyveSeti.meyveleriGetir();
        for (String meyve : meyveler) {
            System.out.println("Meyve: " + meyve);
        }

    }
}
