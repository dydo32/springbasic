package di.constructor.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl(){
		System.out.println("InsaImpl�� �⺻������");
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl�Ű����� �� �� ������");
	}
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}
	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}
}