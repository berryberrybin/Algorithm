package list;

import java.sql.SQLOutput;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
               /*
            LinkedList.ListIterator i = numbers.listIterator();
            System.out.println(i.next()); 10 출력
            System.out.println(i.next()); 20 출력
            System.out.println(i.hasNext()); true 출력
            System.out.println(i.next()); 30 출력
            System.out.println(i.hasNext()); false 출력
        */

        /*
        while(i.hasNext()){
              System.out.println(i.next())
        }
        */

        /*
        LinkedList.ListIterator i = numbers.listIterator();
        i.add(5);
        i.next();
        i.add(15);
        System.out.println(numbers);  출력 [5,19,15,20,30]
         */
    }
}
