import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1281A {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(String ln;(ln = in.readLine())!= null;){
            int N = Integer.parseInt(ln);
            while(N-->0) {
                String word = in.readLine();
                if(word.endsWith("po"))
                    System.out.println("FILIPINO");
                else if(word.endsWith("desu") || word.endsWith("masu"))
                    System.out.println("JAPANESE");
                else
                    System.out.println("KOREAN");

            }
        }
    }
}
