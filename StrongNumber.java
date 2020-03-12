import java.util.Scanner;
class StrongNumber
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=input.nextInt();
		int temp=number;
		int factorial=0;
		while(temp>0)
		{
			int rem=temp%10;
			int sum=1;
			for(int i=rem;i>0;i--)
			{
				sum=sum*i;
			}
			factorial+=sum;
			temp=temp/10;
		}
		if(number==factorial)
		{
			System.out.println("StrongNumber");
		}
		else
		{
			System.out.println("Not StrongNumber");
		}
	}
}