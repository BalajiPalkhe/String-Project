package stringProject;

public interface StringProblemsInterface 
{
	//Conversion of String elements into character Array---------
	void myStringToCharArray(String s1);
	
	//to get the character at given index-----------
	void getCharAtIndex(String s1,int index);
	
	//to get index of all characters in Given String-----------
	void getAllIndex(String s1);
	
	//Repeat each character twice in given String------------
	void repeatEachCharTwice(String s1);
	
	//To check whether String contains only digit or not----------- 
	void checkStringContainsOnlyDigit(String s1);
	
	//Sum of all the digits present in the string--------------
	void sumOfDigitInString(String s1);
	
	//Reverse the given String--------
	void reverseString(String s1);	
	
	//delete all extra blank spaces------
	void removeExtraSpaces(String s1);
	
	//remove duplicate from given String-----------
	void removeDuplicate(String s1);
	
	//Remove specified character from given String------
	void removeSpecificCharacter(String s1,char ch);
	
	//sorting of numbers present in String-------
	void sortNumbersInString(String s1);
	
	//find out largest and smallest word in given String-----
	//void largestAndSmallestWord(String s1);
	

	//find out max frequency of character in String------------------------
	void maxFrequentChar(String s1);
	
		
	//find out second max frequency of character in String------------------
	void secondMaxFrequentChar(String s1);
	
	
	//check whether given is palindrome or not------------------------
	void isStringPalindrome(String s1);
	
	
	
	//to find out longest sub string from the given String------------------
	void longestSubString(String s1);
	

	//check whether the given String ends with another string or not-------------------
	public boolean myEndsWith(String s1, String s3);
	
	
	
	
//	//sort String in ascending order by length
//	void ascSortByLength(String s1);
//	
//	//sort String in descending order by length
//	void dscSortByLength(String s1);
//	
//	//sorting of array like Dictionary----------
//	void sortLikeDictionary(String s1);

}
