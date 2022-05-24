import javax.print.attribute.standard.NumberUp;
import java.math.BigDecimal; //빅데시말
import java.math.RoundingMode; // 빅데시말 올림 컨트롤을 위한 라운딩모드

public class StudentTest2 {
    public static void main(String[] args) {
        Stud stud = new Stud("KimKunhwi",new int[] {90,93,81,85,80});

        int Number = stud.getMarkNumber(); //배열의 수 체크
        System.out.println("건휘의 점수 수 :" + Number); //배열 수 출력

        int sum = stud.getMarkSum(); //점수합계
        System.out.println("건휘의 점수 합계 :" + sum);

        int markMax = stud.getMarkMax();
        System.out.println("건휘의 제일 높은 점수 :" + markMax);

        int markMin = stud.getMarkMin();
        System.out.println("건휘의 제일 낮은 점수 :" + markMin);

        BigDecimal avg = stud.avg();
        System.out.println("건휘의 평균 :" + avg);

    }
}


class Stud{
    String name; //학생이름
    int[] marks; //성적 개수

    Stud(String name,int[] marks){ //생성자
        this.name = name;
        this.marks = marks;
    }

    public int getMarkNumber(){
      return marks.length; // 랭스 메서드로 배열 길이체크
    }

    public int getMarkSum(){
        int sum = 0; //기본값 세팅

        for(int mark:marks){ //향상된 포문 사용 || int형으로 인자를 받아주며 marks에 배열만큼 반복
            sum += mark; //sum = sum + mark || mark의 값들을 스택에 저장
        }

        return sum;
    }

    public int getMarkMax(){ //90,72,81,85,80
        int sum = Integer.MIN_VALUE; //정수의 최소값에서부터 비교 -2147483648

        for(int mark:marks){
            if(sum<mark){
                sum = mark;
            }
        }

        return sum;
    }

    public int getMarkMin(){
        int min = Integer.MAX_VALUE;

        for(int mark:marks){
            if(mark<min){
                min = mark;
            }
        }

        return min;
    }

    public BigDecimal avg(){ // 평균의 정확한 값을 구하기 위해 빅데시말 메서드를 사용하였다.
        int sum = getMarkSum(); // sum 변수에 성적 +값 넣기
        int num = getMarkNumber(); // Num 변수에 성적 개수넣기

        return new BigDecimal(sum).divide(new BigDecimal(num),3, RoundingMode.UP);
               //새로운 빅데시말에 sum을 넣고. divide 후 새로운 빅데시말에 num을 넣어줌 || 3자리 소수까지 표현 및 4자리 반올림
    }


}

