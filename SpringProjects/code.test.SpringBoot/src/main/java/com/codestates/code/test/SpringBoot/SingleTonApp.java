package com.codestates.code.test.SpringBoot;
import com.codestates.code.test.SpringBoot.user.User;
import com.codestates.code.test.SpringBoot.user.UserService;
import com.codestates.code.test.SpringBoot.user.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingleTonApp {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    //싱글톤 컨테이너 테스트 코드
    static UserService ac1 = ac.getBean("userService", UserService.class);
    static UserService ac2 = ac.getBean("userService", UserService.class);

    public static void main(String[] args) {
        System.out.println(ac1);
        System.out.println(ac2);
    }
}
