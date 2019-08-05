package di.setter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/di/config/setter.xml");
		AbstractPlayer player = context.getBean("player",AbstractPlayer.class);
		
		player.play();
		System.out.println("세번 굴린 주사위의 합:"+player.getTotalValue());
	}
}
