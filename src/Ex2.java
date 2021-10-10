import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String s1 = s.toLowerCase();
        String kt;
        for (int i = 0; i < s1.length(); i+=2) {
            kt = s1.substring(i,i+1);
            s1 = s1.replaceAll(kt, kt.toUpperCase());
        }
        System.out.println(s1);
    }
}
