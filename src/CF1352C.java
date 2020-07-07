import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1352C {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int x = (int) Math.ceil((1. * K) / (N - 1.));
            int y = x * (N - 1);
            int z = x + y;
            x = (y + 1) - K;
            x = z - x;
            System.out.println(x);
        }
    }
}
