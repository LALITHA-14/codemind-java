import java.util.Scanner;
public class s{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n;
        n=num.nextInt();
        int sum=(n*(n+1))/2;
        System.out.printf("%d",sum);
    }
}