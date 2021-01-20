import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  URL:https://codeforces.com/contest/1398/problem/A
 *  STATUS:TL
 */
public class CF1398A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; ++i) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            boolean sol = false;
            for (int i = 0; i < N && !sol; ++i) {
                for (int j = i + 1; j < N && !sol; ++j) {
                    for (int p = j + 1; p < N && !sol; ++p) {
                        int a = arr[i];
                        int b = arr[j];
                        int c = arr[p];
                        if (a + b > c && a + c > b && b + c <= a) {
                            continue;
                        } else {
                            sol = true;
                            System.out.println((i + 1) + " " + (j + 1) + " " + (p + 1));
                        }
                    }
                }
            }
            if (!sol) {
                System.out.println(-1);
            }
        }
    }
}
