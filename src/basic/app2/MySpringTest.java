package basic.app2;
/*
 *	- app1�� ��� ������ copy paste�ϰ� oop�� Ư���� �����ؼ� ����
 *	oopƯ���� �����ؼ� �ҽ��� ����
 *	oopƯ���� �����ϱ� ���ؼ� ����Ŭ������ �����ϰ� MyBeanXXXŬ������ ����ϴ� Ŭ������ �Ű�����Ÿ����
 *	����Ÿ������ ���������Ƿ� ���εǴ� ��ü�� ����Ǵ��� �ҽ��� ������ �ʿ䰡 ����.
 *	�׷��� ���� ��ü�� �����ؼ� �����ϴ� �κ��� ���� ���̶� �ϴ��� ��ü�� �ٲ𶧸��� �����ؾ� �Ѵ�.
 *	�츮�� ���� Ŭ������ ���α׷��ȿ��� ���� new�ؼ� �����ϴ� �ڵ�� �������� �ϴ� �ڵ��̴�.
 */
public class MySpringTest {
	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
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
