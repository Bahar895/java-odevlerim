package crc.collections;

public class WrapperOrnegi {
    public static void baslat() {
        int sayi = 42;
        Integer kutuluSayi = sayi;
        int tekrarInt = kutuluSayi;
        System.out.println("Orjinal int: " + sayi);
        System.out.println("Autoboxed Integer: " + kutuluSayi);
        System.out.println("Unboxed int: " + tekrarInt);
    }
}
