package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member{


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //데이터를 구분하기 위해서 시스템이 저장하는 아이디
    private Long id;

    private String name;
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





}
