package jdbc.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class EmpDAO {
	public EmpDTO login(String id,String pass){
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from kitriemp where id =? and pass=?";
		EmpDTO user = null;
		try{
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			rs = ptmt.executeQuery();
			if(rs.next()){
				user = new EmpDTO(rs.getString(1), 
						rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getInt(7), rs.getString(8));
			}
		}catch(SQLException e){
			e.printStackTrace();
		} finally{
			DBUtil.close(rs, ptmt, con);
		}
		return user;
	}
	 public ArrayList<EmpDTO> select(){
		System.out.println("select call");
		String sql = "select * from kitriemp";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		EmpDTO user=null;
		ArrayList<EmpDTO> userlist 
				= new ArrayList<EmpDTO>();
		try{
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				//select된 테이블에서 레코드 하나를 MemberDTO로 변환
				user = new EmpDTO(rs.getString(1), 
						rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getInt(7), rs.getString(8));
				userlist.add(user);
			}
			/*System.out.println("ArrayList에 저장된 레코드수=>"
					+userlist.size());*/
		}catch(SQLException e){
			e.printStackTrace();
		} finally{
			DBUtil.close(rs, ptmt, con);
		}

		return userlist;
	 }
	public int insert(EmpDTO user){
		System.out.println("dao..."+user);
		int result =0;
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into kitriemp values(?,?,?,?,sysdate,?,10000,'001')";
		try{
			con =DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, user.getId());
			ptmt.setString(2, user.getPass());
			ptmt.setString(3, user.getName());
			ptmt.setString(4, user.getAddr());
			ptmt.setString(5, user.getGrade());
			
			result = ptmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

}
