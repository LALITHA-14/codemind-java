import java.util.Scanner;
public class num{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a;
        a=n.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}