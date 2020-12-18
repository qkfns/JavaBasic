package SamKwangFinal;

import semiproject.EmployeeV3DAO;
import semiproject.EmployeeVO;

import java.util.ArrayList;
import java.util.Scanner;

public class SamKwangService {

    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("  비지니스 관리 프로그램 v1   \n")
                .append("-------------------       \n")
                .append(" 1. 비지니스 정보 입력       \n")
                .append(" 2. CODP 조회              \n")
                .append(" 3. CODP 상세조회           \n")
                .append(" 4. SOE 조회               \n")
                .append(" 5. SOE 상세조회            \n")
                .append(" 0. 프로그램 종료            \n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? ");

        System.out.print(sb);
    }

    public void readCODP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s\n " +
                "%10s %10s %10s %10s\n";

        String result = String.format(fmt,"고객번호","고객이름","주문번호","주문일","제품번호",
                "수량","제품이름","단가");

        sb.append(result);

        ArrayList<SamKwangVO> codps = SamKwangDAO.selectCODP();

        for (SamKwangVO codp: codps){
            result = String.format(fmt,codp.get고객번호(),
                    codp.get고객이름(), codp.get주문번호(),
                    codp.get주문일().substring(0,10),
                    codp.get제품번호(),codp.get수량(),
                    codp.get제품이름(),codp.get단가());
            sb.append(result);
        }
        System.out.println(sb.toString());

    }


    public void readOneCODP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s %10s %10s \n" +
                "%10s %10s %10s %10s %10s %10s %10s %10s \n" +
                "--------------------------------------\n";
        String result = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 주문번호는? ");
        int 주문번호 = sc.nextInt();

        ArrayList<SamKwangVO> codps = SamKwangDAO.selectOneCODP(주문번호);

        for (SamKwangVO codp : codps){
            result = String.format(fmt, codp.get제품번호(),
                    codp.get주문번호(),codp.get고객번호(),
                    codp.get고객이름(),codp.get주소(),
                    codp.get시도(),codp.get우편번호(),
                    codp.get전화번호(),codp.get주문일(),
                    codp.get납기일(),codp.get인사번호(),
                    codp.get수량(),codp.get제품이름(),
                    codp.get제품분류(),codp.get단가(),
                    codp.get재고량());
            sb.append(result);
        }

        System.out.println(sb.toString());
    }

    public void readSOE() {
    }

    public void readOneSOE() {
    }
}


