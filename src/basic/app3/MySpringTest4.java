package basic.app3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//������ bean�� ��� �����Ǵ��� ���캻��.
public class MySpringTest4 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/basic/config/bean.xml");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("���̵��")
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("mybean");
		if(obj==obj2){ //������ü����Ȯ��
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���");
		}
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
