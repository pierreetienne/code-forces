import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1223A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            if(N == 2)
                sb.append(2);
            else{
                if(N%2==0)
                    sb.append(0);
                else
                    sb.append(1);
            }
            sb.append("\n");

        }
        System.out.print(new String(sb));
    }
}
