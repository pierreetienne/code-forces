import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1303A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s = in.readLine();
            int init = -1;
            int last = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (init == -1) {
                    if (s.charAt(i) == '1') {
                        init = i;
                    }
                }
                if (s.charAt(i) == '1')
                    last = i;
            }
            int ans = 0;
            for (int i = init; init!= -1 && i <= last; ++i)
                if (s.charAt(i) == '0')
                    ans++;

            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));
    }
}
