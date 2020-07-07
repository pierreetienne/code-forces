import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1296A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine());
            int even = 0;
            for (int i = 0; i < N; ++i) {
                int data = Integer.parseInt(st.nextToken());
                if (data % 2 == 0)
                    even++;
            }
            int odd = N - even;
            String ans = "YES";
            if (even == N || (odd == N && odd % 2 == 0))
                ans = "NO";
            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));
    }
}
