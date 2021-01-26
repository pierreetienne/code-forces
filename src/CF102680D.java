import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF102680D {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int N = Integer.parseInt(ln);
            while (N-- > 0) {
                long num = Long.parseLong(in.readLine());
                int multipliers = 1;
                if( num > 1 ){
                    multipliers++;
                }
                for(long i = 2; i * i <= num; ++i){
                    if (num % i == 0){
                        multipliers++;
                    }
                }
                if (multipliers == 2) {
                    System.out.println("Prime");
                } else if ( multipliers > 2) {
                    System.out.println("Composite");
                } else {
                    System.out.println("Neither");
                }
            }

        }
    }

}
