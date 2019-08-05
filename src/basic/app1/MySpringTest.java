package basic.app1;
/*
 * 결합도가 극도로 높은 프로그램
 * ==> 클래스의 결합도가 강하고 의존성이 높다. 
 * 		사용되는 클래스가 변경되면 이클래스를 사용하는 곳에서 수정해야 하는 범위가 넓어진다.
 * 		즉, 이 클래스를 사용하는 모든 것을 다 수정해야 한다.
 * 		oop특성이 적용되어 있지 않다.
 */
public class MySpringTest {
	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleB obj){
		System.out.println("*******************************");
		obj.testHello2("장동건");
		obj.testHello2("장동건");
		System.out.println("*******************************");
	}
	public static void show(MyBeanStyleB obj){
		obj.testHello2("장동건");
		obj.testHello2("장동건");
		obj.testHello2("장동건");
		obj.testHello2("장동건");
		obj.testHello2("장동건");
		obj.testHello2("장동건");
	}
}



