package basic.app3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//동일한 bean이 어떻게 관리되는지 살펴본다.
public class MySpringTest4 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/basic/config/bean.xml");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("아이디명")
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("mybean");
		if(obj==obj2){ //같은객체인지확인
			System.out.println("같다.");
		}else{
			System.out.println("다르다");
		}
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
