package basic.exam01;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/*
 * ������ �����̳ʸ� ���ؼ� Account�� ���޹��� �� �ֵ��� �۾�
 *	- ��������� ���̺귯���� �߰��ϰ� �۾�
 *  	���̺귯���� : my_lib
 *	- config������ �ۼ��ϰ� bean.xml�� ����
 *	- AccountŬ������ id�� : acc
 */
public class AccountDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//xml�� �Ľ��ؼ� ��ü�� ������ �� �ֵ��� �۾�
		Resource res = new ClassPathResource("/config/bean.xml");
		//factoryŬ�����κ��� ��ü�� ���޹ޱ� ���� factoryŬ���� ����
		BeanFactory factory = new XmlBeanFactory(res);
		//factory���� ��ü�� lookup
		Account acc = (Account)factory.getBean("acc"); 
		//Account acc = new Account();
		acc.setAccId("111-222-3333");
		System.out.println("************������� ���α׷�**************");
		System.out.println("���� �ܾ���:"+acc.getBalance()+"�Դϴ�.");
		System.out.println("� �۾��� �Ͻðڽ��ϱ�?");
		System.out.print("1.�Ա�");
		System.out.print("2.���");
		System.out.println("3.��ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���.");
		int num = key.nextInt();
		switch(num){
			case 1:
				System.out.println("�Աݱݾ��� �Է��ϼ���");
				acc.input(key.nextLong());
				System.out.println(acc.getAccId()
						+"������ �����ܾ��� "+acc.getBalance());
				break;
			case 2:
				System.out.println("��ݱݾ��� �Է��ϼ���");
				acc.output(key.nextLong());
				System.out.println(acc.getAccId()
						+"������ �����ܾ��� "+acc.getBalance());
				break;
			case 3:
				System.out.println(acc.getAccId()
						+"������ �����ܾ��� "+acc.getBalance());
				break;
			default:
				System.out.println("�߸������ϼ̽��ϴ�.");
				System.exit(0);
		}
	}

}









