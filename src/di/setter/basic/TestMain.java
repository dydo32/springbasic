package di.setter.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/di/config/setter.xml");
		System.out.println("�����̳� ���� ��......");
		
		Insa insa = context.getBean("insa",Insa.class); //Ÿ���� ���� ������ָ� ĳ�������� �ʾƵ� ��
														//���ο��� ĳ���õ�
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		insa.addUser(user);
	}
}