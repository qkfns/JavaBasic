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
public class SungJukV11Main {
    public static void main(String[] args) {

        SungJukV11Service sj = new SungJukV11Service();

        Scanner sc = new Scanner(System.in);
        String menu= "";


        while(true) {
            sj.displayMenu();
            menu = sc.nextLine();

            switch(menu) {
                case "1" : sj.newSungJuk();break;
                case "2" : sj.readSungJuk();break;
                case "3" : sj.readOneSungJuk();break;
                case "4" : sj.modifySungJuk();break;
                case "5" : sj.removeSungJuk();break;
                case "0" : System.exit(0);break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }

        }

    }
}
