package listtest;

import java.util.ArrayList;
import java.util.List;

public class arrayListTest {
    public static void main(String[] args) {
      List<String> car = new ArrayList<>();

      car.add("포르쉐"); //String 객체 생성/저장
      car.add("지프");
      car.add("제네시스");

      int size = car.size(); // 배열의 사이즈 얻어오기
        String Skill = car.get(0);

        for(int i = 0; i <= car.size(); ++i){ //배열의 크기만큼 순회 출력
            String str = car.get(i);
            System.out.println(i + ':' + str);
        }

        car.remove(0); // 인덱스 0번 삭제

    }
}
