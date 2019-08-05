package basic.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ApplicationContext가 객체를 어떻게 관리하는지
public class MySpringTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("********ApplicationContext생성전********");
		ApplicationContext factory = new ClassPathXmlApplicationContext("/basic/config/bean.xml");
		System.out.println("********ApplicationContext생성후********");	//여기
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("아이디명")
		System.out.println("********getBean호출후********");
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj){
		System.out.println("*******************************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("*******************************");
	}
	public static void show(MyBeanStyle obj){
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
}
