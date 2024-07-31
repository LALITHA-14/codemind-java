import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        int a;
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        double area=3.14*a*a;
        double perimeter=2*3.14*a;
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f",perimeter);
    }
}