package stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class flatMap {
    public static void main(String[] args) {
      List<String> list = Arrays.asList("java", "world", "table", "sun");

      list.stream(). //오름차순 정렬
              sorted().forEach(n -> System.out.println(n));
        System.out.println();


        list.stream(). //내림차순 정렬
                sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
        System.out.println();
    }
}
