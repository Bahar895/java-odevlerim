public class Cember extends Shape {
    private double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }
    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }
    @Override
    public void ciz() {
        System.out.println("Çember çiziliyor...");
    }
}
