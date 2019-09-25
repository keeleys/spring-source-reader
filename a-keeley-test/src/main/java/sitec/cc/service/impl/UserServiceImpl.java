package sitec.cc.service.impl;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;
import sitec.cc.service.UserService;

/**
 *@Author 凉水
 *@Date 2019/9/24 11:13
 **/
@Service
public class UserServiceImpl implements UserService , BeanNameAware {
	@Override
	public void test(){
		System.out.println("print i am userService");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("my name is "+name);
	}
}
