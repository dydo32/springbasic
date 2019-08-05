package jdbc.etc.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.employee.EmpDTO;
import jdbc.employee.MyEmpDAO;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext factory = 
				 new ClassPathXmlApplicationContext("jdbc/config/etc.xml");
		MyEmpDAO dao = (MyEmpDAO)factory.getBean("simpledao");
		int result = dao.insert(new EmpDTO("simpleid2","pw","simple","사는곳없음","7급","001"));
		System.out.println("result=>"+result);
	}
}
