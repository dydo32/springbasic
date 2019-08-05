package di.setter.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl(){
		System.out.println("InsaImpl의 기본생성자");
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl매개변수 한 개 생성자");
	}
	
	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("InsaImpl의 setter메소드");
		this.dao = dao;
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