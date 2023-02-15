package stringProject;

public class StringProblemsImplements implements StringProblemsInterface 
{
	
	//Conversion of String elements into character Array---------
	public void myStringToCharArray(String s1) 
	{
		char[] ch=new char[s1.length()];
		for(int i=0; i<s1.length(); i++)
		{
			ch[i]=s1.charAt(i);
			System.out.print(ch[i]+" ");
		}
	}

	
	
	//to get the character at given index-----------------------
	public void getCharAtIndex(String s1, int index) 
	{
		char[] c=s1.toCharArray();
		int d=0;
		for(int i=0; i<c.length; i++)
		{
			if(i==index)
			{
				System.out.println("Character At Index "+index+" is : "+c[i]);
				d++;
			}
		}
		if(d==0)
		System.out.println("Out of Range Index");
	}

	
	//to get index of all characters in Given String------------------
	public void getAllIndex(String s1) 
	{
		char[] ch=new char[s1.length()];
		
		for (int i = 0; i < s1.length(); i++) 
		{
			ch[i]=s1.charAt(i);
			System.out.println(ch[i]+" "+i);
		}
	}

	
	//Repeat each character twice in given String-------------------------
	public void repeatEachCharTwice(String s1) 
	{
		String s2="";
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			s2=s2+ch+ch;
		}
		
