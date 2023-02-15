package stringProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter String : ");
		String s1=scan.nextLine();
		
		StringProblemsInterface s=new StringProblemsImplements();
		
		//System.out.println(s1);
		
		while(true)
		{
			System.out.println("-----------Choose option : ------------\n1.Conversion of String elements into character Array.\n2.Get the character at given index.");
			int input=scan.nextInt();
			
			if(input==1)
			{
				s.myStringToCharArray(s1);
			}
			else if(input==2)
			{
				System.out.println("Enter the index to get character : ");
				int index=scan.nextInt();
				s.getCharAtIndex(s1, index);
				
			}
			else if(input==0)
			{
				System.exit(0);
			}
		}
	}

}
