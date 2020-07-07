import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1353B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; ++i) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int[] b = new int[n];
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; ++i) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0, j = n - 1; i < k; i++, j--) {
                if (a[i] < b[j]) {
                    int aux = b[j];
                    b[j] = a[i];
                    a[i] = aux;
                }
            }

            int sum = 0;
            for (int i = 0; i < n; ++i) {
                sum += a[i];
            }
            sb.append(sum).append("\n");
        }
        System.out.print(new String(sb));

    }
}
