package di.constructor.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/di/config/bean.xml");
		System.out.println("�����̳� ���� ��......");
		
		 //Ÿ���� ���� �������ָ� ĳ�������� �ʾƵ� �� //���ο��� ĳ���õ�
		Insa insa = context.getBean("insa",Insa.class);
		
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		insa.addUser(user);
	}

}