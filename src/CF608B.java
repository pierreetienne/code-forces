import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF608B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a = in.readLine();
        String b = in.readLine();
        int sum = 0;
        
        for (int i = 0; i < b.length(); ++i) {
            System.out.println("Compare");
            int total = 0;
            for(int j = 0; j < a.length(); ++j) {
                System.out.println("c: " + b.charAt(i) + " = " + a.charAt(j));
                if(b.charAt(i) != a.charAt(j)) {
                    sum++;
                    total ++;
                }
            }
            System.out.println("total " + total);
        }
 
        System.out.println(sum);
    }
}