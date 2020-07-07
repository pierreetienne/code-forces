import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF731A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String data = in.readLine();
        int ans = 0;
        char from = 'a';
        for (int i = 0; i < data.length(); ++i) {
            int min = Math.min(from, data.charAt(i));
            int max = Math.max(from , data.charAt(i));

            int val = (min - 'a')+ ('z'-max)+1;

            ans += Math.min(max-min,val);

            from = data.charAt(i);
        }
        sb.append(ans).append("\n");
        System.out.print(new String(sb));
    }
}
