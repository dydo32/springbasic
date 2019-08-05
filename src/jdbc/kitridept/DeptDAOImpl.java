package jdbc.kitridept;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.employee.EmpDTO;
import jdbc.employee.MyEmpRowMapper;

public class DeptDAOImpl implements DeptDAO {
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	@Override
	public int count() {
		return template.queryForObject("select count(deptno) from kitridept", Integer.class);
	}

	@Override
	public int insert(DeptDTO dept) {
		String sql = "insert into kitridept values(?,?,?,?,?)";
		int result = template.update(sql,dept.getDeptNo(),dept.getDeptName(),dept.getLoc(),dept.getTel(),dept.getMgr());
		return result;
	}

	@Override
	public int update(DeptDTO deptInfo) {
		String sql = "update kitridept set loc=?,tel=?,mgr=? where deptno=?";
		int result = template.update(sql,deptInfo.getLoc(), deptInfo.getTel(),deptInfo.getMgr(), deptInfo.getDeptNo());
		return result;
	}

	@Override
	public int delete(String deptno) {
		String sql = "delete from kitridept where deptno=?";
		int result = template.update(sql,deptno);
		return result;
	}

	@Override
	public DeptDTO showDeptInfo(String deptno) {
		try{
			return template.queryForObject("select * from kitridept where deptno=?", new Object[]{deptno}, new KitriDeptRowMapper());
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}
	@Override
	public List<DeptDTO> getDeptList() {
		return template.query("select * from kitridept", new KitriDeptRowMapper());
	}

	@Override
	public List<DeptDTO> findByDept(String deptname) {
		return template.query("select * from kitridept where deptname like ?",new Object[]{"%"+deptname+"%"}, new KitriDeptRowMapper());
	}

	@Override
	public List<EmpDTO> getMemberList(String deptno) {
		return template.query("select * from kitriemp where deptno = ?",new Object[]{deptno}, new MyEmpRowMapper());
	}

}
