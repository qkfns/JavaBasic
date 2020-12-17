package semiproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeV3Service {

    public EmployeeV3Service() {
    }

    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("  사원정보 처리프로그램 v1   \n")
                .append("-------------------\n")
                .append(" 1. 사원 데이터 입력       \n")
                .append(" 2. 사원 데이터 조회       \n")
                .append(" 3. 사원 데이터 상세조회       \n")
                .append(" 4. 사원 데이터 수정       \n" )
                .append(" 5. 사원 데이터 삭제       \n")
                .append(" 0. 프로그램 종료         \n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? ");

        System.out.print(sb);
    }

    public void newEmployees(){
        int employee_id;
        String first_name;
        String last_name;
        String email;
        String phone_number;
        String hire_date;
        String job_id;
        int salary;
        double comminssion_pct;
        int mangaer_id;
        int department_id;
        Scanner sc = new Scanner(System.in);

        System.out.print("사원번호를 입력하세요");
        employee_id = Integer.parseInt(sc.nextLine());
        System.out.print("사원의 성을 입력하세요");
        first_name = sc.nextLine();
        System.out.print("사원의 이름을 입력하세요");
        last_name = sc.nextLine();
        System.out.print("email을 입력하세요");
        email = sc.nextLine();
        System.out.print("전화번호를 입력하세요");
        phone_number = sc.nextLine();
        System.out.print("입사일을 입력하세요");
        hire_date = sc.nextLine();
        System.out.print("직책명을 입력하세요");
        job_id = sc.nextLine();
        System.out.print("연봉을 입력하세요");
        salary = sc.nextInt();
        System.out.print("보너스를 입력하세요");
        comminssion_pct = sc.nextDouble();
        System.out.print("상사번호를 입력하세요");
        mangaer_id = sc.nextInt();
        System.out.print("부서번호를 입력하세요");
        department_id = sc.nextInt();

        EmployeeVO emp = new EmployeeVO(employee_id,first_name,last_name,email,phone_number,
                hire_date,job_id,salary,comminssion_pct,mangaer_id,department_id);

        String result = EmployeeV3DAO.insertEmp(emp);
        System.out.println(result);
    }

    public void readEmployee() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s\n";

        String result = String.format(fmt,"empno","fname","email","jobid","mgrId","deptId");
        sb.append(result);

        ArrayList<EmployeeVO> emps = EmployeeV3DAO.selectEmp();

        for (EmployeeVO emp : emps){
            result = String.format(fmt,
                    emp.getEmpno(),emp.getFname(),emp.getEmail(),
                    emp.getJobId(),emp.getMgrId(),emp.getDeptId());
            sb.append(result);
        }
        System.out.println(sb.toString());

    }

    public void readOneEmployee() {

        String fmt = "%10s %10s %10s %10s %10s " +
                "%10s %10s %10s %10s %10s %10s \n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원 번호를 입력해주세요 : ");
        String empid = sc.nextLine();

        EmployeeVO emp = EmployeeV3DAO.selectOneEmp(empid);

        String result = String.format(fmt, emp.getEmpno(),
                emp.getFname(),emp.getLname(),emp.getEmail(),
                emp.getPhone(),emp.getHdate(),emp.getJobId(),
                emp.getSal(),emp.getComm(),emp.getMgrId(),
                emp.getDeptId());

        System.out.println(result);
    }

    public void removeEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 사원번호는?");
        int empid = sc.nextInt();

        String result = EmployeeV3DAO.deleteEmp(empid);
        System.out.println(result);
    }
}
