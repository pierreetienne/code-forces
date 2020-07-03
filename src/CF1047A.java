import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1047A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        int a = 1;
        int b = 1;
        int c = N - 2;
        if (c % 3 == 0) {
            b++;
            c--;
        }
        sb.append(a+" "+b+" "+c+" \n");
        System.out.print(new String(sb));
    }
}
