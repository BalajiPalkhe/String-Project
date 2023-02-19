//Main Branch------------


package stringProject;

public class UserDefinedMethodImplements implements UserDefinedMethodInterface
{
	
	public boolean startsWithMethod(String s1,String s2)
	{
		if(s2.length()>s1.length())
		return false;
		
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)!=s1.charAt(i))
				return false;
		}
		return true;
	}
	
	public boolean endsWithMethod(String s1,String s2)
	{
		if(s2.length()>s1.length())
		return false;
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		for(int k=0;k<s2.length();k++)
		{
			if(s1.charAt(i)!=s2.charAt(j))
				break;
			i--;
			j--;
		}
		return true;
		
	}
	
	public boolean containsMethod(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		return false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}
	
	public String toUpperCaseMethod(String s1)
	{
		String s3="sfg";
		String s2="";
		for(int i=0;i<s3.length();i++)
		{
			char ch=s3.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
				s2=s2+ch;
			}
			else
				s2=s2+ch;
		}
		System.out.println(s2);
		return s2;
	}
	
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
			s2=s1.charAt(k)+s2;
		
		return s2;
	}
	
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
	public int compareToIgnoreCaseMethod(String s1, String s2) 
	{
		s1=toLowerCaseMethod(s1);
		for(int i=0;i<s1.length() &&  i< s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
		}
		return s1.length()-s2.length();
	}

	
	public String replaceMethod(String s1,char ch1,char ch2) {
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

	
	public char[] toCharArrayMethod(String s1) {
		
		char[] ch=new char[s1.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=s1.charAt(i);
		}
		return ch;
	}

	
	public String splitMethod(String s1) {
		String s2="";
		int spacecnt=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
				spacecnt++;
		}
		
		String[] sa=new String[spacecnt+1];
		
		
		int index=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ') {
				sa[index++]=s2;
			    s2="";
			}
			else
				s2=s2+s1.charAt(i);
				
		}
		sa[index++]=s2;
		return s2;
	}
}
