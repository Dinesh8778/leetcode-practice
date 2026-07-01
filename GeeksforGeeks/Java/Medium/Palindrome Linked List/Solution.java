/*
class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
} */

class Solution {
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;
        while (slow != null) {
            if (slow.data != fast.data) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
    public static Node reversed(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }