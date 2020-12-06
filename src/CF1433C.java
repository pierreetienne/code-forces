import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1433C {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                int N = Integer.parseInt(in.readLine());
                int[] n = new int[N];
                StringTokenizer st = new StringTokenizer(in.readLine());
                Integer max = null;
                for (int i = 0; i < N; ++i) {
                    n[i] = Integer.parseInt(st.nextToken());
                    if (max == null)
                        max = n[i];
                    max = Math.max(max, n[i]);
                }

                int sol = -1;
                for (int i = 0; i < N; ++i) {
                    if (n[i] == max) {
                        if (i + 1 < N && n[i + 1] < max) {
                            sol = i;
                            break;
                        }
                        if (i - 1 >= 0 && n[i - 1] < max) {
                            sol = i;
                            break;
                        }
                    }
                }
                if (sol != -1)
                    sol++;
                System.out.println(sol);

            }
        }

    }
}
