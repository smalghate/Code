/**
 * 
 */
package com.smalghate.reverse.string;

/**
 * @author s.malghate
 *
 */
public class ReverseStringUsingReverseLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String abc = "abcd";
		int a= abc.length();

		String reverseString="";

		for (int i=a-1;i>=0 ;i--)
		{
		    reverseString= reverseString + abc.charAt(i);
		}
		System.out.println("Reverse String :"+reverseString);
	}

}
