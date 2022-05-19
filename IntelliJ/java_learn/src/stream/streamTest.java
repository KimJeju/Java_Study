package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamTest {
    public static void main(String[] args) {


        Stream<String> stringStream = Stream.of("a","b","c","d");//가변인자
        Stream<String> stringStream1 = Stream.of(new String[] {"a","b","c"});
        Stream<String> stringStream2 = Arrays.stream(new String[] {"a","b","c"});
        Stream<String> stringStream3 = Arrays.stream(new String[] {"a","b","c"}, 0,3);


        /* 리스트로부터 스트림 생성
        List<String> list = Arrays.asList("a","b","c","d"); //오리지널 스트림
        Stream<String> stringStream = list.stream(); //
        stringStream.forEach(System.out::println);
         */
    }
}
