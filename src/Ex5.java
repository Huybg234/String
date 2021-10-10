import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex5 {
    public static void convert(String s){
        String[] s1= new String[100];
        StringBuffer kq= new StringBuffer();
        StringTokenizer tg= new StringTokenizer(s);
        int i=1;
        while(tg.hasMoreTokens()){
            s1[i]= tg.nextToken();
            i++;
        }
        kq.append(s1[3]).append(" ");
        kq.append(s1[1]).append(" ");
        kq.append(s1[2]).append(" ");
        System.out.println(kq);
    }
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        convert(s);
    }
}

