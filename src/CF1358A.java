import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1358A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int min = Math.min(N, M);
            int max = Math.max(N, M);
            int ans = (int) Math.floor(max / 2) * min;
            if (max % 2 != 0) {
                if (min % 2 == 0)
                    ans += min / 2;
                else
                    ans += Math.floor(min / 2) + 1;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));
    }
}
