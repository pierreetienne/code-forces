import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  URL:https://codeforces.com/problemset/problem/1462/A
 *  STATUS:AC
 */
public class CF1462A {
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
            int[] sol = new int[N];
            int left = 0;
            int right = N - 1;
            for (int i = 0; i < N; ++i) {
                if (i % 2 == 0) {
                    sol[i] = arr[left];
                    left++;
                } else {
                    sol[i] = arr[right];
                    right--;
                }
            }
            for (int i = 0; i < N; ++i) {
                if (i == 0) {
                    System.out.print(sol[i]);
                } else {
                    System.out.print(" " + sol[i]);
                }
            }
            System.out.println();

        }


    }
}
