package basic.basic;
public class TestMain {
	public static void main(String[] args) {
		//2. InsaImpl을 생성할때 InsaImpl이 갖고 있는 멤버변수를 전달하며 생성한다.
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);*/
		
		//3. InsaImpl을 생성하고 InsaImpl의 setter메소드를 호출해서 dao를 전달하는 방법
		MemberDAO dao = new MemberDAO();
		InsaImpl insa = new InsaImpl();
		insa.setDao(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);
	}
}