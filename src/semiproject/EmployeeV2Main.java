package semiproject;

//https://github.com/siestageek/datasets/blob/master/csv/EMPLOYEES.csv

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        EmployeeV2Service eplV2 = new EmployeeV2Service();

        int menu = 0;
        while (true) { //메뉴 띄우고 작업번호 입력을 반복
            eplV2.displayMenu();
            Scanner sc = new Scanner(System.in);
            try {
                menu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못입력하셨습니다 0~5까지 숫자중 입력해주세요");
                continue;
            }
            switch (menu) {
                case 1: eplV2.newEmployee(); break;
                case 2: eplV2.readEmployee(); break;
                case 3: eplV2.readOneEmployee(); break;
                case 4: break;
                case 5: break;
                case 0: System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
