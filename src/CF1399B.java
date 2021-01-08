import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Url:https://codeforces.com/problemset/problem/1399/B
 * Static: AC
 */
public class CF1399B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            long[] candies = new long[N];
            long[] oranges = new long[N];
            StringTokenizer st = new StringTokenizer(in.readLine());
            int minC = -1;
            for (int i = 0; i < N; ++i) {
                int val = Integer.parseInt(st.nextToken());
                if (minC == -1) {
                    minC = val;
                }
                candies[i] = val;
                minC = Math.min(minC, val);
            }
            st = new StringTokenizer(in.readLine());
            int minO = -1;
            for (int i = 0; i < N; ++i) {
                int val = Integer.parseInt(st.nextToken());
                if (minO == -1) {
                    minO = val;
                }
                oranges[i] = val;
                minO = Math.min(minO, val);
            }
            long r = 0;
            for (int i = 0; i < N; ++i) {
                if(minC < candies[i] && minO < oranges[i]){
                    long min = Math.min(candies[i] - minC, oranges[i] - minO);
                    candies[i] -= min;
                    oranges[i] -= min;
                    r += min;
                }
                if(minC == candies[i] && minO < oranges[i]){
                    r += oranges[i] - minO;
                }else if(minO == oranges[i] && minC < candies[i]){
                    r += candies[i] - minC;
                }

            }
            System.out.println(r);

        }
    }
}
