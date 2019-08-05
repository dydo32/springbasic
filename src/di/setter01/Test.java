package di.setter01;

import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/di/config/setter.xml");

		MyService myservice = context.getBean("service", MyService.class);
		// MyService myservice = (MyService) context.getBean("service");
		myservice.testLogic();
	}
}
