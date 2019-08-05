package jdbc.firstexam;

import org.springframework.jdbc.core.JdbcTemplate;

//JDBCTemplate�� �����ϴ� Ŭ����
//spring�� �����ϴ� ���ø� Ŭ������ �̿��ؼ� db����
public class HrDAO {
	private JdbcTemplate mytemplate;
	public HrDAO(){}
	public HrDAO(JdbcTemplate mytemplate) {
		super();
		this.mytemplate = mytemplate;
	}
	
	//hr������ jobs���̺��� ���ڵ���� �����ϴ� �޼ҵ带 ����
	public int count(){
		return mytemplate.queryForObject("select count(*) from jobs", Integer.class);
	}
	
	
}
