import java.util.Scanner;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		if(x>100){
    		    System.out.printf("%d\n",x-10);
    		}
    		else{
    		    System.out.printf("%d\n",x);
    		}
		}
	}
}
