import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *  URL:https://codeforces.com/problemset/problem/1454/A
 *  STATUS:
 */
public class CF1454A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            for (int i = 0; i < N; ++i) {
                if (i == 0) {
                    System.out.print(N);
                } else {
                    System.out.print(" "+i);
                }
            }
            System.out.println();
        }
    }
}
