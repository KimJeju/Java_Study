package polymorphism;

public class polymorphismtest {
    public static void main(String[] args) {
        friend friend = new friend(); //객체변수와 참조변수가 일치 -> 가능
        boyfriend boyfriend = new boyfriend();
        friend girlfriend = new girlfriend(); //객체변수와 참조변수 불일치. -> 가능
       //girlfriend friend1 = new friend(); -> // 불가능

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}

class friend{
    public void friendInfo(){
        System.out.println("나는 당신의 친구입니다.");
    }
}

class boyfriend extends friend{
    public void friendInfo(){
        System.out.println("나는 당신의 남자친구 입니다.");
    }
}

class girlfriend extends friend{
    public void friendInfo(){
        System.out.println("나는 당신의 여자친구입니다.");
    }
}
