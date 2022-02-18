import java.util.*;
import java.util.stream.IntStream;

class VCS {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        while (b-- > 0) {
            int count = 0, count1 = 0;
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int arrn[] = new int[n];
            int arrk[] = new int[n];
            for (int i = 0; i < m; i++)
                arrn[i] = in.nextInt();
            for (int j = 0; j < k; j++)
                arrk[j] = in.nextInt();
            for (int p = 1; p <= n; p++) {
                int op = p;
                if (IntStream.of(arrn).anyMatch(x -> x == op) && IntStream.of(arrk).anyMatch(x -> x == op))
                    count++;
                if (!(IntStream.of(arrn).anyMatch(x -> x == op)) && !(IntStream.of(arrk).anyMatch(x -> x == op)))
                    count1++;
            }
            System.out.println(count + " " + count1);
        }
    }
}