package com.dave;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhengdewei
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("haha");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
