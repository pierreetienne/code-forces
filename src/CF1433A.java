import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1433A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                int N = Integer.parseInt(in.readLine());
                int sum = 10 * ((N % 10) - 1);
                sum += f((N + "").length());
                System.out.println(sum);
            }
        }

    }

    static int f(int n) {
        if (n == 0)
            return 0;
        return f(n - 1) + n;
    }
}
