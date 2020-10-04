package stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("B");
        sList.add("A");
        sList.add("C");

        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.println(s+" "));
        System.out.println();

        sList.stream().sorted().forEach(s-> System.out.println(s));
    }
}
