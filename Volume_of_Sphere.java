import java.util.Scanner;
public class Volume{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        double sphere = 1.333333*3.14*r*r*r;
        System.out.printf("%.2f",sphere);
    }
}
