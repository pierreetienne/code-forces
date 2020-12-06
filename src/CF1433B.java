import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1433B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            int T = Integer.parseInt(ln);
            while (T-- > 0) {
                int N = Integer.parseInt(in.readLine());
                int countZeros = 0;

                StringTokenizer st = new StringTokenizer(in.readLine());
                int indexFirstOne = -1, indexLastOne = -1;
                for (int i = 0; i < N; ++i) {
                    String n = st.nextToken();
                    if (n.equals("1")) {
                        if (indexFirstOne == -1)
                            indexFirstOne = i;
                        indexLastOne = i;
                    }
                    if (n.equals("0"))
                        countZeros++;
                }
                int sol = 0;
                if (indexFirstOne != indexLastOne)
                    sol = countZeros - (N - (indexLastOne + 1)) - (indexFirstOne);
                System.out.println(sol);
            }

        }

    }
}
