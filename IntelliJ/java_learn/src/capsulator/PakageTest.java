package capsulator;

class PakageTest { // 패키지 테스트의 접근제어자는 public (클래스내 O, 패키지 내 O, 다른패키지 하위클래스 O, 패키지 외 O)
    public static void main(String[] args) { // 메인의 접근 제어자는 public (클래스내 O, 패키지내 O, 다른패키지 하위클래스 O, 패키지 외 O)

        Father f = new Father();
        System.out.println(f.a);
        System.out.println(f.b);
        System.out.println(f.c);
        // System.out.println(f.d); private 로 동일 클래스 내에 선언된 것이 아니기에 오류가 뜬다.
    }
}

class Father{ //Father class 의 접근 제어자는 default (클래스 내 O, 패키지 내 O,다른패키지 하위클래스 X, 패키지 외 X)
    public int a = 1; //public  (클래스 내 O, 패키지 내 O,다른패키지 하위클래스 O, 패키지 외 O)
    int b = 2;  //default  (클래스 내 O, 패키지 내 O,다른패키지 하위클래스 X, 패키지 외 X)
    protected int c = 3; //protected  (클래스 내 O, 패키지 내 O,다른패키지 하위클래스 O, 패키지 외 X)
    private int d = 4; //private  (클래스 내 O, 패키지 내 X,다른패키지 하위클래스 X, 패키지 외 X)

    public void output(){ //동일클래스 내에 있기 떄문에 오류발생 X
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


}
