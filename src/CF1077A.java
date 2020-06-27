import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1077A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long x = 0, y = 0;
            if (k % 2 != 0) {
                x = (k + 1) / 2;
            } else {
                x = k / 2;
            }
            y = k - x;
            long ans = ((a * x) - (b * y));
            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));

    }
}
