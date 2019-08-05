package basic.app3;
//BeanFactory라는 컨테이너는 개발자가 설정한 객체를 언제 생성하는지 혹인
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MySpringTest_BeanFactory{
	public static void main(String[] args) {
		System.out.println("********resource생성전********");
		Resource res = new ClassPathResource("/basic/config/bean.xml");
		System.out.println("********XmlBeanFactory생성전********");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("********XmlBeanFactory생성후********");
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
