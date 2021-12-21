package list;

public class SortedLinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node nextNode;

        public Node(int data) {
            this.data = data;
            nextNode = null;
        }
    }

    public Node search(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentNode;
            }
            currentNode = currentNode.nextNode;
        }
        return null;
    }

    public void addNode(int data) {
        if (head == null) {
            head = new Node(data);
            head.nextNode = null;
        } else {
            Node preNode = head;
            while (preNode.nextNode != null && preNode.nextNode.data < data) {
                preNode = preNode.nextNode;
            }
            Node newNode = new Node(data);
            if (preNode.nextNode == null) {
                preNode.nextNode = newNode;
                newNode.nextNode = null;
            } else {
                newNode.nextNode = preNode.nextNode;
                preNode.nextNode = newNode;
            }
        }
    }

    public void deleteNode(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.nextNode;
            return;
        }
        Node preNode = head;
        while (preNode.nextNode != null) {
            if (preNode.nextNode.data == data) {
                preNode.nextNode = preNode.nextNode.nextNode;
                return;
            }
            preNode = preNode.nextNode;
        }
    }

    public void printNode() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }
    }

    public static void main(String[] args) {
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        //sortedLinkedList.deleteNode(20);
        sortedLinkedList.addNode(5);
        sortedLinkedList.addNode(10);
        sortedLinkedList.addNode(15);
        sortedLinkedList.addNode(20);
        sortedLinkedList.addNode(17);
        sortedLinkedList.deleteNode(30);
//        sortedLinkedList.deleteNode(1);
        sortedLinkedList.printNode();
        System.out.println(sortedLinkedList.search(5).data);

    }
}
