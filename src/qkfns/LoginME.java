package qkfns;

import java.util.Scanner;

/**
 *  로그인 확인 프로그램
 *  0. 인증용 아이디와 비밀번호를 하나 생성해 둠
 *      => abc123, 987xyz
 *  1. 아이디, 비밀번호 입력받음
 *  2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
 *  2b. 아이디만 맞으면 "비밀번호가 틀렸습니다"
 *  2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"
 *
 */
public class LoginME {
    public static void main(String[] args) {
        String a1 = "abc123";
        String b1 = "987xyz";
        String a2 ;
        String b2 ;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("아이디를 입력하세요: ");
            a2 = sc.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            b2 = sc.nextLine();
            if (a1.equals(a2) && b1.equals(b2)){
                System.out.println("로그인 성공!"); break;
            }else if (a1.equals(a2)){
                System.out.println("비밀번호가 틀렸습니다.");continue;
            }else {
                System.out.println("가입되지 않은 아이디!");continue;
            }
        }
    }
}
