import java.util.*;

public class ArraySet <T> implements Iterable<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        this.items = (T[]) new Object[100];
        this.size = 0;
    }

    public boolean contains(T x) {
        for (int i = 0; i < this.size; i += 1) {
            if (x.equals(this.items[i])) {
                return true;
            }
        }
        return false;
    }

    public void add(T x) {
//        if (x == null) {
//            throw new IllegalArgumentException("You cannot add null to Arrayset. ");
//        }
        if (this.contains(x) || x == null) {
            return;
        }
        this.items[this.size] = x;
        this.size += 1;
    }

    public int size() {
        return this.size;
    }

    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;
        public ArraySetIterator() {
            this.wizPos = 0;
        }

        @Override
        public boolean hasNext() {
            return this.wizPos < size;
        }

        @Override
        public T next() {
            T returnItem = items[this.wizPos];
            this.wizPos += 1;
            return returnItem;
        }
    }

//    @Override
//    public String toString() {
//        StringBuilder returnSB = new StringBuilder("{");
//        for (int i = 0; i < this.size - 1; i += 1) {
//            returnSB.append(this.items[i].toString());
//            returnSB.append(", ");
//        }
//        returnSB.append(this.items[this.size - 1].toString());
//        returnSB.append("}");
//        return returnSB.toString();
//    }


    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();
        for (T x: this) {
            listOfItems.add(x.toString());
        }
        return "{" + String.join(", ", listOfItems) + "}";
    }

    public static <Glerp> ArraySet<Glerp> of (Glerp... stuff) {
        ArraySet<Glerp> returnSet = new ArraySet<Glerp>();
        for (Glerp x: stuff) {
            returnSet.add(x);
        }
        return returnSet;
    }

    @Override
    public boolean equals(Object obj) {
         if (obj instanceof ArraySet oas) {
             if (oas.size != this.size) {
                 return false;
             }
             for (T item: this) {
                 if (!oas.contains(item)) {
                     return false;
                 }
             }
             return true;
         }
         return false;
    }

    public static void main(String[] args) {
        Set<Integer> javaset = new HashSet<>();
        javaset.add(5);
        javaset.add(23);
        javaset.add(42);

        // ugly iteration
        Iterator<Integer> seer = javaset.iterator();

        while (seer.hasNext()) {
            int i = seer.next();
            System.out.println(i);
        }

        // better iteration
        for (int i: javaset) {
            System.out.println(i);
        }

        ArraySet<String> s = new ArraySet<>();
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
//        System.out.println(s.contains("horse"));
//        System.out.println(s.size());
        Iterator<String> aseer = s.iterator();
        while (aseer.hasNext()) {
            String i = aseer.next();
            System.out.println(i);
        }

        for (String i: s) {
            System.out.println(i);
        }

        System.out.println(s);
    }
}
