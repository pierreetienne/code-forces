import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF102680B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int N = Integer.parseInt(ln);
            StringBuilder sb = new StringBuilder();
            String last = null;
            for (int i = 0; i < 2 * N; ++i) {
                String[] line = in.readLine().split(" ");
                if (last == null) {
                    last = line[line.length - 1];
                } else {
                    sb.append("Uh! " + line[line.length - 1] + "-" + last + "!\n");
                    last = null;
                }
            }
            System.out.print(new String(sb));
        }
    }
}
