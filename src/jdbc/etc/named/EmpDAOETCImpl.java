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
	 * 1차 작업
	 * 사용자로부터 전달받은 입력값을 이름으로 매핑해서 처리
	 * 파라미터를 Map으로 관리
	 * 파라미터의 name과 value를 map에 등록하고 사용 => index기반보다 불편
	 * 
	 * index기반 
	 * insert into kitriemp values(?,?,..);
	 * 
	 * 파라미터기반
	 * 파라미터 이름 앞에 :을 붙인다
	 * map의 키와 파라미터 이름이 동일해야 인식, map의 키로 이름을 구분
	 */
	/*@Override
	public int insert(EmpDTO user) {
		String sql = "insert into kitriemp values(:id, :pass, :name, :addr, sysdate, :grade, 1000, :deptno)";
		Map<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("id", user.getId());	//키와 sql에 정의된 파라미터명과 일치해야한다.
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
	 * 2차작업
	 * BeanPropertySqlParameterSource를 기반으로 작업
	 * 매개변수로 전달된 dto의 프로퍼티명(멤버변수명)하고 sql파라미터명하고 일치하는 것을 매핑
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
