package hello.core.member;


//멤버 엔티티
public class Member {

    private long Id;
    private String name;
    //등급
    private Grade grade;

    public Member(long id, String name, Grade grade) {
        Id = id;
        this.name = name;
        this.grade = grade;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
