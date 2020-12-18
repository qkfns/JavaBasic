package SamKwangFinal;

import semiproject.EmployeeV1Service;
import semiproject.EmployeeV3Service;

import java.util.Scanner;

public class SamKwangMain {
    public static void main(String[] args) {
        SamKwangService sk = new SamKwangService();

        int menu = 0;
        while (true) { //메뉴 띄우고 작업번호 입력을 반복
            sk.displayMenu();
            Scanner sc = new Scanner(System.in);
            try {
                menu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못입력하셨습니다 0~5까지 숫자중 입력해주세요");
                continue;
            }
            switch (menu) {
                case 1: break;
                case 2: sk.readCODP();break;
                case 3: sk.readOneCODP();break;
                case 4: sk.readSOE(); break;
                case 5: sk.readOneSOE();break;
                case 0: System.exit(0); break;
                default: System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
