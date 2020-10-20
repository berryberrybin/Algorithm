package list;

import java.util.ListIterator;

public class LinkedList {
    private Node head; // 첫번째 노드를 가르키는 필드
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data; // 데이터가 저장될 필드
        private Node next; //다음 노드 가리키는 필드

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head; // 2번째부터 노드가 새로 생성되면 이전 head값을 통해 다음 노드를 지정함.
        head = newNode;  // head가 newNode 가리키도록 함.
        size++; // size 1 증가 시킴
        if (head.next == null) {
            tail = head; // head의 next 값이 null이라면 tail도 head와 동일한 head 가리키도록 함.
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input); // size가 0일 경우 앞에넣거나 뒤에넣거나 상관없으니 addFrist메소드 사용
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int index) { // 특정 위치의 노드를 찾아내는 방법
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null) { // 다음 노드가 없을때까지 반복문 실행
            str = str + temp.data + " , ";
            temp = temp.next;
        }
        str = str + temp.data; //마지막 노드 출력결과에 포함시킴.
        return str + "]";
    }

    public Object removeFirst() { //첫번째 노드 삭제
        Node temp = head;
        head = temp.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object remove(int k) {
        if (k == 0) {
            return removeFirst(); //
        }
        Node temp = node(k - 1); //temp : 삭제할 노드의 이전 노드
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        Object returnData = todoDeleted.data;
        if (todoDeleted == tail) {
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return returnData;
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }

    public Object get(int k) {
        Node temp = node(k);
        return temp.data;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;
        while (temp.data != data) { //같지 않을때까지 동작 후 같다면 index 반환
            temp = temp.next;
            index++;
            if (temp == null) {
                return -1; // 탐색 대상 없다면 -1 반환
            }
        }
        return index;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private Node next;
        private Node lastReturned;
        private int nextIndex;

        ListIterator() {
            next = head;
        }

        public Object next() {
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }

        public boolean hasNext() {
            return nextIndex < size();
        }

        public void add(Object input) {
            Node newNode = new Node(input);
            if (lastReturned == null) {
                head = newNode;
                newNode.next = next;
            } else {
                lastReturned.next = newNode;
                newNode.next = next;
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
        public void remove(){
            if(nextIndex==0){
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }
}
