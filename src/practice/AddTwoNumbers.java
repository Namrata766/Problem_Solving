package practice;

/**
 * @author NAMRATA
 * 
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 */
public class AddTwoNumbers {

	public static void main(String args[]) {

		ListNode h1 = new ListNode(7);
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(3);

		h1.next = n1;
		n1.next = n2;

		ListNode h2 = new ListNode(7);
		ListNode m1 = new ListNode(4);
		ListNode m2 = new ListNode(3);

		h2.next = m1;
		m1.next = m2;

		addTwoNumbers(h1, h2);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode curr1 = l1;
		ListNode curr2 = l2;
		ListNode head = null;
		ListNode prev = new ListNode();               
		int c = 0;

		while(curr1 != null || curr2 != null || c > 0) {

			int sum = 0;
			if(curr1 != null && curr2 != null) {
				sum = curr1.val + curr2.val + c;
			} else if(curr1 == null && curr2 != null) {
				sum = curr2.val + c;
			} else if(curr1 != null && curr2 == null) {
				sum = curr1.val + c;
			} else {
				sum = c;
			}          

			ListNode n = new ListNode(sum%10);

			if(head == null) {
				head = n;
				prev = head;
			} else {                          
				prev.next = n;
				prev = prev.next;
			}           

			c = sum/10;

			curr1 = curr1 != null ? curr1.next : null;
			curr2 = curr2 != null ? curr2.next : null;
		}

		return head;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { 
		this.val = val; 
	}
	ListNode(int val, ListNode next) {
		this.val = val; this.next = next; 
	}
}