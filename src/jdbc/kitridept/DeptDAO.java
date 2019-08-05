package jdbc.kitridept;

import java.util.List;

import jdbc.employee.EmpDTO;
public interface DeptDAO {
	//�μ����� ��ȸ
	int count();
	//�μ����
	int insert(DeptDTO dept);
	//�μ���������
	int update(DeptDTO deptInfo);
	//�μ�����
	int delete(String deptno);
	//�μ��󼼺���
	DeptDTO showDeptInfo(String deptno);
	//��ü�μ���Ϻ���
	List<DeptDTO> getDeptList();
	//�μ������� �μ��˻��ϱ�
	List<DeptDTO> findByDept(String deptname);
	//�� �μ��� �ٹ� ������ �˻��ϴ� �޼ҵ�
	List<EmpDTO> getMemberList(String deptno);
}









