package tree;

public class BinaryTree {
    Node root;

    public static void traverse(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.getData());
        traverse(node.getLeftNode());
        traverse(node.getRightNode());
    }

    public static void main(String[] args) {
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);
        Node nodeG = new Node(7);
        nodeA.setLeftNode(nodeB);
        nodeA.setRightNode(nodeC);
        nodeB.setLeftNode(nodeD);
        nodeB.setRightNode(nodeE);
        nodeC.setLeftNode(nodeF);
        nodeC.setRightNode(nodeG);
        traverse(nodeA);
    }

}
