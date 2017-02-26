package com.rensus.leetcode.palindromenumber;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber p = new PalindromeNumber();
		int x = 12344321;
		System.out.println(p.isPalindrome(x));
	}

    public boolean isPalindrome(int x) {
    	String s = String.valueOf(x);
    	StringBuilder sb = new StringBuilder(s);
    	if(s.equals(sb.reverse().toString())){
    		return true;
    	}
    	return false;
    }
}
