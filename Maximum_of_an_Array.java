import java.util.Scanner;
import java.util.Arrays;
public class Maximum{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=read.nextInt();
        }
        int max=arr[0];
        for(i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         System.out.printf("%d",max);
    }
}
