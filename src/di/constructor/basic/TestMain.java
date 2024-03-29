package di.constructor.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/di/config/bean.xml");
		System.out.println("컨테이너 생성 후......");
		
		 //타입을 직접 명시해주면 캐스팅하지 않아도 됨 //내부에서 캐스팅됨
		Insa insa = context.getBean("insa",Insa.class);
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);
	}

}
