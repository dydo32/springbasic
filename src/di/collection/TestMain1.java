package di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/di/config/collection.xml");
		CollectionTest bean = context.getBean("collection", CollectionTest.class);
		bean.getList();
		bean.getMap();
	}
}
