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
	//시작을 알리는 메소드
	public void show(){
		System.out.println("**********부서관리 시스템************");
		System.out.println("1. 부서등록");
		System.out.println("2. 부서상세보기");
		System.out.println("3. 부서정보수정");
		System.out.println("4. 부서삭제");
		System.out.println("5. 전체 부서 목록보기");
		System.out.println("6. 부서검색(부서명)");
		System.out.println("7. 부서갯수조회");
		System.out.println("8. 각 부서별 근무직원 조회하기");
		System.out.println("9. 종료");
		System.out.print("원하는 작업을 선택하세요:");
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
		System.out.println("전체 부서수:"+dao.count());
	}
	@Override
	public void insertMenu() {
		System.out.println("********부서등록********");
		System.out.print("부서번호:");
		String deptNo = key.next();
		System.out.print("부서이름:");
		String deptName = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("전화번호:");
		String tel = key.next();
		System.out.print("매니저:");
		String mgr = key.next();
		DeptDTO dept
			= new DeptDTO(deptNo, deptName, loc, tel, mgr);
		int result = dao.insert(dept);
		if(result>0){
			System.out.println("삽입성공");
		}else{
			System.out.println("삽입실패");
		}
	}
	@Override
	public void updateMenu() {
		System.out.println("********부서정보수정********");
		System.out.print("부서번호:");
		String deptNo = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("전화번호:");
		String tel = key.next();
		System.out.print("매니저:");
		String mgr = key.next();
		DeptDTO updatedept = new DeptDTO(deptNo, null, loc, tel, mgr);
		int result = dao.update(updatedept);
		if(result>0){
			System.out.println("수정성공");
		}else{
			System.out.println("수정실패");
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******삭제*******");
		System.out.println("삭제할 부서번호를 입력하세요:");
		String deptno = key.next();
		int result = dao.delete(deptno);
		if(result>0){
			System.out.println("삭제성공");
		}else{
			System.out.println("삭제실패");
		}
	}
	@Override
	public void showAllMenu() {
		List<DeptDTO> deptlist = dao.getDeptList();
		System.out.println("dao의 메소드 호출 후");
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
		System.out.println("********검색********");
		System.out.print("검색할 부서(부서번호)를 입력하세요:");
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
		System.out.println("********검색********");
		System.out.print("검색할 부서(부서이름)를 입력하세요:");
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
		System.out.println("********검색********");
		System.out.print("검색할 부서(부서번호)를 입력하세요:");
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








