package semiproject;

import java.util.Scanner;

public class EmployeeV3Main {
    public static void main(String[] args) {
        EmployeeV3Service emp = new EmployeeV3Service();

        int menu = 0;
        while (true) { //메뉴 띄우고 작업번호 입력을 반복
            emp.displayMenu();
            Scanner sc = new Scanner(System.in);
            try {
                menu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못입력하셨습니다 0~5까지 숫자중 입력해주세요");
                continue;
            }
            switch (menu) {
                case 1: emp.newEmployees();break;
                case 2: emp.readEmployee();break;
                case 3: emp.readOneEmployee();break;
                case 4: break;
                case 5: emp.removeEmployee();break;
                case 0: System.exit(0); break;
                default: System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}





