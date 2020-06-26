import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1294A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] data = new int[]{
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            };
            int N = Integer.parseInt(st.nextToken());
            Arrays.sort(data);
            N -= data[2] - data[0];
            N -= data[2] - data[1];
            if (N > 0) {
                if (N % 3 == 0) {
                    N = 0;
                } else {
                    N = -1;
                }
            }
            if (N != 0)
                sb.append("NO\n");
            else
                sb.append("YES\n");

        }
        System.out.print(new String(sb));

    }
}
