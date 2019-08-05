package jdbc.firstexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext factory = 
				 new ClassPathXmlApplicationContext("jdbc/config/hr.xml");
		HrDAO dao = (HrDAO)factory.getBean("mydao");
		System.out.println(dao);
		System.out.println("전체 레코드 수: "+dao.count());
	}
}
