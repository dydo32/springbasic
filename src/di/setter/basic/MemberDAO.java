package di.setter.basic;
public class MemberDAO {
	public MemberDAO() {
		System.out.println("MemberDAO�� �⺻������");
	}
	public void add(MemberDTO user){
		System.out.println("ȸ������");
	}
	public MemberDTO getUser(String id){
		System.out.println("���̵�� ȸ�� ��ȸ�ϱ�");
		return null;
	}
}