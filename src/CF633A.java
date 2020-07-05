import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF633A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                long N = Long.parseLong(in.readLine());
                System.out.println(N);
            }
        }
    }
}
