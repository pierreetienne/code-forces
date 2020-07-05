import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1088A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        int ansX = -1;
        int ansY = -1;
        for (int a = 1; a <= N && ansX == -1; ++a) {
            for (int b = 1; b <= N && ansX == -1; ++b) {
                if( a%b == 0 && a*b > N && (0.+a)/(0.+b) < (0.+N)){
                        ansX=a;
                        ansY=b;
                }
            }
        }
        if(ansX == -1)
            sb.append("-1\n");
        else
            sb.append(ansX+" "+ansY+"\n");
        System.out.print(new String(sb));
    }
}
