package B2467;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = N - 1;
        int[] ansArr = new int[2];
        int minAbsValue = 2000000000;

        while (start != end) {
            int value = arr[start] + arr[end];

            if (Math.abs(value) < Math.abs(minAbsValue)) { // 절대값이 작아질때
                ansArr[0] = arr[start];
                ansArr[1] = arr[end];

                minAbsValue = value;
                if (value == 0) { // 절대값이 0이면 종료
                    break;
                }
            }

            if (value > 0) {
                end--;
            } else if (value < 0) {
                start++;
            }
        }

        System.out.println(ansArr[0]);
        System.out.println(ansArr[1]);
    }
}
