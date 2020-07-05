import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF1206A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        Set<Integer> A = new TreeSet<>();
        for (int i = 0; i < N; ++i) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine());
        Set<Integer> B = new TreeSet<>();
        for (int i = 0; i < M; ++i) {
            B.add(Integer.parseInt(st.nextToken()));
        }
        int[] ans = f(A, B);
        sb.append(ans[0] + " " + ans[1]).append("\n");


        System.out.print(new String(sb));

    }

    static int[] f(Set<Integer> A, Set<Integer> B) {
        for (int i : A) {
            for (int x : B) {
                if (!B.contains(x + i) && !A.contains(x + i)) {
                    return new int[]{i, x};
                }
            }
        }

        return new int[]{};
    }
}
