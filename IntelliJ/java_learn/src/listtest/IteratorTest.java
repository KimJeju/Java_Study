package listtest;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String>();

        list.add("java");
        list.add("개어렵다");
        list.add("집에 가고싶다.");
        list.add("머리 깨지겠다.");
        list.add("java");


        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
