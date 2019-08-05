package di.exam;

public class FileOutputter implements Outputter {
	private  String filePath;

	public void setFilePath(String filePath){
		
	}
	
	@Override
	public void output(String message) {
		System.out.println("파일로 출력하기: " + message);
	}
}
