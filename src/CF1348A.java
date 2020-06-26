import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1348A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int diff = (1 << n) - (1 << n - 1);
            for (int i = n - 2, j = 1; i > j; i--, j++) {
                diff +=  (1 << j) - (1 << i) ;
            }
            sb.append(diff).append("\n");
        }
        System.out.print(new String(sb));
    }
}
