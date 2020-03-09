import java.util.Scanner;
class SumOfEvenDigits
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number ?");
		int number=input.nextInt();
		int SumOfEvenDigits=0;
		while(number>0)
		{
			int r=number%10;
			if(r%2==0)
			{
				SumOfEvenDigits+=r;
			}
			number=number/10;
		}
		System.out.println("Sum of even digits in the given number : "+SumOfEvenDigits);
	}
}