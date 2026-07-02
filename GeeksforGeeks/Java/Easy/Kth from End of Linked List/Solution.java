/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        Stack<Integer> stack = new Stack<>();
        
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        
        if (stack.size() < k)
            return - 1;
        
        while (k != 1) {
            stack.pop();
            k--;
        }
        
        return stack.peek();
    }
}
