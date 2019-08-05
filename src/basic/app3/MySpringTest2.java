package basic.app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 * 	스프링을 이용해서 작업(스프링프레임워크 기반)
 * 	=> 스프링내부의 컨테이너를 통해서 생성된 객체를 전달받아 사용한다.
 * 	어떤 컨테이너를 사용????? - BeanFactory의 하위 XmlBeanFactory
 * 	1. xml파일을 파싱해야한다.
 * 		ClassPathResource를 작업
 * 		현재 설정정보가 정의되어 있는 xml 경로와 파일명을 명시
 * 		src위치부터 xml을 찾아서 파싱해서 내부 객체로 변환하는 작업
 * 	2. xml정보로부터 객체를 생성하는 factory클래스를 생성
 * 	3. factory로 부터 내가 사용할 객체를 전달받는다.
 * 		=> 객체를 찾아오는 방법은 객체를 정의할 때 사용한 id명을 이용해서 찾아온다.(lookup)
 */
public class MySpringTest2 {
	public static void main(String[] args) {
		//1. xml파싱
		Resource res = new ClassPathResource("/basic/config/bean.xml");
		//2. factory클래스를 생성
		BeanFactory factory = new XmlBeanFactory(res);
		//3. factory가 관리하는 객체를 전달받는다.
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("아이디명")
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj){
		System.out.println("*******************************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("*******************************");
	}
	public static void show(MyBeanStyle obj){
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
}
