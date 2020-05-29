import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF454B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[] data = new int[N];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; ++i) {
            int val = Integer.parseInt(st.nextToken());
            data[i] = val;
        }

        boolean ordered = true;
        int index = -1;
        for (int i = 0; i < data.length && ordered; ++i) {
            if (i + 1 < data.length && data[i] > data[i + 1]) {
                ordered = false;
                index = i + 1;
            }
        }
        int res = -1;
        if (ordered)
            res = 0;
        else {
            if (data[index] <= data[0]) {
                ordered = true;
                for (int i = index; i < data.length && ordered; ++i) {
                    if (i + 1 < data.length && data[i] > data[i + 1]) {
                        ordered = false;
                    }
                }
                if (ordered) {
                    if (data[data.length - 1] <= data[0])
                        res = data.length - index;
                    else
                        res = -1;
                } else
                    res = -1;
            } else {
                res = -1;
            }
        }
        System.out.println(res);
    }
}
