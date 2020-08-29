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
        while(true){
            if(p==null){ // p가 null이면 검색 실패
                return null;
            }
            int cond = comp(key, p.getKey()); //key와 노드 p의 key값을 비교
            if(cond==0){ // 값이 같으면 겁색 성공
                return p.getValue();
            } else if(cond<0){ // key가 작으면 왼쪽 서브 트리에서 검색
                p = p.left;
            } else{ // key가 크면 오른쪽 트리에서 검색
                p = p.right;
            }

        }
    }

}
