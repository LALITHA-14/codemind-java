import java.util.Scanner;
public class biggest{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a,b;
        a=n.nextInt();
        b=n.nextInt();
        if(a>b){
            System.out.printf("%d",a);
        }
        else{
            System.out.printf("%d",b);
        }
    }
}