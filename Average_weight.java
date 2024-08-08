import java.util.Scanner;
public class weight{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int x,b1,b2;
        x=a.nextInt();
        b1=a.nextInt();
        b2=a.nextInt();
        int avg=3*x-b1-b2;
        System.out.printf("%d",avg);
    }
}