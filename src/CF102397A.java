import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF102397A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            System.out.println(Integer.parseInt(ln) * 2);
        }
    }
}
