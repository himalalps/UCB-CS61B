package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        AList<Integer> Ns = new AList<Integer>();
        AList<Double> times = new AList<Double>();
        AList<Integer> opCounts = new AList<Integer>();
        int n = 13;
        int N = 1000;

        for (int i = 0; i < n; i += 1) {
            AList<Integer> L = new AList<Integer>();
            for (int j = 0; j < 100; j += 1) {
                L.addLast(1);
            }

            Stopwatch sw = new Stopwatch();
            for (int j = 0; j < N; j += 1) {
                L.addLast(1);
            }
            double time = sw.elapsedTime();

            Ns.addLast(N);
            times.addLast(time);
            opCounts.addLast(N);
            N *= 2;
        }

        printTimingTable(Ns, times, opCounts);
    }
}
