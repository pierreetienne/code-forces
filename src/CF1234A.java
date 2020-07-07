import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1234A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            double ans = 0.;
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; ++i) {
                ans += Integer.parseInt(st.nextToken());
            }
            sb.append((long)Math.ceil(ans / N)).append("\n");
        }
        System.out.print(new String(sb));
    }
}
