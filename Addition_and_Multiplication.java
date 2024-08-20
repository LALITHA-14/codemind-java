import java.util.Scanner;
class Codechef
{
	public static void main (String[] args)
	{
	  Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
        	int a = read.nextInt();
        	int b = read.nextInt();
        	int s = a + b;
        	int p = a * b;
        	System.out.println(s + " " + p);
		}
	}
}
