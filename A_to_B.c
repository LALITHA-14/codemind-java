import java.util.Scanner;
public class num{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a,b,i;
        a=n.nextInt();
        b=n.nextInt();
        for(i=a;i<=b;i++){
            System.out.printf("%d ",i);
        }
    }
}
