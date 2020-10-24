import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF630C {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null;) {
            int n = Integer.parseInt(ln);
            long s = 0;
            for (int i = 1; i <= n; ++i) {
                s += (long) Math.pow(2, i);
            }
            System.out.println(s);
        }

    }
}
