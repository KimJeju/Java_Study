package hello.core.singletone;

public class SingleTonService {

    //싱글톤은 자기자신을 내부에 하나 가지고있는다 static으로
    //이렇게 하면 클래스레벨에 올라가기 때문에 자기자신 하나만 존재하게 된다.
    private static final SingleTonService instance = new SingleTonService();


    //싱글톤 조회
    //SingletonService 의 객체를 조회하고싶다면 오직 getInstance 메서드를 사용해서만 조회할 수 있다.
    public static SingleTonService getInstance(){
        return instance;
    }

    //외부 객체생성 방지
    private SingleTonService(){
    }


    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
