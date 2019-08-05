package di.setter01;

public class MyServiceImpl implements MyService {
	// spring프레임워크의 외부조립기(컨테이너)로부터 injection받아서 사용할 수 있도록 코드를 완성
	// 생성자 방식으로 전달, 기본생성자도 추가
	// Test클래스에서는 GenericXmlApplicationContext를 이용해서 처리할 수 있도록 작업하기
	// Test클래스에서는 MyService의 test로직을 호출해서 결과 확인하기
	String name;
	String msg;
	Logic logic;
	public MyServiceImpl(){
		System.out.println("MyServiceImpl의 기본생성자");
	}
	
	public MyServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
		System.out.println("MyServiceImpl매개변수 세 개 생성자");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("MyserviceImpl의 setter메소드 name:"+name);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("MyserviceImpl의 setter메소드 msg:"+msg);
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
		System.out.println("MyserviceImpl의 setter메소드 logic ");
	}

	@Override
	public void testLogic() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}
}
