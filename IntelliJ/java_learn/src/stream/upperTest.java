package stream;
import java.util.Arrays;
import java.util.List;

public class upperTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("kimkunhwi","hello","world","lower");

        list.stream().
                map(m -> m.toUpperCase()).
                forEach(m -> System.out.println(m));
        System.out.println();
    }
}
