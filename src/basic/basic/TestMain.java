package basic.basic;
public class TestMain {
	public static void main(String[] args) {
		//2. InsaImpl�� �����Ҷ� InsaImpl�� ���� �ִ� ��������� �����ϸ� �����Ѵ�.
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);*/
		
		//3. InsaImpl�� �����ϰ� InsaImpl�� setter�޼ҵ带 ȣ���ؼ� dao�� �����ϴ� ���
		MemberDAO dao = new MemberDAO();
		InsaImpl insa = new InsaImpl();
		insa.setDao(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		insa.addUser(user);
	}
}