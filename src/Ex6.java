import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex6 {
    public static void sapxep(String s) {
        String s1;
        StringTokenizer s2 = new StringTokenizer(s);
        int n = s2.countTokens();
        String[] arr= new String[n];
        int i = 0;
        while (s2.hasMoreTokens()) {
            arr[i] = s2.nextToken();
            i++;
        }
        for (int j = 0; j < n - 1; j++)
            for (int l = j + 1; l < n; l++) {
                if (arr[j].compareTo(arr[l]) > 0) {
                    s1 = arr[j];
                    arr[j] = arr[l];
                    arr[l] = s1;
                }
            }

        for (int j = 0; j < n; j++){
            System.out.print(arr[j] + "  ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String s0 = new Scanner(System.in).nextLine();
        sapxep(s0);
    }
}
