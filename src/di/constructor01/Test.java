package di.constructor01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/di/config/bean.xml");
			
		MyService myservice = context.getBean("myservice",MyService.class);
		//MyService myservice = (MyService) context.getBean("myservice");
		myservice.testLogic();
	}
}
