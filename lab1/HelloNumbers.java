public class HelloNumbers {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        while (x <= 10) {
            System.out.print(total + " ");
            total = total + x;
            x = x + 1;
        }
	}
}

/**
 * variables must be declared before they can be used
 * variables must have a specific type which can never change
 * typed are verified before the code runs
 * with type issues, the code WILL NOT COMPILE
 */