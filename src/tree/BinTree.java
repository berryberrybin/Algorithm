package tree;

import java.util.Comparator;

public class BinTree<K, V> {
    static class Node<K, V> {
        // 이진트리의 개별노드 나타냄 (key,data,left,right 4개의 필드로 구성되어 있음)
        // 노드 클래스 Node<K,V>는 1개의 생성자와 3개의 메서드가 있음
        private K key; //키 값
        private V data; // 데이터
        private Node<K, V> left; //왼쪽 자식 노드에 대한 참조(왼쪽 포인터)
        private Node<K, V> right; // 오른쪽 자식 노드에 대한 참조 (오른쪽 포인터)

        Node(K key, V data, Node<K, V> left, Node<K, V> right) { // 생성자
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        // 3개의 메서드
        K getKey() {
            return key; // key값을 그대로 반환하는 메서드
        }

        V getValue() {
            return data; // 데이터를 그대로 반환하는 메서드
        }

        void print() {
            System.out.println(data); // 데이터를 출력하는 메서드
        }
    }

    private Node<K, V> root;

    public BinTree() { // root를 null로 하여 노드가 하나도 없는 이진트리 생성하는 클래스 BinTree<K,V>의 생성자
        root = null;
    }

    private int comp(K key1, K key2) { // 두 key 값을 비교하는 comp 메소드
        return ((Comparable<K>) key1).compareTo(key2);
        // Comparable<K> 인터페이스형으로 형변환하고 compareTo 메소드 호출하여 key2와 비교
    }

    // 키 값으로 검색하는 search 메서드 구현
    public V search(K key) {
        Node<K, V> p = root;
        while (true) {
            if (p == null) { // p가 null이면 검색 실패
                return null;
            }
            int cond = comp(key, p.getKey()); //key와 노드 p의 key값을 비교
            if (cond == 0) { // 값이 같으면 겁색 성공
                return p.getValue();
            } else if (cond < 0) { // key가 작으면 왼쪽 서브 트리에서 검색
                p = p.left;
            } else { // key가 크면 오른쪽 트리에서 검색
                p = p.right;
            }

        }
    }

    // 노드를 삽입하는 add 메서드 추가
    // 1) node를 루트로 하는 서브트리에 노드 <K,V> 삽입
    private void addNode(Node<K, V> node, K key, V data) { //선택하는 노드를 node라고 함.
        // 삽입할 키와 node의 키 값을 비교
        int cond = comp(key, node.getKey()); // 값이 같다면 삽입 실패
        if (cond == 0) {
            return;
        } else if (cond < 0) { // key값이 삽입 값보다 작을 경우
            if (node.left == null) { // 왼쪽 자식이 없다면 노드 삽입
                node.left = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.left, key, data); // 선택된 노드를 왼쪽 자식 노드로 옮겨서 다시 본다.
            }
        } else { // key값이 삽입 값보다 클 경우
            if (node.right == null) { // 오른쪽 자식 노드가 없는 경우
                node.right = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.right, key, data); // 선택된 노드를 오른쪽 자식 노드로 옮겨서 다시 본다.
            }
        }
    }

    // 2) 노드 삽입
    public void add(K key, V data) {
        if (root == null) { // root가 null일 경우
            root = new Node<K, V>(key, data, null, null);
        } else {
            addNode(root, key, data); //트리가 비어있지 않으면 메서드 addNode를 호출하여 노드 삽입
        }
    }

    public boolean remove(K key) {
        Node<K, V> p = root; // 현재 보고 있는 노드 (삭제할 노드와 비교대상)
        Node<K, V> parent = null; // 현재 보고 있는 노드의 부모 노드
        boolean isLeftChild = true; // p는 부모의 왼쪽 자식 노드인가?

        // 실제 삭제할 key 검색
        while (true) {
            if (p == null) { // 더이상 진행되지 않으며,
                return false; // 삭제할 key 값이 없다.
            }
            int cond = comp(key, p.getKey()); // key와 현재 보고 있는 노드(p)의 key값 비교
            if (cond == 0) { // 삭제할 key값 검색 성공
                break;
            } else {
                parent = p; // 가지로 내려가지 전에 부모 저장
                if (cond < 0) { // p.getKey()보다 삭제할 key값이 작으면 왼쪽 자식으로 내려감
                    isLeftChild = true;
                    p = p.left;
                } else { // 삭제할 key값이 크면 오른쪽 자식으로 내려감
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }
        //1. 삭제할 노드의 왼쪽 자식이 없을 경우
        if (p.left == null) {
            if (p == root) { // a. 삭제할 노드가 root이면, 삭제할 노드의 오른쪽을 root로 바꿔 줌
                root = p.right;
            } else if (isLeftChild) { // b. 삭제할 노드가 부모의 왼쪽 자식일 경우
                parent.left = p.right; // 부모의 왼쪽을 삭제할 노드의 오른쪽 자식과 연결
            } else { // c. 삭제할 노드가 부모의 오른쪽 자식일 경우
                parent.right = p.right; // 부모의 오른쪽을 삭제할 노드의 오른쪽 자식과 연결
            }
            // 2. 삭제할 노드의 오른쪽 자식이 없을 경우
        } else if (p.right == null) {
            if (p == root) {
                root = p.left;
            } else if (isLeftChild) {
                parent.left = p.left;
            } else {
                parent.right = p.left;
            }
            // 3. 삭제할 노드의 자식이 2개일 경우
        } else {
            // "왼쪽"서브트리(p.left)에서 가장 큰 키값(가장 오른쪽에 위치)을 갖는 노드를 검색
            parent = p;
            Node<K, V> MaxNodeOfLeftSubTree = p.left;
            isLeftChild = true;
            while (MaxNodeOfLeftSubTree.right != null) {
                parent = MaxNodeOfLeftSubTree;
                MaxNodeOfLeftSubTree = MaxNodeOfLeftSubTree.right;
                isLeftChild = false;
            }
            // MaxNodeOfLeftSubTree를 삭제 위치로 옮김
            p.key = MaxNodeOfLeftSubTree.key;
            p.data = MaxNodeOfLeftSubTree.data;

            // 옮긴 노드의 자식 포인터 재구성
            if (isLeftChild) {
                parent.left = MaxNodeOfLeftSubTree.left;
            } else {
                parent.right = MaxNodeOfLeftSubTree.left;
            }
        }
        return true;
    }

    // 노드의 킥밧의 오름차순으로 출력
    private void printSubTree(Node node) {
        if (node != null) {
            printSubTree(node.left);
            System.out.println(node.key + " " + node.data);
            printSubTree(node.right);
        }
    }

    public void print() {
        printSubTree(root);
    }

    public static void main(String[] args) {
        BinTree<Integer, String> binTree = new BinTree<>();
        binTree.add(1, "one");
        binTree.add(10, "ten");
        binTree.add(3, "three");
        binTree.add(5, "five");
        binTree.add(4, "four");
        binTree.add(7, "seven");
        binTree.add(8, "eight");
        binTree.add(2, "two");
        binTree.print();
    }
}

