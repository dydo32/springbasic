package jdbc.kitridept;
import java.util.List;
import java.util.Scanner;

import jdbc.employee.EmpDTO;

public class MenuUI implements AbstractUI {
	Scanner key = new Scanner(System.in);
	DeptDAO dao;
	public MenuUI() {}
	public MenuUI(DeptDAO dao) {
		super();
		this.dao = dao;
	}
	//������ �˸��� �޼ҵ�
	public void show(){
		System.out.println("**********�μ����� �ý���************");
		System.out.println("1. �μ����");
		System.out.println("2. �μ��󼼺���");
		System.out.println("3. �μ���������");
		System.out.println("4. �μ�����");
		System.out.println("5. ��ü �μ� ��Ϻ���");
		System.out.println("6. �μ��˻�(�μ���)");
		System.out.println("7. �μ�������ȸ");
		System.out.println("8. �� �μ��� �ٹ����� ��ȸ�ϱ�");
		System.out.println("9. ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	private void menuSelect(int menu) {
		switch (menu) {
		case 1:
			insertMenu();
			break;
		case 2:
			showDeptInfo();
			break;
		case 3:
			updateMenu();
			break;
		case 4:
			deleteMenu();
			break;
		case 5:
			showAllMenu();
			break;
		case 6:
			findByDept();
			break;
		case 7:
			countMenu();
			break;
		case 8:
			getMemberList();
			break;
		case 9:
			System.exit(0);
		}
	}
	
	@Override
	public void countMenu() {
		System.out.println("��ü �μ���:"+dao.count());
	}
	@Override
	public void insertMenu() {
		System.out.println("********�μ����********");
		System.out.print("�μ���ȣ:");
		String deptNo = key.next();
		System.out.print("�μ��̸�:");
		String deptName = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String tel = key.next();
		System.out.print("�Ŵ���:");
		String mgr = key.next();
		DeptDTO dept
			= new DeptDTO(deptNo, deptName, loc, tel, mgr);
		int result = dao.insert(dept);
		if(result>0){
			System.out.println("���Լ���");
		}else{
			System.out.println("���Խ���");
		}
	}
	@Override
	public void updateMenu() {
		System.out.println("********�μ���������********");
		System.out.print("�μ���ȣ:");
		String deptNo = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String tel = key.next();
		System.out.print("�Ŵ���:");
		String mgr = key.next();
		DeptDTO updatedept = new DeptDTO(deptNo, null, loc, tel, mgr);
		int result = dao.update(updatedept);
		if(result>0){
			System.out.println("��������");
		}else{
			System.out.println("��������");
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******����*******");
		System.out.println("������ �μ���ȣ�� �Է��ϼ���:");
		String deptno = key.next();
		int result = dao.delete(deptno);
		if(result>0){
			System.out.println("��������");
		}else{
			System.out.println("��������");
		}
	}
	@Override
	public void showAllMenu() {
		List<DeptDTO> deptlist = dao.getDeptList();
		System.out.println("dao�� �޼ҵ� ȣ�� ��");
		for (int i = 0; i < deptlist.size(); i++) {
			DeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptNo()+"\t");
			System.out.print(dept.getDeptName()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.print(dept.getTel()+"\t");
			System.out.print(dept.getMgr()+"\t");
			System.out.println();
		}
	}
	@Override
	public void showDeptInfo() {
		System.out.println("********�˻�********");
		System.out.print("�˻��� �μ�(�μ���ȣ)�� �Է��ϼ���:");
		String deptNo = key.next();
		DeptDTO dept = dao.showDeptInfo(deptNo);
		System.out.print(dept.getDeptNo()+"\t");
		System.out.print(dept.getDeptName()+"\t");
		System.out.print(dept.getLoc()+"\t");
		System.out.print(dept.getTel()+"\t");
		System.out.print(dept.getMgr()+"\t");
	}
	@Override
	public void findByDept() {
		System.out.println("********�˻�********");
		System.out.print("�˻��� �μ�(�μ��̸�)�� �Է��ϼ���:");
		String deptName = key.next();
		List<DeptDTO> deptlist = dao.findByDept(deptName);
		for (int i = 0; i < deptlist.size(); i++) {
			DeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptNo()+"\t");
			System.out.print(dept.getDeptName()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.print(dept.getTel()+"\t");
			System.out.print(dept.getMgr()+"\t");
			System.out.println();
		}
		
	}
	@Override
	public void getMemberList() {
		System.out.println("********�˻�********");
		System.out.print("�˻��� �μ�(�μ���ȣ)�� �Է��ϼ���:");
		String deptNo = key.next();
		List<EmpDTO> emplist = dao.getMemberList(deptNo);
		for (int i = 0; i < emplist.size(); i++) {
			EmpDTO emp = emplist.get(i);
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getAddr()+"\t");
			System.out.print(emp.getDeptNo()+"\t");
			System.out.println();
		}
	}
}








