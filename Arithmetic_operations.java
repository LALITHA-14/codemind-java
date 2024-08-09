import java.util.Scanner;
public class operations{
    public static void main(String[] args){
        Scanner val=new Scanner(System.in);
        int a=val.nextInt();
        int b=val.nextInt();
        int sum=a+b;
        int diff=a-b;
        int pro=a*b;
        int quo=a/b;
        int rem=a%b;
        System.out.printf("Sum:%d
",sum);
        System.out.printf("Difference:%d
",diff);
        System.out.printf("Product:%d
",pro);
        System.out.printf("Quotient:%d
",quo);
        System.out.printf("Remainder:%d
",rem);
    }
}