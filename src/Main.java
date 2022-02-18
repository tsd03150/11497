import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        int[] answer = new int[T];

        for (int i = 0; i < T; i++) {
            int n = kb.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = kb.nextInt();
            }
            Arrays.sort(arr);

            int lt = 0;
            int rt = n-1;
            int[] tmp = new int[n];
            for (int k = 0; k < n; k++) {
                if (k % 2 == 0) {
                    tmp[lt++] = arr[k];
                } else {
                    tmp[rt--] = arr[k];
                }
            }

            int ob = tmp[n - 1] - tmp[0];
            for (int l = 0; l < n - 1; l++) {
                ob = Math.max(ob, Math.abs(tmp[l + 1] - tmp[l]));
            }
            answer[i] = ob;
        }


        for (int num : answer) {
            System.out.println(num);
        }

    }

}