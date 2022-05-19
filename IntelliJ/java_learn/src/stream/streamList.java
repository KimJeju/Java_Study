package stream;
import java.util.List;

public class streamList {
    public static void main(String[] args) {
        //List에 있는 숫자들 중 4이상의 짝수의 합 구하기
        List<Integer> numbers = List.of(1,3,6,7,8,11);
        int sum =
                numbers.stream().
                        filter(number -> number > 4 && (number % 2 == 0)).
                        mapToInt(number -> number).
                        sum();


        System.out.println("# 명력적 프로그래밍 : " + sum);
    }
}
