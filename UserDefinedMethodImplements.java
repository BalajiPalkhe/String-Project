//Main Branch------------

package stringProject;

public class UserDefinedMethodImplements implements UserDefinedMethodInterface
{
	
	//to check the 2nd string is starts with 1st string----------
	public boolean startsWithMethod(String s1,String s2)
	{
		if(s2.length()<=s1.length())
		{
			
			for(int i=0;i<s2.length();i++)
			{
				if(s2.charAt(i)!=s1.charAt(i))
				return false;
			}
				return true;
		}
		return false;
	
	}
	
	//to check the 2nd string is ends with 1st string----------
	public boolean endsWithMethod(String s1,String s2)
	{
		if(s2.length()<=s1.length())
		{
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
		return false;
		
		
	}
	
	//to check the data in 2nd string is same as in 1st string------
	public  boolean containsMethod(String s1,String s2)
	{
		if(s1.length()<s2.length())
		return false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				 int j=i+1;
			     int k=1;
			     int cnt=1;
			     while(k<s2.length()&& j<s1.length())
			     {
			    	 if(s1.charAt(j)==s2.charAt(k))
			    		cnt++;
			    	 else
			    		 break;
			    	 j++;
			    	 k++;
			     }
			     if(cnt==s2.length())
			    	 return true;
			}
		}
		return false;
	}
	
	//to convert the given string in uppercase--------
	public String toUpperCaseMethod(String s1)
	{
		
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
				s2=s2+ch;
			}
			else
				s2=s2+ch;
		}
		return s2;
	}
	
	//to convert the given string in lowercase-------
	public String toLowerCaseMethod(String s1)
	{
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
				s2=s2+ch;
			}
			else
				s2=s2+ch;
		}
		return s2;
	}
	
	//to remove the leading and trailing spaces in string-----
	public String trimMethod(String s1)
	{
		String s2="";
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
			if(s1.charAt(j)==' ')
				j--;
			else
				break;
		}
		for(int k=i;k<=j;k++)
			s2=s2+s1.charAt(k);
		
		return s2;
	}
	
	//to Get first index of a string within a string
	public int indexOfMethod(String s1,String s2)
	{
		if(s2.length()>s1.length())
			return -1;
		else if(s2.length()>0)
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					int j=i+1;
					int k=1;
					int cnt=1;
					while(j<s1.length() && k<s2.length())
					{
						if(s1.charAt(j)==s2.charAt(k))
							cnt++;
						else
							break;
						j++;
						k++;
					}
					if(cnt==s2.length())
						return i;
				}
			}
		}
		else {
		return -1;
		}
		return -1;
	}
	
	//to Get last index of a string within a string
	public int lastIndexOfMethod(String s1,String s2)
	{
		if(s2.length()>s1.length())
			return -1;
		else if(s2.length()>0)
		{
			for(int i=s1.length()-1;i>=0;i--)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					int j=i+1;
					int k=1;
					int cnt=1;
					while(j<s1.length() && k<s2.length())
					{
						if(s1.charAt(j)==s2.charAt(k))
							cnt++;
						else
							break;
						j++;
						k++;
					}
					if(cnt==s2.length())
						return i;
				}
			}
		}
		else {
		return -1;
		}
		return -1;
		
	}
	
	//To Compare two string lexicographically , ignoring casedifferences-------
	public int compareToIgnoreCaseMethod(String s1, String s2) 
	{
		s1=toLowerCaseMethod(s1);
		s2=toLowerCaseMethod(s2);
		for(int i=0;i<s1.length() &&  i< s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
		}
		return s1.length()-s2.length();
	}

	//to replace the char2 with char1-----
	public String replaceMethod(String s1,char ch1,char ch2) {
		
		/*String s3="your charcter is not found in String";
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=ch1)
				cnt++;
		}
		if(cnt==s1.length())
			return s3;
		*/
		
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch1)
				s2=s2+ch2;
			else
				s2=s2+s1.charAt(i);
		}
		return s2;
	}

	//to convert the string into character array---------
	public char[] toCharArrayMethod(String s1) {
		
		char[] ch=new char[s1.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=s1.charAt(i);
		}
		return ch;
	}

	//to split the given string-------
	public String[] splitMethod(String s1,char ch) {
		String s2="";
		int spacecnt=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
				spacecnt++;
		}
		
		String[] sa=new String[spacecnt+1];
		
		
		int index=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=ch) 
			{
				s2=s2+s1.charAt(i);
			}
			else
			{
				sa[index++]=s2;
			    s2="";
			}
				
		}
		sa[index++]=s2;
		return sa;
	}
}