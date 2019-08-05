package basic.app3;

public class MyBeanStyleB implements MyBeanStyle {
	public MyBeanStyleB(){
		System.out.println("MyBeanStyleB의 기본생성자 - 생성완료");
	}
	@Override
	public void testHello(String name) {
		System.out.println("hello....."+name);
	}
}
