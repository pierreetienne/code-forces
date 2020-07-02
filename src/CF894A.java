import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF894A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = in.readLine();
        int cont = 0;
        for(int i=0;i<n.length();++i){
            if(n.charAt(i)=='Q') {
                for (int j = i + 1; j < n.length(); ++j) {
                    if(n.charAt(j)=='A') {
                        for (int p = j + 1; p < n.length(); ++p) {
                            if(n.charAt(p)=='Q')
                                cont++;

                        }
                    }
                }
            }
        }
        sb.append(cont).append("\n");
        System.out.print(new String(sb));
    }
}
