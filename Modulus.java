import java.util.Scanner;
public class example{
    public static void main(String[] args){
        int a,b,c;
        Scanner modulus=new Scanner(System.in);
        a=modulus.nextInt();
        b=modulus.nextInt();
        c=a%b;
        System.out.println(c);
    }
}