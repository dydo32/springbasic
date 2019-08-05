package jdbc.etc.simple;

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import jdbc.employee.EmpDTO;
import jdbc.employee.MyEmpDAO;
/*
 * sql을 코드에서 분리하기 위해 mybatis나 ibatis를 사용
 * ==> 	spring에서도 sql문을 문자열로 표현했던 부분에 대해서 불편함을 처리하기 위해서 insert
 * 	   	insert용은 특히 ?에 해당하는 외부 입력데이터가 많기 때문에 오타가 많이 발생한다.
 * 		이를 해결하기 위해 제공
 */
public class EmpDAOETCImpl implements MyEmpDAO{
	private SimpleJdbcInsert template;
	
	public EmpDAOETCImpl() {}

	public EmpDAOETCImpl(SimpleJdbcInsert template) {
		super();
		this.template = template;
		//SimpleJdbcInsert를 injection받는 곳에서 테이블명을 셋팅
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
