package basic.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//ApplicationContext�� ������ �ַ� ���� ���̴�.
public class MySpringTest3 {
	public static void main(String[] args) {
		//xml���������� classpath�� ���� �о�ͼ� ��ü�� �����ϰ� �����ϴ� �����̳ʸ� ����
		ApplicationContext factory = new ClassPathXmlApplicationContext("/basic/config/bean.xml");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("���̵��")
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
