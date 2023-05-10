package B4811;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        long[][] dp = new long[33][33];

        for (int h = 0; h <= 30; h++) {
            for (int w = 0; w <= 30; w++) {
                if (h > w)
                    continue;
                if (h == 0)
                    dp[w][h] = 1;
                else
                    dp[w][h] = dp[w - 1][h] + dp[w][h - 1];
            }
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            System.out.println(dp[N][N]);

        }
    }

}