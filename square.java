class Square
{
	public static void main(String arg[])
	{
		int countodd=0,counteven=0,noofrows=10;
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
		}
	}
}