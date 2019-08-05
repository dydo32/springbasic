package jdbc.kitridept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DeptSystem {
	public static void main(String[] args) {
		ApplicationContext factory = 
			 new ClassPathXmlApplicationContext("jdbc/config/dept.xml");
		AbstractUI ui = (AbstractUI)factory.getBean("service");
		while(true){
			ui.show();
		}
		// 부서별근무직원 다시하기
	}

}
