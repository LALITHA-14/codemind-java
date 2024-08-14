import java.util.Scanner;
import java.util.Arrays;
public class Sum{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=read.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.printf("%d",sum);
    }
}
