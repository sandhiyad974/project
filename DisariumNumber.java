import java.util.Scanner;
class DisariumNumber
{
	public static void main(String arg[])
  {
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    String s=String.valueOf(number);
    int temp=number;
    double position=s.length();
    int sum=0;
    while(temp>0)
    {
      
      double rem=temp%10;
      double val=Math.pow(rem,position);
      sum+=val;
      position-=1;
      temp=temp/10;
    }
    if(sum==number)
    {
      System.out.println("It is a DisariumNumber ! ");
    }
    else
    {
      System.out.println("It is not a DisariumNumber ! ");
    }
  }
}
