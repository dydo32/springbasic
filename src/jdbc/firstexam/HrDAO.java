package jdbc.firstexam;

import org.springframework.jdbc.core.JdbcTemplate;

//JDBCTemplate을 연습하는 클래스
//spring이 제공하는 템플릿 클래스를 이용해서 db연동
public class HrDAO {
	private JdbcTemplate mytemplate;
	public HrDAO(){}
	public HrDAO(JdbcTemplate mytemplate) {
		super();
		this.mytemplate = mytemplate;
	}
	
	//hr계정의 jobs테이블의 레코드수를 리턴하는 메소드를 정의
	public int count(){
		return mytemplate.queryForObject("select count(*) from jobs", Integer.class);
	}
	
	
}
