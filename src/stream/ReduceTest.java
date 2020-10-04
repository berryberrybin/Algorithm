package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] groupA = {"사과", "오렌지", "파인애플", "귤"};
        String[] groupB = {"해바라기", "장미", "채송화", "안개꽃"};

        System.out.println(Arrays.stream(groupA).reduce("", (s1, s2)
                -> {
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else return s2;
        }));


    String str = Arrays.stream(groupB).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
