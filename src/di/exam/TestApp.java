package di.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/di/config/setter.xml");
		InterMessage bean = context.getBean("messagebean", InterMessage.class);
		bean.sayHello();
	}
}
