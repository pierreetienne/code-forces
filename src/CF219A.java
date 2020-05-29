import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF219A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(in.readLine());
        String s = in.readLine();
        int[] letter = new int[30];
        for (int i = 0; i < s.length(); ++i) {
            letter[s.charAt(i) - 'a']++;
        }

        boolean solution = true;
        String sol = "";
        for (int i = 0; i < letter.length && solution; ++i) {
            if (letter[i] > 0 && letter[i] % k != 0)
                solution = false;
            else if (letter[i] > 0) {
                for (int j = 0; j < letter[i] / k; ++j) {
                    sol += (char) (i + 'a');
                }
            }
        }

        if (!solution)
            System.out.println(-1);
        else {
            String res = "";
            for (int i = 0; i < k; ++i) {
                res += sol;
            }
            System.out.println(res);
        }


    }
}
