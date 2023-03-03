import org.junit.Test;
import static org.junit.Assert.*;
public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        assertArrayEquals(expected, input);

        Sort.sort2(input);
        assertArrayEquals(expected, input);

//        *** Ad hoc testing ***
//        for (int i = 0; i < input.length; i += 1) {
//            if (!input[i].equals(expected[i])) {
//                System.out.println("Mismatch in position " + i + ", expected: '" + expected[i] + "', but got: '" + input[i] + "'");
//            }
//        }
    }


}
