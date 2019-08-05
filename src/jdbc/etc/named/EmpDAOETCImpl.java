package jdbc.etc.named;

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import jdbc.employee.EmpDTO;
import jdbc.employee.MyEmpDAO;

public class EmpDAOETCImpl implements MyEmpDAO {
	private NamedParameterJdbcTemplate template;
	
	public EmpDAOETCImpl() {}

	public EmpDAOETCImpl(NamedParameterJdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int count() {
		return 0;
	}
	
	/*
	 * 1�� �۾�
	 * ����ڷκ��� ���޹��� �Է°��� �̸����� �����ؼ� ó��
	 * �Ķ���͸� Map���� ����
	 * �Ķ������ name�� value�� map�� ����ϰ� ��� => index��ݺ��� ����
	 * 
	 * index��� 
	 * insert into kitriemp values(?,?,..);
	 * 
	 * �Ķ���ͱ��
	 * �Ķ���� �̸� �տ� :�� ���δ�
	 * map�� Ű�� �Ķ���� �̸��� �����ؾ� �ν�, map�� Ű�� �̸��� ����
	 */
	/*@Override
	public int insert(EmpDTO user) {
		String sql = "insert into kitriemp values(:id, :pass, :name, :addr, sysdate, :grade, 1000, :deptno)";
		Map<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("id", user.getId());	//Ű�� sql�� ���ǵ� �Ķ���͸�� ��ġ�ؾ��Ѵ�.
		paramMap.put("pass", user.getPass());
		paramMap.put("name", user.getName());
		paramMap.put("addr", user.getAddr());
		paramMap.put("grade", user.getGrade());
		paramMap.put("deptno", user.getDeptNo());
		int result = template.update(sql, paramMap);
		return result;
	}
	 */
	/*
	 * 2���۾�
	 * BeanPropertySqlParameterSource�� ������� �۾�
	 * �Ű������� ���޵� dto�� ������Ƽ��(���������)�ϰ� sql�Ķ���͸��ϰ� ��ġ�ϴ� ���� ����
	 */
	@Override
	public int insert(EmpDTO user) {
		String sql = "insert into kitriemp values(:id, :pass, :name, :addr, sysdate, :grade, 1000, :deptNo)";
		int result = template.update(sql, new BeanPropertySqlParameterSource(user));
		return result;
	}

	@Override
	public int update(EmpDTO userInfo) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public EmpDTO login(String id, String pass) {
		return null;
	}

	@Override
	public List<EmpDTO> getMemberList() {
		return null;
	}

	@Override
	public List<EmpDTO> findByAddr(String addr) {
		return null;
	}

}
