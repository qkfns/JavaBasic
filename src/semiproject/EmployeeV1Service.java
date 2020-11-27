package semiproject;

//https://github.com/siestageek/datasets/blob/master/csv/EMPLOYEES.csv

import qkfns.sungJukV6.SungJukVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1GenericService {
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO empl = null;

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
        // 모든 인사정보는 일단 문자형으로 받되
        // 필요에 따라 적절한 형변환을 해서 변수에 저장
        System.out.print("사번을 입력하세요: ");
        empno = Integer.parseInt(sc.nextLine());

        System.out.print("성을 입력하세요: ");
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
        sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당을 입력하세요(소수): ");
        comm = Double.parseDouble(sc.nextLine());
        System.out.print("상사번호를 입력하세요: ");
        mgrId = Integer.parseInt(sc.nextLine());
        System.out.print("부서번호를 입력하세요: ");
        deptId = Integer.parseInt(sc.nextLine());



        empl = new EmployeeVO(empno,fname,lname,email,phone,hdate,jobId,sal,comm,mgrId,deptId);

        empdata.add(empl);
    }

    @Override
    public void readEmployee() {
        //String fmt = "사번: %s, 성: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n";
        String fmt = "%8s %8s %8s %8s %8s %8s\n";
        // 동적 배열에 저장된 데이터들을 출력하기 위해
        // 각 요소를 순회할 수 있도록 Iterator 객체 선언
        System.out.printf(fmt,"empno","fname","email","jobID","mgrID","deptID\n");
        Iterator<EmployeeVO> iter = empdata.iterator();
        while(iter.hasNext()){
            EmployeeVO empl = iter.next();
            System.out.printf(fmt,empl.getEmpno(),empl.getFname(),empl.getEmail(),empl.getJobId(),empl.getMgrId(),empl.getDeptId());
            }
        System.out.println("");

    }

    @Override
    public void readOneEmployee() {
        EmployeeVO emp = new EmployeeVO();
        String fmt = "사원번호: %d, 성: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n";
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원 번호를 입력해주세요 : ");
        int empno = sc.nextInt();

        /*for(EmployeeVO empl : empdata){
            if(empl.getEmpno() == empno){
                System.out.printf(fmt,empl.getEmpno(),empl.getFname(), empl.getEmail(), empl.getJobId(),empl.getMgrId(),empl.getDeptId());
            }
        }*/
        for(EmployeeVO e : empdata){
            // 입력한 사원번호와 순회해서 읽어온 사원정보의 사원번호와 비교
            // 일치하면 다른 변수 안에 저장함.
            if(e.getEmpno() == empno){
                emp = e;
            }
        }
        System.out.printf(fmt,emp.getEmpno(),emp.getFname(), emp.getEmail(), emp.getJobId(),emp.getMgrId(),emp.getDeptId());
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
