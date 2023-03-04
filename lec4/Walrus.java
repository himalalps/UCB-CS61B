public class Walrus {
    public int weight;
    public double tuskSize;

    public Walrus(int w, double ts) {
        weight = w;
        tuskSize = ts;
    }

    @Override
    public String toString() {
        return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
    }

    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b = a;
        b.weight = 5;
        System.out.println("a.weight: " + a.weight + ", a.tuskSize: " + a.tuskSize);
        System.out.println("b.weight: " + b.weight + ", b.tuskSize: " + b.tuskSize);
    }
}
