import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CF617B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null;) {
            String[] d = in.readLine().split(" ");
            List<Integer> onesIndex = new ArrayList<>();
            for (int i = 0; i < d.length; ++i) {
                if (d[i].equals("1")) {
                    onesIndex.add(i);
                }
            }

            if (onesIndex.size() <= 1) {
                System.out.println(onesIndex.size());
            } else {
                List<Integer> ranges = new ArrayList<>();
                for (int i = 1; i < onesIndex.size(); ++i) {
                    ranges.add(onesIndex.get(i) - onesIndex.get(i - 1) - 1);
                }

                long sol = -1;
                for (int i = ranges.size() - 1; i >= 0; --i) {
                    if (sol == -1) {
                        sol = ranges.get(i) + 1;
                    } else {
                        sol *= ranges.get(i) + 1;
                    }
                }

                System.out.println(sol);
            }

        }
    }

}
