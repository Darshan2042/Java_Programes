public class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        data = key;
    }
}

class mainClass{
    static void printTree(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root .right.left = new Node(5);
    }
}