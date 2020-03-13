import java.util.Scanner;
class RemoveString
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Sentence ?");
		String sentence=input.nextLine();
		System.out.println("Enter the String to be removed ?");
		String remove=input.nextLine();
	    String removedString=sentence.replace(remove,"");
	    System.out.println(removedString);
	}
}