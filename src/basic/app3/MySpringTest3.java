package basic.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//ApplicationContext의 하위가 주로 사용될 것이다.
public class MySpringTest3 {
	public static void main(String[] args) {
		//xml설정파일을 classpath로 부터 읽어와서 객체를 생성하고 관리하는 컨테이너를 생성
		ApplicationContext factory = new ClassPathXmlApplicationContext("/basic/config/bean.xml");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("아이디명")
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
