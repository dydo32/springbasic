package di.exam;

public class ConsoleOutputter implements Outputter {
	private  String filePath;

	public void setFilePath(String filePath){
		
	}
	
	@Override
	public void output(String message) {
		System.out.println("�ַܼ� ����ϱ�: " + message);
	}
}
