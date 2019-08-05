package basic.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ApplicationContext�� ��ü�� ��� �����ϴ���
public class MySpringTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("********ApplicationContext������********");
		ApplicationContext factory = new ClassPathXmlApplicationContext("/basic/config/bean.xml");
		System.out.println("********ApplicationContext������********");	//����
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("���̵��")
		System.out.println("********getBeanȣ����********");
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj){
		System.out.println("*******************************");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		System.out.println("*******************************");
	}
	public static void show(MyBeanStyle obj){
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
	}
}
