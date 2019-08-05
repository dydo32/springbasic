package jdbc.firstexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DsTest {
	DriverManagerDataSource ds;
	public void setDs(DriverManagerDataSource ds) {
		this.ds = ds;
	}
	@Override
	public String toString() {
		return "DsTest [ds=" + ds + "]";
	}
	
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("jdbc/config/emp.xml");
		DsTest test = (DsTest)factory.getBean("test");
		System.out.println(test);
		System.out.println(test.ds.getUsername());
	}

}
