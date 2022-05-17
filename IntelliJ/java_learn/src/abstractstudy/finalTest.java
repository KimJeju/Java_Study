package abstractstudy;

public class finalTest {

}

final class FinalEx{ //확장 및 상속이 불가능한 클래스
    final int i = 3; //값 변경이 불가능한 변수

    final void getNum(){ //오버라이딩이 불가능한 메서드
        final int LocalInt = i; //상수
        return;
    }
}
