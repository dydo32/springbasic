package jdbc.etc.simple;

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import jdbc.employee.EmpDTO;
import jdbc.employee.MyEmpDAO;
/*
 * sql�� �ڵ忡�� �и��ϱ� ���� mybatis�� ibatis�� ���
 * ==> 	spring������ sql���� ���ڿ��� ǥ���ߴ� �κп� ���ؼ� �������� ó���ϱ� ���ؼ� insert
 * 	   	insert���� Ư�� ?�� �ش��ϴ� �ܺ� �Էµ����Ͱ� ���� ������ ��Ÿ�� ���� �߻��Ѵ�.
 * 		�̸� �ذ��ϱ� ���� ����
 */
public class EmpDAOETCImpl implements MyEmpDAO{
	private SimpleJdbcInsert template;
	
	public EmpDAOETCImpl() {}

	public EmpDAOETCImpl(SimpleJdbcInsert template) {
		super();
		this.template = template;
		//SimpleJdbcInsert�� injection�޴� ������ ���̺���� ����
		this.template.withTableName("kitriemp");
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(EmpDTO user) {
		return template.execute(new BeanPropertySqlParameterSource(user));
	}
	
	@Override
	public int update(EmpDTO userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpDTO> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return null;
	}

}
