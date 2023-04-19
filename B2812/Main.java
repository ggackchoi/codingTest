package B2812;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        String input = br.readLine();
 
        char[] arr = input.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            // 데크의 맨 뒤의 값이 arr[i]보다 작으면 삭제한다.
            // 아래 조건을 만족할 때까지 반복.
            while (K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
                dq.removeLast();
                K--;
            }
            dq.addLast(arr[i]);
        }
 
        StringBuilder ans = new StringBuilder();
        // 위 for문에서 K가 0이 되기 전에 끝난 경우를 대비하여
        // dq.size() - K만큼만 출력한다.
        while (dq.size() > K) {
            ans.append(dq.removeFirst());
        }
 
        bw.write(ans.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
}

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class Main {

// public static void main(String[] args) throws Exception {
// Scanner sc = new Scanner(System.in);

// int N = sc.nextInt();
// int K = sc.nextInt();
// String input = sc.next();

// char[] arr = input.toCharArray();
// List<Character> list = new ArrayList<>();

// for (int i = 0; i < arr.length; i++) {
// // 데크의 맨 뒤의 값이 arr[i]보다 작으면 삭제한다.
// // 아래 조건을 만족할 때까지 반복.
// while (K > 0 && !list.isEmpty()) {
// if (list.get(list.size() - 1) < arr[i]) {
// list.remove(list.size() - 1);
// K--;
// } else {
// break;
// }
// }

// list.add(list.size(), arr[i]);
// }

// String ans = "";
// for (int i = 0; i<list.size(); i++) {
// ans += list.get(i);
// }

// System.out.println(ans);
// }
// }
