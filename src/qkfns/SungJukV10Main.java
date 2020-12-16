package qkfns;

import java.util.Scanner;

/**
 *
 *  파일명 : SungJukV9Main
 *  작성일 : 2020.11.27
 *  <p>
 *  프로그램 설명 : 성적처리프로그램v10
 *  성적처리 프로그램에 저장기능을 추가함
 *  즉, sungjuk.dat라는 파일을 생성해서
 *  입력한 성적데이터를 여기에 저장해 둠
 */
public class SungJukV10Main {
    public static void main(String[] args) {
        SungJukV10Service sj9s = new SungJukV10Service();

        int menu = 0;
        while(true) { //메뉴 띄우고 작업번호 입력을 반복
            sj9s.displayMenu();
            Scanner sc = new Scanner(System.in);
            try{
            menu = sc.nextInt();}
            catch (Exception e){
                System.out.println("잘못입력하셨습니다 0~5까지 숫자중 입력해주세요");
                continue;
            }
            switch (menu){
                case 1 : sj9s.newSungJuk(); break;
                case 2 : sj9s.readSungJuk();break;
                case 3 : sj9s.readOneSungJuk();break;
                case 4 : break;
                case 5 : break;
                case 0 : System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
    }



}
