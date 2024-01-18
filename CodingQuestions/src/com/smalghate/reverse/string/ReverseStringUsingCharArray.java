/**
 * 
 */
package com.smalghate.reverse.string;

/**
 * @author s.malghate
 *
 */
public class ReverseStringUsingCharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "SHUBHAM";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String string) {
		if (string.isEmpty())
			throw new IllegalArgumentException("Invalid Input");

		StringBuilder out = new StringBuilder();

		char[] chars = string.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
}
