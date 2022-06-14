import java.math.BigDecimal;
import java.math.RoundingMode;
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

        BigDecimal average = student.getAverage();
        System.out.println(average);


    }
}

class Student{
    String name;
    int[] marks;

    Student(String name,int... marks){
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
        int max = 0;

        for(int mark:marks){
            if(max<mark){
                max = mark;
            }
        }

//        for(int i = 0; i <= marks.length - 1; ++i){
//            if(max < marks[i]){
//                max = marks[i];
//            }
//        }

        return max;
    }

    int getMinimumMark(){
        int min = Integer.MAX_VALUE;

        for(int mark:marks){ //99,100,95,92
            if(mark<min){
                min = mark;
            }
        }
        return min;
    }


    public BigDecimal getAverage() {
        int sum = getToTotalSumMarks();
        int number = getNumberOfmarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP); //빅데시말 소수 3자리 까지 표현 및 4자리 반올림
    }
}
