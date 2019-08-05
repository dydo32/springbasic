package basic.app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 * 	�������� �̿��ؼ� �۾�(�����������ӿ�ũ ���)
 * 	=> ������������ �����̳ʸ� ���ؼ� ������ ��ü�� ���޹޾� ����Ѵ�.
 * 	� �����̳ʸ� ���????? - BeanFactory�� ���� XmlBeanFactory
 * 	1. xml������ �Ľ��ؾ��Ѵ�.
 * 		ClassPathResource�� �۾�
 * 		���� ���������� ���ǵǾ� �ִ� xml ��ο� ���ϸ��� ���
 * 		src��ġ���� xml�� ã�Ƽ� �Ľ��ؼ� ���� ��ü�� ��ȯ�ϴ� �۾�
 * 	2. xml�����κ��� ��ü�� �����ϴ� factoryŬ������ ����
 * 	3. factory�� ���� ���� ����� ��ü�� ���޹޴´�.
 * 		=> ��ü�� ã�ƿ��� ����� ��ü�� ������ �� ����� id���� �̿��ؼ� ã�ƿ´�.(lookup)
 */
public class MySpringTest2 {
	public static void main(String[] args) {
		//1. xml�Ľ�
		Resource res = new ClassPathResource("/basic/config/bean.xml");
		//2. factoryŬ������ ����
		BeanFactory factory = new XmlBeanFactory(res);
		//3. factory�� �����ϴ� ��ü�� ���޹޴´�.
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");	//("���̵��")
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj){
		System.out.println("*******************************");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		System.out.println("*******************************");
	}
	public static void show(MyBeanStyle obj){
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
		obj.testHello("�嵿��");
	}
}
