class UpperTriangle
{
	public static void main(String arg[])
	{
		int c=1;
		for(int i=4;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}