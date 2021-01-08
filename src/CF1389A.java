import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  URL:https://codeforces.com/problemset/problem/1389/A
 *  STATUS:AC
 */
public class CF1389A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long x = -1;
            long y = -1;
            for (long i = a; i < b && x == -1; ++i) {
                if (i * 2 <= b) {
                    x = i;
                    y = i * 2;
                } else if (i * 2 > b) {
                    break;
                }
            }

            System.out.println(x + " " + y);
        }
    }
}
