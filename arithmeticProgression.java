import java.util.Scanner;
class ArithmeticProgression
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the total number ?");
		int noOfInput=s.nextInt();

		System.out.println("Enter the starting number ?");
		int start=s.nextInt();

		System.out.println("Enter the difference between consecutive numbers ?");
		int difference=s.nextInt();

		System.out.print(start+", ");
		for(int i=0;i<(noOfInput-1);i++)
		{
			start=start+difference;
			System.out.print(start+", ");
		}


	}
}