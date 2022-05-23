package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        System.out.println(list);

        Stream<Integer> stream = Stream.of(1,2,3,4,5).filter(n -> n > 2);

        System.out.println("# not processed stream");
        System.out.println("# invoke terminal operation");
        stream.forEach(System.out::println); // 최종 연산을 호출해야 그때서야 작업 한다. lazy evaluation

    }
}
