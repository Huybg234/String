import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();
        int n = s2.length();
        String s = "";
        String kt;
        for (int i = 0; i < s1.length() - n + 1; i++) {
            kt = s1.substring(i, i + n);
            if (kt.equals(s2)) {
                System.out.println("Vị trí xuất hiện: "+i);
            }
        }
        s1 = s1.replaceAll(s2, s);
        System.out.println(s1);
    }
}
