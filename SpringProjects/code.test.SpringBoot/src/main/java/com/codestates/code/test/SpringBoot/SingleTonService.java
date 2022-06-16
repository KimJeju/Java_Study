package com.codestates.code.test.SpringBoot;



public class SingleTonService {

    // 1. static 영역에 딱 1개의 객체만 생성
    private static final SingleTonService instance = new SingleTonService();


    // 2. 객체가 필요하면 아래 public static 메서드를 통해서만 조회할 수 있드록 만듬
    public static SingleTonService getInstance(){
        return instance;
    }

    // 3. 생성자를 private로 선언해서 외부에서 new키워드를 사용해 인스턴스를 생성하는 것을 막음
    private SingleTonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체를 호출한다.");
    }
}
