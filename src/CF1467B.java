import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * URL:https://codeforces.com/contest/1467/problem/B
 * STATUS:
 */
public class CF1467B {

    static int[] arr;
    static int N;

    static boolean valle(int from) {
        return arr[from] < arr[from + 1] && arr[from] < arr[from - 1];
    }

    static boolean hill(int from) {
        return arr[from] > arr[from + 1] && arr[from] > arr[from - 1];
    }

    static int calculate(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; ++i) {
            if (hill(i) || valle(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(in.readLine());
            arr = new int[N];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; ++i) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int inti = calculate(1, arr.length - 2);
            int maxDiff = 0;
            for (int i = 1; i < N - 1; ++i) {
                if (valle(i) || hill(i)) {
                    int countCurrent = 0;
                    int firstDiff = 0;
                    int secondDiff = 0;
                    int aux = arr[i];
                    if (i == 1 && i + 2 < N) {
                        countCurrent = calculate(i, i + 1);
                        arr[i] = arr[i + 1];
                        secondDiff = calculate(i, i + 1);
                        int max = Math.max(countCurrent - firstDiff, countCurrent - secondDiff);
                        maxDiff = Math.max(max, maxDiff);
                    } else if (i == N - 2 && i - 2 >= 0) {
                        countCurrent = calculate(i - 1, i);
                        arr[i] = arr[i - 1];
                        firstDiff = calculate(i - 1, i);
                        int max = Math.max(countCurrent - firstDiff, countCurrent - secondDiff);
                        maxDiff = Math.max(max, maxDiff);
                    } else if( i + 2 < N && i - 2 >= 0){
                        countCurrent = calculate(i - 1, i + 1);
                        arr[i] = arr[i - 1];
                        firstDiff = calculate(i - 1, i + 1);
                        arr[i] = arr[i + 1];
                        secondDiff = calculate(i - 1, i + 1);
                        int max = Math.max(countCurrent - firstDiff, countCurrent - secondDiff);
                        maxDiff = Math.max(max, maxDiff);

                    }
                    arr[i] = aux;
                }
            }

            //  1 5 3 8 2
            //  0 1 2 3 3
            //  1 5 5 8 2
            //
            maxDiff = maxDiff == 0 && inti > 0 ? 1 : maxDiff;
//            System.out.println("maxDiff " + maxDiff);

//            System.out.println("Values : " + Arrays.toString(values));
//            System.out.println("Inti " + inti);
//            System.out.println("maxDiff: " + maxDiff );

            System.out.println(inti - maxDiff);
        }

    }
}
