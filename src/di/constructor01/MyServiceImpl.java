package di.constructor01;

public class MyServiceImpl implements MyService {
	// spring�����ӿ�ũ�� �ܺ�������(�����̳�)�κ��� injection�޾Ƽ� ����� �� �ֵ��� �ڵ带 �ϼ�
	// ������ ������� ����, �⺻�����ڵ� �߰�
	// TestŬ���������� GenericXmlApplicationContext�� �̿��ؼ� ó���� �� �ֵ��� �۾��ϱ�
	// TestŬ���������� MyService�� test������ ȣ���ؼ� ��� Ȯ���ϱ�
	String name;
	String msg;
	Logic logic;

	public MyServiceImpl() {
		System.out.println("MyServiceImpl�� �⺻������");
	}

	public MyServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
		System.out.println("MyServiceImpl�Ű����� �� �� ������");
	}

	@Override
	public void testLogic() {
		System.out.println(msg + "," + name);
		logic.testLogic();
	}

}
