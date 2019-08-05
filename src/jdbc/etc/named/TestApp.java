package jdbc.etc.named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.employee.EmpDTO;
import jdbc.employee.MyEmpDAO;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext factory = 
				 new ClassPathXmlApplicationContext("jdbc/config/etc.xml");
		MyEmpDAO dao = (MyEmpDAO)factory.getBean("namedao");
		int result = dao.insert(new EmpDTO("id18","pw","named","named테스트","7급","001"));
		System.out.println("result=>"+result);
	}
}
