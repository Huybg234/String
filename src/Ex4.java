import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex4 {
    public static void main(String[] args) {
        int max=1;
        int n=0;
        String s = new Scanner(System.in).nextLine();
        String[] arr= new String[100];
        StringTokenizer s1= new StringTokenizer(s);
        while(s1.hasMoreTokens()){
            arr[n]= s1.nextToken();
            n++;
        }
        for(int i=0;i<n;i++){
            if(arr[i].length()>max) {
                max=arr[i].length();
            }
        }
        System.out.println(max);
        for(int i=0;i<n;i++){
            if(arr[i].length()==max){
                System.out.println(i);
            }
        }
    }
}
