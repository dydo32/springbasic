package jdbc.employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEmpSystem {
	public static void main(String[] args) {
		ApplicationContext factory = 
			 new ClassPathXmlApplicationContext("jdbc/config/emp.xml");
		AbstractUI ui = (AbstractUI)factory.getBean("service");
		while(true){
			ui.show();
		}
	}
}
