package sitec.cc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sitec.cc.service.UserService;

/**
 *@Author 凉水
 *@Date 2019/9/24 11:10
 **/
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("sitec.cc");
		applicationContext.getBean(UserService.class).test();
		applicationContext.getBean(UserService.class).test();
	}
}
