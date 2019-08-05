package di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/di/config/collection.xml");
		ConstructorTest constructor1 = context.getBean("constructor1", ConstructorTest.class);
		ConstructorTest constructor2 = context.getBean("constructor2", ConstructorTest.class);
		ConstructorTest constructor3 = context.getBean("constructor3", ConstructorTest.class);
		System.out.println(constructor1);
		System.out.println(constructor2);
		System.out.println(constructor3);
	}
}
