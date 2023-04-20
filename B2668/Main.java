package B2668;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        arr[0] = 0;
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int count = 0;
            int seq_val = i;
            int first_val = arr[i];
            int[] temp = new int[N + 1]; // 중복을 확인하는 배열
            List<Integer> sampleList = new ArrayList<>();

            while (true) {
                int cur_val = arr[seq_val];

                if (temp[seq_val] != 1) { // 조합인가 판단 중
                    temp[seq_val] = 1;
                    seq_val = cur_val;
                    sampleList.add(count, cur_val);
                } else if (temp[seq_val] == 1 && first_val == cur_val) { // 조합
                    list.addAll(sampleList);
                    sampleList.clear();
                    break;
                } else { // 조합 아님
                    sampleList.clear();
                    break;
                }

                count++;
            }
        }

        list.sort(Comparator.naturalOrder());
        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list.size());
        for (Integer index : list) {
            System.out.println(index);
        }

    }
}
