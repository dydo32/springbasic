package di.setter01;

public class MyServiceImpl implements MyService {
	// spring�����ӿ�ũ�� �ܺ�������(�����̳�)�κ��� injection�޾Ƽ� ����� �� �ֵ��� �ڵ带 �ϼ�
	// ������ ������� ����, �⺻�����ڵ� �߰�
	// TestŬ���������� GenericXmlApplicationContext�� �̿��ؼ� ó���� �� �ֵ��� �۾��ϱ�
	// TestŬ���������� MyService�� test������ ȣ���ؼ� ��� Ȯ���ϱ�
	String name;
	String msg;
	Logic logic;
	public MyServiceImpl(){
		System.out.println("MyServiceImpl�� �⺻������");
	}
	
	public MyServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
		System.out.println("MyServiceImpl�Ű����� �� �� ������");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("MyserviceImpl�� setter�޼ҵ� name:"+name);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("MyserviceImpl�� setter�޼ҵ� msg:"+msg);
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
		System.out.println("MyserviceImpl�� setter�޼ҵ� logic ");
	}

	@Override
	public void testLogic() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}
}
