import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        this.name = n;
        this.size = s;
    }

    public void bark() {
        System.out.println(this.name + " bark");
    }

    public int compareTo(Dog o) {
        return this.size - o.size;

//        if (this.size < otherDog.size) {
//            return -1;
//        } else if (this.size == otherDog.size) {
//            return 0;
//        } else {
//            return 1;
//        }
    }

    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog o1, Dog o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }
}
