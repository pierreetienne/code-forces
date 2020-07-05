import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1311A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ans = 0;
            if (b > a) {
                int d = b - a;
                if (d % 2 == 0)
                    d--;
                a += d;
                ans++;
                if (a != b) {
                    ans++;
                }
            } else if (a > b) {
                int d = a - b;
                if (d % 2 != 0)
                    d++;
                a -= d;
                ans++;
                if (a != b) {
                    ans++;
                }
            }
            sb.append(ans).append("\n");

        }
        System.out.print(new String(sb));

    }
}
