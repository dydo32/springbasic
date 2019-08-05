package basic.factorypattern;

public class MongoDBConnection extends Connection{
	public MongoDBConnection(String url) {
		super(url);
	}

	@Override
	public void connect() {
		System.out.println(url + "��ġ�� Mongodb ������ ������ �õ��մϴ�.");
	}

}
