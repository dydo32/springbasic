package basic.app1;
/*
 * ���յ��� �ص��� ���� ���α׷�
 * ==> Ŭ������ ���յ��� ���ϰ� �������� ����. 
 * 		���Ǵ� Ŭ������ ����Ǹ� ��Ŭ������ ����ϴ� ������ �����ؾ� �ϴ� ������ �о�����.
 * 		��, �� Ŭ������ ����ϴ� ��� ���� �� �����ؾ� �Ѵ�.
 * 		oopƯ���� ����Ǿ� ���� �ʴ�.
 */
public class MySpringTest {
	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleB obj){
		System.out.println("*******************************");
		obj.testHello2("�嵿��");
		obj.testHello2("�嵿��");
		System.out.println("*******************************");
	}
	public static void show(MyBeanStyleB obj){
		obj.testHello2("�嵿��");
		obj.testHello2("�嵿��");
		obj.testHello2("�嵿��");
		obj.testHello2("�嵿��");
		obj.testHello2("�嵿��");
		obj.testHello2("�嵿��");
	}
}



