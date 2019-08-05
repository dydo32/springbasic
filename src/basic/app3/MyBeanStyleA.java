package basic.app3;

public class MyBeanStyleA implements MyBeanStyle{
	public MyBeanStyleA(){
		System.out.println("MyBeanStyleA의 기본생성자 - 생성완료");
	}
	public void testHello(String name){
		System.out.println("안녕하세요....."+name);
	}
}
