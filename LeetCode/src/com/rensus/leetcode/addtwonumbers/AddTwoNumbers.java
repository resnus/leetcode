package com.rensus.leetcode.addtwonumbers;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 * @author resnus
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		int[] a = {2, 4, 3};
		int[] b = {5, 6, 4};
		ListNode l1 = AddTwoNumbers.create(a);
		AddTwoNumbers.iterate(l1);
		ListNode l2 = AddTwoNumbers.create(b);
		AddTwoNumbers.iterate(l2);
		// TODO Auto-generated method stub
		AddTwoNumbers adder = new AddTwoNumbers();
		ListNode nd = adder.addTwoNumbers(l1, l2);
		AddTwoNumbers.iterate(nd);

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode temp = null;
		int x;
		int y;
		int sum;
		int newVal;
		int carry = 0;
		
		while(l1 != null || l2 != null){
			x = (l1 == null) ? 0 : l1.val;
			y = (l2 == null) ? 0 : l2.val;
			sum = x + y + carry;
			newVal = sum % 10;
			carry = sum / 10;
			if(result == null) {
				result = new ListNode(newVal);
				temp = result;
			}else {
				result.next = new ListNode(newVal);
				result = result.next;
			}
			l1 = (l1 == null) ? null : l1.next; 
			l2 = (l2 == null) ? null : l2.next;
			if(l1 == null && l2 == null && carry > 0){
				result.next = new ListNode(carry);
			}
		}
		
		return temp;
	}
	
	public static ListNode create(int[] digits){
		ListNode ln = null, temp = null;
		for(int i = 0; i < digits.length; i++){
			if(ln == null ) {
				ln = new ListNode(digits[i]);
				temp = ln; // Save original reference
			}else{
				ln.next = new ListNode(digits[i]);
				ln = ln.next;
			}
		}
		return temp;
	}
	
	public static void iterate(ListNode ln){
		while(ln != null){
			System.out.print(" " + ln.val);
			if(ln.next != null) System.out.print(" ->");
			ln = ln.next;
		}
		System.out.println("\n");
	}
	
}
