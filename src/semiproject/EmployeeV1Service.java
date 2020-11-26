package semiproject;

import qkfns.sungJukV6.SungJukVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1GenericService {
    List<EmployeeVO> empdata = new ArrayList<>();
    @Override
    public void newEmployee() {
        int empno;
        String fname;
        String lname;
        String email;
        String phone;
        String hdate;
        String jobId;
        int sal;
        double comm;
        int mgrId;
        int deptId;

        Scanner sc = new Scanner(System.in);
        System.out.print("사번을 입력하세요: ");
        empno = sc.nextInt();
        System.out.print("성을 입력하세요: ");
        fname = sc.nextLine();
        fname = sc.nextLine();
        System.out.print("이름을 입력하세요: ");
        lname = sc.nextLine();
        System.out.print("이메일을 입력하세요: ");
        email = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        phone = sc.nextLine();
        System.out.print("입사일을 입력하세요: ");
        hdate = sc.nextLine();
        System.out.print("직책을 입력하세요: ");
        jobId = sc.nextLine();
        System.out.print("급여를 입력하세요: ");
        sal = sc.nextInt();
        System.out.print("수당을 입력하세요(소수): ");
        comm = sc.nextDouble();
        System.out.print("상사번호를 입력하세요: ");
        mgrId = sc.nextInt();
        System.out.print("부서명을 입력하세요: ");
        deptId = sc.nextInt();

        EmployeeVO empl = new EmployeeVO(empno,fname,lname,email,phone,hdate,jobId,sal,comm,mgrId,deptId);

        empdata.add(empl);
    }

    @Override
    public void readEmployee() {
        String fmt = "사번: %s, 성: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n";
        // 동적 배열에 저장된 데이터들을 출력하기 위해
        // 각 요소를 순회할 수 있도록 Iterator 객체 선언
        Iterator<EmployeeVO> iter = empdata.iterator();
        while(iter.hasNext()){
            EmployeeVO empl = iter.next();
            System.out.printf(fmt,empl.getEmpno(),empl.getFname(),empl.getEmail(),empl.getJobId(),empl.getMgrId(),empl.getDeptId());
            }

    }

    @Override
    public void readOneEmployee() {
        String fmt = "사번: %d, 성: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n";
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사번을 입력해주세요 : ");
        int empno = sc.nextInt();

        for(EmployeeVO empl : empdata){
            if(empl.getEmpno() == empno){
                System.out.printf(fmt,empl.getEmpno(),empl.getFname(), empl.getEmail(), empl.getJobId(),empl.getMgrId(),empl.getDeptId());
            }
        }
    }

    @Override
    public void removeEmployee() {
        super.removeEmployee();
    }

    @Override
    public void modifyEmployee() {
        super.modifyEmployee();
    }

    public void displayMenu() {
        StringBuilder em = new StringBuilder();
        em.append("-------------------\n")
                .append("  인사 관리 프로그램 v1   \n")
                .append("-------------------\n")
                .append(" 1. 인사 정보 입력       \n")
                .append(" 2. 인사 정보 조회       \n")
                .append(" 3. 인사 정보 상세조회       \n")
                .append(" 4. 인사 정보 수정       \n")
                .append(" 5. 인사 정보 삭제       \n")
                .append(" 0. 프로그램 종료         \n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? ");

        System.out.print(em);
    }
}
