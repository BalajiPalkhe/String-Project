//Main Branch------------

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
		UserDefinedMethodInterface sc=new UserDefinedMethodImplements();
		
		//System.out.println(s1);
		
		while(true)
		{
			System.out.println("-----------Choose option : ------------"
					+ "\n1.Conversion of String elements into character Array."
					+ "\n2.Get the character at given index."
					+ "\n3.get index of all characters in Given String."
					+ "\n4.Repeat each character twice in given String."
					+ "\n5.Check whether String contains only digit or not."
					+ "\n6.Sum of all the digits present in the string."
					+ "\n7.Reverse the given String."
					+ "\n8.Remove all extra blank spaces."
					+ "\n9.Remove duplicate from given String."
					+ "\n10.Remove specified character from given String."
					+ "\n11.Sorting of characters present in String."
					+ "\n12.Find out max frequency of character in String."
					+ "\n13.Find out second max frequency of character in String."
					+ "\n14.Check whether given is palindrome or not."
					+ "\n15.Find out longest sub string from the given String."
					+ "\n16.Check whether the given String starts with another string or not."
					+ "\n17.Check whether a given string ends with the contents of another string."
					+ "\n18.Compare two string lexicographically , ignoring casedifferences."
					+ "\n19.Check whether two string objects contains same data."
					+ "\n20.Get first index of a string within a string."
					+ "\n21.Get last index of a string within a string."
					+ "\n22.Replace the character1 with character2."
					+ "\n23.Convert all the characters in string uppercase."
					+ "\n24.Convert all the characters in string lowercase."
					+ "\n25.Trim any leading and trailing whitespaces from given string."
					+ "\n0.Exit the program");
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
				System.out.println("Enter the String that you want check :");
				String s2=scan.next();
				
				boolean result=sc.startsWithMethod(s1, s2);
				
				if(result)
					System.out.println("1st String starts with the string that you have entered.");
				else
					System.out.println("1st String does not starts with the string that you have entered.");
	
			}
			else if(input==17)
			{
				
				System.out.println("Enter the String that you want check : ");
				String s2=scan1.nextLine();
				
				boolean result=sc.endsWithMethod(s1,s2);
				
				if(result)
					System.out.println("1st String ends with the string that you have entered.");
				else
					System.out.println("1st String does not ends with the string that you have entered.");
				
			}
			else if(input==18)
			{
				System.out.println("Enter the 2nd string to compare with first sring: ");
				String s2=scan.next();
				
				int result=sc.compareToIgnoreCaseMethod(s1, s2);
				System.out.println(result);

			}
			else if(input==19)
			{
				System.out.println("Enter the String that you want check : ");
				String s2=scan.next();
				
				boolean result=sc.containsMethod(s1,s2);
				
				if(result)
					System.out.println("2nd String contains the same data as in 1st string.");
				else
					System.out.println("2nd String does not contains the same data as in 1st string.");	
			}
			else if(input==20)
			{
				System.out.println("Enter the String that you want check :");
				String s2=scan.next();
				
				int result= sc.indexOfMethod(s1,s2);
				
				if(result==-1)
					System.out.println("Your 2nd string is not found in 1st String");
				else
					System.out.println("Your 2nd string is found in 1st String at index: "+result);
				
			}
			else if(input==21)
			{
				System.out.println("Enter the String that you want check :");
				String s2=scan.next();
				
				int result= sc.lastIndexOfMethod(s1,s2);
				
				if(result==-1)
					System.out.println("Your 2nd string is not found in 1st String");
				else
					System.out.println("Your 2nd string is found in 1st String at index: "+result);
	
			}
			else if(input==22)
			{
				System.out.println("Enter the character to replace:");
				char ch1=scan.next().charAt(0);
				
				System.out.println("Enter the character to replace with 1st character:");
				char ch2=scan.next().charAt(0);
				
				String s3=sc.replaceMethod(s1,ch1,ch2);
				System.out.println("your replaced characters String is:");
				System.out.println(s3);
			}
			else if(input==23)
			{
				String s2=sc.toUpperCaseMethod(s1);
				System.out.println(s2);
			}
			else if(input==24)
			{
				String s2=sc.toLowerCaseMethod(s1);
				System.out.println(s2);
			}
			else if(input==25)
			{
				String s2=sc.trimMethod(s1);
				System.out.println(s2);
			}
			else if(input==0)
			{
				System.exit(0);
			}
		}
	}

}