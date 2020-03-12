import java.util.Scanner;
class AutomorphicNumber
{
	public static void main (String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int number= input.nextInt();
		int sqnum=number*number;
		
		int count=0;
		int flag=0;
		while(number>0)
		{
		count+=1;
		int rem=sqnum%10;
		int rem1=number%10;
			if(rem==rem1){
				flag+=1	;
			}
		number=number/10;
		sqnum=sqnum/10;
		
		}
		
		if(count==flag){
			System.out.println("Automorphic Number");
		}
		else{
			System.out.println("Not an Automorphic Number");
		}
	}
}
