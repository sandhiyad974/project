import java.util.Scanner;
class Square
{
	public static void main(String arg[])
	{
		
		//new one
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no of rows ?");
		
		int noOfrows=input.nextInt();
		int number=-(noOfrows);
		
		for(int i=1;i<=noOfrows;i++)
		{
			if(i%2!=0){
				number+=noOfrows;
				for(int j=1;j<=noOfrows;j++)
				{
					number++;
					System.out.print(number);
					
				}
			}
			else{
				number+=noOfrows;
				for(int j=1;j<=noOfrows;j++)
				{
					System.out.print(number);
					number--;
				}
			}
			
			System.out.println();
		}
		
		
		
		
		
		//old one
		/*int countodd=0,counteven=0,noofrows=10;
		for(int i=1;i<=noofrows;i++)
		{
				for(int j=1;j<=noofrows;j++)
				{
					if(i%2!=0)
						{							
							countodd+=1;
							System.out.print(countodd);

						}
						else
						{
								System.out.print(counteven);
								counteven-=1;
						}	
				}
				if(counteven==countodd){
					countodd=counteven+noofrows;
				}
				else{
					counteven=countodd+noofrows;
				}
			System.out.println();
		}*/
	}
}
