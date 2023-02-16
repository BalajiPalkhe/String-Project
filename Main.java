package stringProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1=scan.nextLine();
		
		StringProblemsInterface s=new StringProblemsImplements();
		
		//System.out.println(s1);
		
		while(true)
		{
			System.out.println("-----------Choose option : ------------\n1.Conversion of String elements into character Array.\n2.Get the character at given index.\n3.get index of all characters in Given String.\n4.Repeat each character twice in given String.\n5.Check whether String contains only digit or not.\n6.Sum of all the digits present in the string.\n7.Reverse the given String.\n8.Remove all extra blank spaces\n9.Remove duplicate from given String\n10.Remove specified character from given String\n11.Sorting of numbers present in String\n12.Find out max frequency of character in String\n13.Find out second max frequency of character in String\n14.Check whether given is palindrome or not.\n15.Find out longest sub string from the given String.\n16.Check whether the given String ends with another string or not.\n0.Exit the program");
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
			else if(input==3)
			{
				s.getAllIndex(s1);
			}
			else if(input==4)
			{
				s.repeatEachCharTwice(s1);
			}
			else if(input==5)
			{
				s.checkStringContainsOnlyDigit(s1);
			}
			else if(input==6)
			{
				s.sumOfDigitInString(s1);
			}
			else if(input==7)
			{
				s.reverseString(s1);
			}
			else if(input==8)
			{
				s.removeExtraSpaces(s1);
			}
			else if(input==9)
			{
				s.removeDuplicate(s1);
			}
			else if(input==10)
			{
				System.out.println("Enter the character you want to remove : ");
				char ch=scan.next().charAt(0);
				s.removeSpecificCharacter(s1, ch);
			}
			else if(input==11)
			{
				s.sortNumbersInString(s1);
			}
			else if(input==12)
			{
				s.maxFrequentChar(s1);
			}
			else if(input==13)
			{
				s.secondMaxFrequentChar(s1);
			}
			else if(input==14)
			{
				s.isStringPalindrome(s1);
			}
			else if(input==15)
			{
				s.longestSubString(s1);
			}
			else if(input==16)
			{
				System.out.println("Enter the String that you want check : ");
				String s2=scan1.nextLine();
				boolean result=s.myEndsWith(s1,s2);
				if(result)
					System.out.println("1st String ends with the string that you have entered.");
				else
					System.out.println("1st String does not ends with the string that you have entered.");
				s.myEndsWith(s1, s2);
			}
			else if(input==0)
			{
				System.exit(0);
			}
		}
	}

}
