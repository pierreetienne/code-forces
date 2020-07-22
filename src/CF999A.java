import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF999A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            StringTokenizer st = new StringTokenizer(ln);
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] a = new int[N];
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; ++i) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int ans = 0;
            int ini = 0;
            int fin = N - 1;
            while (ini < a.length && fin < a.length && !((a[ini] > K && a[fin] > K) || ini > fin) ) {
                if (a[ini] <= K) {
                    ans++;
                    ini++;
                }
                if (ini < fin) {
                    if (a[fin] <= K) {
                        fin--;
                        ans++;
                    }
                }
            }
            System.out.println(ans);

        }

    }
}
