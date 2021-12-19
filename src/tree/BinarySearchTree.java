package tree;

public class BinarySearchTree {
    private Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node currentNode = root;
            while (true) {
                if (currentNode.getData() > data) {
                    if (currentNode.getLeftNode() == null) {
                        currentNode.setLeftNode(new Node(data));
                        break;
                    } else {
                        currentNode = currentNode.getLeftNode();
                    }
                } else if (currentNode.getData() < data) {
                    if (currentNode.getRightNode() == null) {
                        currentNode.setRightNode(new Node(data));
                        break;
                    } else {
                        currentNode = currentNode.getRightNode();
                    }
                }
            }
        }
    }

    public Node search(int data) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return currentNode;
            } else if (currentNode.getData() > data) {
                currentNode = currentNode.getLeftNode();
            } else if (currentNode.getData() < data) {
                currentNode = currentNode.getRightNode();
            }
        }
        return null;
    }

    public void remove(int data) {
        Node nodeToDelete = search(data);
        if(nodeToDelete == null){
            return;
        }
        Node parentNode = getParentNode(nodeToDelete);
        if(nodeToDelete.getLeftNode() == null){
            if(parentNode == null){
                root = nodeToDelete.getRightNode();
            } else if(parentNode.getLeftNode() == nodeToDelete){
                parentNode.setLeftNode(nodeToDelete.getRightNode());
            } else {
                parentNode.setRightNode(nodeToDelete.getRightNode());
            }
        } else if(nodeToDelete.getRightNode() == null){
            if(parentNode == null){
                root = nodeToDelete.getLeftNode();
            } else if(parentNode.getLeftNode() == nodeToDelete){
                parentNode.setLeftNode(nodeToDelete.getLeftNode());
            } else{
                parentNode.setRightNode(nodeToDelete.getLeftNode());
            }
        } else {
            Node nodeWithMinData = getNodeWithMinData(nodeToDelete.getRightNode());
            Node parentNodeWithMinData = getParentNode(nodeWithMinData);
            nodeToDelete.setData(nodeWithMinData.getData());
            if(parentNodeWithMinData.getLeftNode() == nodeWithMinData){
                parentNodeWithMinData.setLeftNode(nodeWithMinData.getRightNode());
            } else{
                parentNodeWithMinData.setRightNode(nodeWithMinData.getRightNode());
            }
        }
    }

    private Node getParentNode(Node child) {
        Node currentNode = root;
        if(child == root){
            return null;
        }
        while (currentNode != null) {
            if (currentNode.getLeftNode() == child) {
                return currentNode;
            } else if (currentNode.getRightNode() == child) {
                return currentNode;
            } else if (currentNode.getData() < child.getData()) {
                currentNode = currentNode.getRightNode();
            } else if (currentNode.getData() > child.getData()) {
                currentNode = currentNode.getLeftNode();
            }
        }
        return null;
    }

    private Node getNodeWithMinData(Node root) {
        Node currentNode = root;
        while (currentNode.getLeftNode() != null) {
            currentNode = currentNode.getLeftNode();
        }
        return currentNode;
    }

    public static void traverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        traverse(node.getLeftNode());
        traverse(node.getRightNode());
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(40);
        binarySearchTree.add(30);
        binarySearchTree.add(20);
        binarySearchTree.add(35);
        binarySearchTree.add(45);
        binarySearchTree.add(42);
        binarySearchTree.add(48);
        binarySearchTree.add(47);
        binarySearchTree.add(49);


        Node node = binarySearchTree.search(45);
        System.out.println(node.getData());

        binarySearchTree.remove(45);
//        node = binarySearchTree.search(45);
        System.out.println(node);
        traverse(binarySearchTree.root);
    }
}
