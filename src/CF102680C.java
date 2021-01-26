import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF102680C {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int N = Integer.parseInt(st.nextToken());
                int S = Integer.parseInt(st.nextToken());
                int[] times = new int[N];
                st = new StringTokenizer(in.readLine());
                for (int i = 0; i < N; ++i) {
                    times[i] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(times);
                boolean ws = false;
                for (int i = 1; i < times.length; ++i) {
                    if (times[i - 1] + S > times[i]) {
                        ws = true;
                        break;
                    }
                }
                System.out.println(ws ? "YES" : "NO");
            }
        }

    }
}
