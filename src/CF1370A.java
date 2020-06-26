import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1370A {

    public static void main(String[] a) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            long n = Integer.parseInt(in.readLine());
            long res = 0;
            if(n > 0){
                if(n%2==0){
                    res = n/2;
                }else{
                    res = (n-1)/2;
                }
            }
//            long max = 0;
//            for(int i=1;i<=n;++i){
//                for(int j=i+1;j<=n;++j){
//                    max = Math.max(max, mcd(i,j));
//                }
//            }
//            System.out.println(max);

            System.out.println(res);
        }

    }

    static long mcd(long a, long b) {
        for (long t; b != 0; t = a % b, a = b, b = t) ;
        return a;
    }
}
