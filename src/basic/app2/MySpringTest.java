package basic.app2;
/*
 *	- app1의 모든 파일을 copy paste하고 oop의 특성을 적용해서 수정
 *	oop특성을 적용해서 소스를 변경
 *	oop특성을 적용하기 위해서 상위클래스를 선언하고 MyBeanXXX클래스를 사용하는 클래스의 매개변수타입을
 *	상위타입으로 선언했으므로 매핑되는 객체가 변경되더라도 소스를 수정할 필요가 없다.
 *	그러나 실제 객체를 생성해서 전달하는 부분은 여로 곳이라 하더라도 객체가 바뀔때마다 수정해야 한다.
 *	우리가 만든 클래스를 프로그램안에서 직접 new해서 생성하는 코드는 없어져야 하는 코드이다.
 */
public class MySpringTest {
	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
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
