package randomizedtest;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> L1 = new AListNoResizing<Integer>();
        BuggyAList<Integer> L2 = new BuggyAList<Integer>();

        L1.addLast(4);
        L2.addLast(4);

        L1.addLast(5);
        L2.addLast(5);

        L1.addLast(6);
        L2.addLast(6);

        assertEquals(L1.size(), L2.size());

        assertEquals(L1.removeLast(), L2.removeLast());
        assertEquals(L1.removeLast(), L2.removeLast());
        assertEquals(L1.removeLast(), L2.removeLast());
    }

    @Test
    public void randomizedTest() {
        AListNoResizing<Integer> L = new AListNoResizing<Integer>();
        BuggyAList<Integer> L1 = new BuggyAList<Integer>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                L1.addLast(randVal);
                assertEquals(L.size(), L1.size());
//                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                int size1 = L1.size();
                assertEquals(size, size1);
//                System.out.println("size: " + size);
            } else if (operationNumber == 2) {
                // getLast
                if (L.size() == 0 || L1.size() == 0) {
                    continue;
                }
                int last = L.getLast();
                int last1 = L1.getLast();
                assertEquals(last, last1);
//                System.out.println("last: " + last);
            } else if (operationNumber == 3) {
                // removeLast
                if (L.size() == 0 || L1.size() == 0) {
                    continue;
                }
                int last = L.removeLast();
                int last1 = L1.removeLast();
                assertEquals(last, last1);
//                System.out.println("removed: " + last);
            }
        }
    }
}
