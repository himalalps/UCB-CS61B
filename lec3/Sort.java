public class Sort {
    public static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i += 1) {
            int index = i;
            for (int j = i; j < strings.length; j += 1) {
                if (strings[j].compareTo(strings[index]) < 0) {
                    index = j;
                }
            }
            String temp = strings[index];
            strings[index] = strings[i];
            strings[i] = temp;
        }
    }

    public static void sort2(String[] strings) {
        sort(strings, 0);
    }

    private  static void sort(String[] strings, int start) {
        if (start == strings.length) {
            return;
        }
        int index = start;
         for (int i = start; i < strings.length; i += 1) {
            if (strings[i].compareTo(strings[index]) < 0) {
                index = i;
            }
        }
        String temp = strings[index];
        strings[index] = strings[start];
        strings[start] = temp;
        sort(strings, start + 1);
    }
}
