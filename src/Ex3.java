import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex3 {
    public static void standardized(String s){
        StringTokenizer s1= new StringTokenizer(s);
        StringBuffer kq= new StringBuffer();
        while(s1.hasMoreTokens()){
            String s2= s1.nextToken();
            s2=s2.toLowerCase();
            String s3= s2.substring(0, 1);
            s2=s2.replaceFirst(s3, s3.toUpperCase());
            kq.append(s2).append(" ");
        }
        System.out.println(kq);
    }
    public static void main(String[] args) {
        String s= new Scanner(System.in).nextLine();
        standardized(s);
    }
}
