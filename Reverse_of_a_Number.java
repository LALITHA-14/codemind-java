import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n,rev=0;
        n=num.nextInt();
        while(n!=0){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        System.out.printf("%d",rev);
    }
}