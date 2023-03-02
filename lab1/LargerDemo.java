public class LargerDemo {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println((larger(5, -10)));
    }
}

/**
 * to declare a function in Java, use "public static" (for today)
 * all parameters of a function must have a type and the function itself must have a return type
 * all functions must be part of a class
 * all functions in Java are methods which is a part of a class in programming language terminology
 */