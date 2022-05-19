package stream;
import java.util.Arrays;
import java.util.List;

public class streamListTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김건휘", "김시혁", "임도환", "훈발놈","김건휘");

        list.stream().
                distinct(). //중복제거
                forEach(n -> System.out.println(n));
        System.out.println();

        list.stream().
                filter(n -> n.startsWith("김")).
                forEach(n -> System.out.println(n));
        System.out.println();

        list.stream().
                distinct().
                filter(n -> n.startsWith("김")).
                forEach(n -> System.out.println(n));
        System.out.println();

    }
}
