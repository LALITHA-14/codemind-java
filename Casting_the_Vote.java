import java.util.Scanner;
public class vote{
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int x;
        x=v.nextInt();
        if(x>=18){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}