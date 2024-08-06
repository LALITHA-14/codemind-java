import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n,s=0;
        n=num.nextInt();
        while(n!=0){
            s=s+(n%10);
            n=n/10;
        }
        System.out.printf("%d",s);
    }
}