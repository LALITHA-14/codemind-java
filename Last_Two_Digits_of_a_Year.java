import java.util.Scanner;
public class Year{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a=read.nextInt();
        int y=a%100;
        System.out.printf("%02d",y);
    }
}
