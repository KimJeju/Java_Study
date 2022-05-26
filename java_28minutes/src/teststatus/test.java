package teststatus;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        System.out.println(computeWhenDouble(2.3));
    }
    public static int computeWhenDouble(double interestRate) {
        // TODO:

        double rate = 1 + interestRate / 100;
        //원금

        //년
        int year = 0;

        for(double principal = 1;  principal < 2; ++year){
            principal = principal * rate;
        }

        return year;
    }
}
