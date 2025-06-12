package crc.collections;
import java.util.HashMap;

public class NotListesi {
    public static HashMap<String,Integer> notlarıGetir() {
        HashMap<String,Integer> notlar = new HashMap<>();
        notlar.put("Ahmet",90);
        notlar.put("Ayşe",85);
        notlar.put("Mehmet",75);
        return notlar;
    }
}
