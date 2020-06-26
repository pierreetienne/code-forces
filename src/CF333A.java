import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF333A {

    public static void main(String[] arg)throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(in.readLine());
        System.out.println(num%3);
    }
}
