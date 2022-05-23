import java.math.BigDecimal;
import java.util.Arrays;
import java.util.*;

public class studentTest {
    public static void main(String[] args) {
        int[] marks = {99,100,95,92};
        Student student = new Student("jon",marks);
        int Number = student.getNumberOfmarks();
        System.out.println(Number);

        int NumSum = student.getToTotalSumMarks();
        System.out.println(NumSum);

        int NumMax = student.getMaxiMumMark();
        System.out.println(NumMax);

        int NumMin = student.getMinimumMark();
        System.out.println(NumMin);

    }
}

class Student{
    String name;
    int[] marks;

    Student(String name,int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfmarks(){
        return marks.length;
    }

    int getToTotalSumMarks(){
        int sum = 0;

        for(int Data:marks){
            sum += Data;
        }

        return sum;
    }

    int getMaxiMumMark(){
        int max = marks[0];

        for(int i = 0; i <= marks.length - 1; ++i){
            if(max < marks[i]){
                max = marks[i];
            }
        }

        return max;
    }

    int getMinimumMark(){
        int min = marks[0];

        for(int i = 0; i <= marks.length - 1; ++i){
            if(min > marks[i]){
                min = marks[i];
            }
        }
        return min;

    }

//    double getAverage(){
//        BigDecimal avg = new BigDecimal(0);
//
//        for(int i = 0; i < marks.length; ++i){
//            avg.divide(()marks[i])
//        }
//    }



}
