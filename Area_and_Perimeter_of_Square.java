import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a=read.nextInt();
        int area = a*a;
        int perimeter = 4*a;
        System.out.printf("%d %d",area,perimeter);
    }
}
