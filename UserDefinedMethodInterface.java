//madhav Branch------------

package stringProject;

public interface UserDefinedMethodInterface 
{
	//to check the 2nd string is starts with 1st string----------
	boolean startsWithMethod(String s1,String s2);
	
	//to check the 2nd string is ends with 1st string----------
	boolean endsWithMethod(String s1,String s2);
	
	//to check the data in 2nd string is same as in 1st string-------
	boolean containsMethod(String s1,String s2);
	
	//to convert the given string in uppercase--------
	String toUpperCaseMethod(String s1);
	
	//to convert the given string in lowercase-------
	String toLowerCaseMethod(String s1);
	
	//to remove the leading and trailing spaces in string-----
	String trimMethod(String s1);
	
	//to replace the char2 with char1-----
	String replaceMethod(String s1,char ch1,char ch2);
	
	//to split the given string-------
	String[] splitMethod(String s1,char ch);
	
	//to Get first index of a string within a string
	int indexOfMethod(String s1,String s2);
	
	//to Get last index of a string within a string
	int lastIndexOfMethod(String s1,String s2);
	
	//To Compare two string lexicographically , ignoring casedifferences-------
	int compareToIgnoreCaseMethod(String s1,String s2);
	
	//to convert the string into character array---------
	char[] toCharArrayMethod(String s1);

}