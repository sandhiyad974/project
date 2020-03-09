import java.util.Scanner;
class Reverse
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number ?");
		int number=input.nextInt();
		int reverseNumber=0;
		
		while(number>0)
		{
			int digit=number%10;
			reverseNumber=reverseNumber*10+digit;
			number=number/10;	
			
		}
		System.out.println("reverseNumber : "+reverseNumber);
		
	}
}