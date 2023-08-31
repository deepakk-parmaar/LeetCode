/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Node curr = root;
        if (root == null) {
            return root;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(curr);
        q.add(null);

        while (q.peek()!=null) {
            while (q.peek() != null) {
                Node temp = q.poll();
                temp.next = q.peek();

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            q.poll();
            q.add(null);
            
        }
    }
}