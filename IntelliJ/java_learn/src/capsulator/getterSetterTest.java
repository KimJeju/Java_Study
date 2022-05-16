package capsulator;

public class getterSetterTest {
    public static void main(String[] args) {
        Warker w = new Warker();
        w.setName("김코딩");
        w.setId("프로그래머");
        w.setAge(5);

        String name = w.getName();
        System.out.println(name);

        String id = w.getId();
        System.out.println(id);

        int age = w.getAge();
        System.out.println(age);
    }
}

class Warker{
    private String name; // 변수의 은닉화, 외부로 부터 접근 불가
    private String id;
    private int age;

    public String getName(){ //멤버 변수의 값
        return name;
    }

    public void setName(String name){ //멤버 변수의 값 변겅
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 1) return;
        this.age= age;
    }

}
