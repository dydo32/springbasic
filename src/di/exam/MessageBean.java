package di.exam;

public class MessageBean implements InterMessage {
	private String name;
	private String greeting;
	Outputter Outputter;

	public MessageBean() {}
	
	public MessageBean(String name) {
		super();
		this.name = name;
		System.out.println("MessageBean �� �� ������");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("MessageBean�� setter, greeting");
	}

	public void setOutputter(Outputter outputter) {
		Outputter = outputter;
		System.out.println("MessageBean�� setter, outputter");
	}

	@Override
	public void sayHello() {
		String msg = name+", "+greeting;
		Outputter.output(msg);
	}
	

}