		System.out.println(s2);
	}

	
	//To check whether String contains only digit or not---------------------
	public void checkStringContainsOnlyDigit(String s1) 
	{
		if(onlyDigit(s1))
			System.out.println("Only Digit");
		else
			System.out.println("Not only Digit");
	}

	
	//String contains only digit or not--------------------------------
	private static boolean onlyDigit(String s1) 
	{
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)<'0' || s1.charAt(i)>'9')
				return false;
		}
		return true;
	}
		
	

	//Sum of all the digits present in the string------------------------
	public void sumOfDigitInString(String s1) 
	{
		int sum=sumofDigit(s1);
		System.out.println(sum);

	}

	
	//sum of all the digits present in string---------------------------
	private static int sumofDigit(String s1) {

		int sum=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+ch-48;
			}
			
		}
		return sum;
	}

	
	
	//Reverse the given String-----------------------------------
	public void reverseString(String s1) 
	{
		String s2="";
		//by applying normal for loop
		for (int i = 0; i < s1.length(); i++) 
		{
			s2=s1.charAt(i)+s2;
		}
		
		System.out.println(s2);
		
		String s3="";
		// By applying reverse for loop
		for (int i = s1.length()-1; i >=0; i--) 
		{
			s3=s3+s1.charAt(i);
			
		}
		System.out.println(s3);
		
	}

	
	
	//delete all extra blank spaces------------------------------
	public void removeExtraSpaces(String s1) 
	{
		String s=myTrim(s1);
		
		String s2="";
		for (int i = 0; i < s.length()-1; i++) 
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')	
			{}
			else
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}
	private static String myTrim(String s1) 
	{
		int i=0;
		while(true)
		{
			if(s1.charAt(i)==' ')
			i++;
			else
				break;
		}
		
		int j=s1.length()-1;
		while(true)
		{
			if(s1.charAt(i)==' ')
			j--;
			else
				break;
		}
		String s2=""; 
		for (int j2 = i; j2 <= j; j2++) 
		{
			s2=s2+s1.charAt(j2);
		}
		return s2;
		
	}

	
	
	//remove duplicate from given String---------------------------

	public void removeDuplicate(String s1) 
	{
		for(int i=0; i<s1.length(); i++)
		{
			int count=0;
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				count++;
			}
			if(count==0)
			System.out.print(s1.charAt(i));
		}
	}

	//Remove specified character from given String--------------------
	public void removeSpecificCharacter(String s1, char ch) 
	{
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)!=ch)
			System.out.print(s1.charAt(i));
		}
	}
	
	

	//sorting of numbers present in String-------
	public void sortNumbersInString(String s1) 
	{
		char[] c=s1.toCharArray();
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
			}
		}
		s1=new String(c);
		System.out.println(s1);
	}

	

	
	
	//find out max frequency of character in String
	public void maxFrequentChar(String s1) 
	{
		int max=0;
		int index=0;
		for(int i=0; i<s1.length();i++)
		{
			int count=0;
			for(int j=i; j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				count++;
			}
			if(count>max)
			{
				max=count;
				index=i;
			}
		}
		System.out.println(max+"\n"+s1.charAt(index));
	}
	
	
	
	
	//find out second max frequency of character in String
	public void secondMaxFrequentChar(String s1) 
	{
		char[] ca=uniqueElement(s1); //Create Array of unique element 
		
		int[] ia=new int[ca.length];//Create Integer array for the frequency of all character 
		
		
		//Integer array of frequency of all character
		for (int i = 0; i < ca.length; i++) 
		{
			int count=0;
			for (int j = 0; j < s1.length(); j++) 
			{
				if(s1.charAt(j)==ca[i])//Compared each element of String with unique element.
					count++;
			}
			ia[i]=count; //Added frequency of all unique element into integer Array 
		}
		
		//basic sorting of unique character array and Integer array of having frequency 
		for (int i = 0; i < ia.length; i++) 
		{
			for (int j = i+1; j < ia.length; j++) 
			{
				if(ia[i]>ia[j])
				{
					//Frequency array swapping
					int temp=ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
					
					//character array Swapping
					char temp1=ca[i];
					ca[i]=ca[j];
					ca[j]=temp1;
				}
				
			}
		}
		
		//To find out second max first find maximum frequent character
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < ia.length; i++) 
		{
			if(ia[i]>max)
				max=ia[i];
		}
		
		//Now find out second max frequent value and index of that character
		int max2=Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < ia.length; i++) 
		{
			if(ia[i]<max && ia[i]>max2)
			{
				max2=ia[i];
				index=i;//index for getting second most frequent element from character array
			}
		}
		System.out.println(ca[index]+" "+max2);

		
	}

	private static char[] uniqueElement(String s) 
	{
		//Logic for Removing duplicate array

		char [] c=s.toCharArray();//String converted into character array
		
		int uniqueCount=0;
		
		//Calculate unique count for the size of unique character array
		for (int i = 0; i < c.length; i++) 
		{
			int count=0;
			for (int j = 0; j < i; j++) 
			{
				if(c[i]==c[j])
					count++;
			}
			if(count==0)
				uniqueCount++;//size of unique character array
		}
		
		char[] ca=new char[uniqueCount];//size of unique character array with default value 0
		
		int index=0;
		for (int i = 0; i < c.length; i++) 
		{
			int count=0;
			for (int j = 0; j < i; j++) 
			{
				if(c[i]==c[j])
					count++;
			}
			if(count==0)
				ca[index++]=c[i];//Added unique element into Unique element array
		}
		
		return ca;//Returned that unique array
		
	}
	
	
	//check whether given is palindrome or not
	public void isStringPalindrome(String s1) 
	{
		boolean result=isPalindrome(s1);
		
		System.out.println(result?"Palindrome":"Not");
	}

	private static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}



	public void longestSubString(String s1) 
	{
		String s2="";//it will be the longest String-
		
		for (int i = 0; i < s1.length(); i++) 
		{
			for (int j = 0; j < s1.length(); j++) 
			{
				String s3=mySubstring(s1,i,j);
				boolean result=areAllCharacterUnique(s3);
				if(result)
					if(s3.length()>s2.length())
						s2=s3;
			}
		}
		System.out.println(s2);
	}

	private static boolean areAllCharacterUnique(String s1) 
	{
		for(int i=0; i<s1.length();i++)
		{
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					return false;
			}
		}
		return true;
	}

	private static String mySubstring(String s, int i, int j) 
	{
		String s1="";
		for (int k = i; k <=j ; k++) 
		{
			s1=s1+s.charAt(k);
		}
		return s1;
		
		
	}



	public void myEndsWithMethod(String s1, String s2) 
	{
		
		boolean result=myEndsWith(s1,s2);
		System.out.println(result);
	}
	private static boolean myEndsWith(String s1, String s2) 
	{
		if(s2.length()>s1.length())
			return false;
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		
		while(j>=0)
		{
			if(s1.charAt(i)!=s2.charAt(j))
				return false;
			i--;
			j--;
		}
		return true;
	}

	

	
	
//	//sort String in ascending order by length-------------------------
//	public void ascSortByLength(String s1) 
//	{
//		
//		
//	}
//
//	
//	
//	//sort String in descending order by length--------------------------
//	public void dscSortByLength(String s1) 
//	{
//		
//	}
	
	
//	//sorting of array like Dictionary----------------------------------
//	public void sortLikeDictionary(String s1) 
//	{
//		
//	}
}
