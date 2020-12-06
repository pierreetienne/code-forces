import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1293B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null;) {
            int n = Integer.parseInt(ln);
            double res = (1. / n) * (double) (n);
            while (n > 0) {
                res += 1. / n;
                n--;
            }
            System.out.printf("%.5f\n", res);
        }

    }

}
