package basic.exam01;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/*
 * 스프링 컨테이너를 통해서 Account를 전달받을 수 있도록 작업
 *	- 사용자정의 라이브러리를 추가하고 작업
 *  	라이브러리명 : my_lib
 *	- config폴더를 작성하고 bean.xml로 저장
 *	- Account클래스의 id명 : acc
 */
public class AccountDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//xml을 파싱해서 객체를 생성할 수 있도록 작업
		Resource res = new ClassPathResource("/config/bean.xml");
		//factory클래스로부터 객체를 전달받기 위해 factory클래스 생성
		BeanFactory factory = new XmlBeanFactory(res);
		//factory에서 객체를 lookup
		Account acc = (Account)factory.getBean("acc"); 
		//Account acc = new Account();
		acc.setAccId("111-222-3333");
		System.out.println("************은행업무 프로그램**************");
		System.out.println("현재 잔액은:"+acc.getBalance()+"입니다.");
		System.out.println("어떤 작업을 하시겠습니까?");
		System.out.print("1.입금");
		System.out.print("2.출금");
		System.out.println("3.조회");
		System.out.println("원하는 작업을 선택하세요.");
		int num = key.nextInt();
		switch(num){
			case 1:
				System.out.println("입금금액을 입력하세요");
				acc.input(key.nextLong());
				System.out.println(acc.getAccId()
						+"계좌의 현재잔액은 "+acc.getBalance());
				break;
			case 2:
				System.out.println("출금금액을 입력하세요");
				acc.output(key.nextLong());
				System.out.println(acc.getAccId()
						+"계좌의 현재잔액은 "+acc.getBalance());
				break;
			case 3:
				System.out.println(acc.getAccId()
						+"계좌의 현재잔액은 "+acc.getBalance());
				break;
			default:
				System.out.println("잘못선택하셨습니다.");
				System.exit(0);
		}
	}

}









