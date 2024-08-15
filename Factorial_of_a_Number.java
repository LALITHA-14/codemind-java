import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n,i;
        n=read.nextInt();
        int factorial=1;
        for(i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.printf("%d",factorial);
    }
}
