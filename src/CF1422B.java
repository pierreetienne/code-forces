import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF1422B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                int[][] m = new int[N][M];
                int diff = 0;
                for (int i = 0; i < N; ++i) {
                    st = new StringTokenizer(in.readLine());
                    for (int j = 0; j < M; ++j) {
                        m[i][j] = Integer.parseInt(st.nextToken());
                    }
                }
                for (int i = 0; i < N / 2; ++i) {
                    for (int j = 0; j < M / 2; ++j) {
                        int[] arr = {m[i][j], m[i][M - j - 1], m[N - i - 1][j], m[N - i - 1][M - j - 1]};
                        Arrays.sort(arr);
                        int d = (arr[arr.length - 1] + arr[0]) / 2;
                        int aux = Math.abs(d - arr[0]) + Math.abs(d - arr[1]) + Math.abs(d - arr[2]) + Math.abs(d - arr[3]);
                        System.out.printf("(%d, %d) v:%d\n", i, j, d);
                        m[i][j] = d;
                        m[i][M - j - 1] = d;
                        m[N - i - 1][j] = d;
                        m[N - i - 1][M - j - 1] = d;
                        diff += aux;
                    }
                }
                for (int i = 0; i < N; ++i) {
                    System.out.println(Arrays.toString(m[i]));
                }

                System.out.println(diff);
            }

        }

    }
}
