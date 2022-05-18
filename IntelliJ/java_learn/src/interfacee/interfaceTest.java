package interfacee;

public abstract class interfaceTest {
    public static final int rock = 1; //인터페이스 인스턴 변수 정의
    final int scissors = 2; // public static 생략
    static int paper = 3;

    public abstract String getPlayNum();
    abstract void call(); //public  생략
}


