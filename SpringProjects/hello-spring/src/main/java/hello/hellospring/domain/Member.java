package hello.hellospring.domain;

import java.util.function.Predicate;

public class Member implements Predicate<Member> {


    //데이터를 구분하기 위해서 시스템이 저장하는 아이디
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



}
