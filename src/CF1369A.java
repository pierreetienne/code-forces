import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1369A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            sb.append(Integer.parseInt(in.readLine())%4==0?"YES":"NO").append("\n");
        }
        System.out.print(new String(sb));

    }
}
