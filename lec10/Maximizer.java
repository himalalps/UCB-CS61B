public class Maximizer {
    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            if (items[i].compareTo(items[maxDex]) > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }
}
