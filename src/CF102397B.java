import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF102397B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int val = Integer.parseInt(ln);
            System.out.println(1 + " " + (val));
        }

    }
}
