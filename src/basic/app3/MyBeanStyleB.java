package basic.app3;

public class MyBeanStyleB implements MyBeanStyle {
	public MyBeanStyleB(){
		System.out.println("MyBeanStyleB�� �⺻������ - �����Ϸ�");
	}
	@Override
	public void testHello(String name) {
		System.out.println("hello....."+name);
	}
}
