import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1426C {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                int n = Integer.parseInt(in.readLine());
                int min = Integer.MAX_VALUE;
                for (int i = 1; i <100245; ++i) {
                    int aux2 = (n - 1) / i;
                    min = Math.min(aux2 + (i), min);
                }
                System.out.println(n == 1 ? 0 : (min - 1));
            }
        }
    }


}

