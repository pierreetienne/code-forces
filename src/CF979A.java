import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF979A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer.parseInt(in.readLine());
        String data = in.readLine() + "%";
        int ans = 0;
        int last = -1;
        int count = 0;
        for (int i = 0; i < data.length(); ++i) {
            if (last !=-1 && last == 'x' && data.charAt(i) == 'x') {
                count++;
            } else {
                count++;
                if (count >= 3) {
                    ans += count - 2;
                }
                count = 0;
            }
            last = data.charAt(i);
        }

        sb.append(ans).append("\n");

        System.out.print(new String(sb));

    }
}
