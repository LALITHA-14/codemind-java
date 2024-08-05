import java.util.Scanner;
public class time{
    public static void main(String[] args){
        Scanner m=new Scanner(System.in);
        int min;
        min=m.nextInt();
        int hours=min/60;
        int minutes=min%60;
        System.out.printf("%d Hour(s) %d Minute(s)",hours,minutes);
    }
}