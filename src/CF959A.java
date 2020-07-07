import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF959A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        if(N%2==0)
            sb.append("Mahmoud\n");
        else
            sb.append("Ehab\n");
        System.out.print(new String(sb));
    }
}
