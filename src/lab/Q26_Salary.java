package lab;

import java.util.Scanner;

public class Q26_Salary {
    public static void main(String[] args) {
        //변수선언
        Scanner sc = new Scanner(System.in);
        String Marriage;
        int yearpay;
        int tax=0;

        //처리
        System.out.println("결혼을 하셨습니까? 예 or 아니오");
        Marriage=sc.nextLine();
        System.out.println("연봉을 입력해주십시오.");
        yearpay = sc.nextInt();
        switch(Marriage){
            case "예" :
                if(yearpay>5999){
                    tax = yearpay * 35 / 100;
                }else{
                    tax = yearpay * 15 / 100;
                    break;
                }
            case "아니오":
                if(yearpay>2999){
                    tax = yearpay * 25 / 100;
                }else{
                    tax = yearpay * 10 / 100;
                }
        }
        /*if(Marriage="아니오" && yearpay>2999){
            tax = yearpay * 25 / 100;
        }else if(Marriage="아니오" && yearpay<3000) {
            tax = yearpay * 10 / 100;
        }else if(Marriage="예" && yearpay > 5999 ){

        }else if(Marriage="예" && yearpay<6000) {
            tax = yearpay * 15 / 100;
        }else{
            System.out.println("오류입니다.");
        }*/

        //출력
        System.out.printf("납부하셔야할 세금은 %d",tax);
    }

}
