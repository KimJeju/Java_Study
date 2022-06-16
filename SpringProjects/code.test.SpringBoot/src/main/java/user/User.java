package user;

public class User {
    private Long id;
    private String name;
    private UserGrable userGrable;

    public User(Long id, String name, UserGrable userGrable){
        this.id = id;
        this.name = name;
        this.userGrable = userGrable;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String  name){
        this.name = name;
    }

    public UserGrable getUserGrable() {
        return userGrable;
    }

    public void setUserGradle(UserGrable userGrable){
        this.userGrable = userGrable;
    }


}
