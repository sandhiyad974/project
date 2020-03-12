import java.util.Scanner;
class AutomorphicNumber
{
	public static void main (String arg[])
	{
		Scanner input=new Scanner(System.in);
		int number= input.nextInt();
		int sqnum=number*number;
		
		int count=0;
		int flag=0;
		while(number>0)
		{
		count+=1;
		int a=sqnum%10;
		int e=number%10;
			if(a==e){
				flag+=1	;
			}
		number=number/10;
		sqnum=sqnum/10;
		
		}
		
		if(count==flag){
			System.out.println("true");
		}
		else{
			System.out.println(false);
		}
	}
}
