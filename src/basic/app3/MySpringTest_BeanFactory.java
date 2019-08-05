package basic.app3;
//BeanFactory��� �����̳ʴ� �����ڰ� ������ ��ü�� ���� �����ϴ��� Ȥ��
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MySpringTest_BeanFactory{
	public static void main(String[] args) {
		System.out.println("********resource������********");
		Resource res = new ClassPathResource("/basic/config/bean.xml");
		System.out.println("********XmlBeanFactory������********");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("********XmlBeanFactory������********");
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
