package crc.collections;
import java.util.ArrayList;
public class LambdaOrnegi {
    public static void baslat() {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);
        System.out.println("Lambda ile sayılar: ");
        sayilar.forEach(sayi -> System.out.println(sayi));
    }
}
