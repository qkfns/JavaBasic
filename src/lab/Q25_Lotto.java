package lab;

import java.util.Scanner;

public class Q25_Lotto {
    public static void main(String[] args) {
        //변수선언
        int i=0;
        Scanner scanner = new Scanner(System.in);
        int yourkey[] = new int[3];
        int lottokey[] = new int[3];


        //처리
        System.out.printf("복권 숫자 3가지를 입력하시오(1~45)");
        for(i = 0 ; i <= 2 ; i++){
            yourkey[i] = scanner.nextInt();
        }
        for(i = 0 ; i <=2 ; i++){
            lottokey[i] = (int)Math.random()*45+1;
        }

        //결과출력
        System.out.printf("로또 입력값 :");
        for(i = 0 ; i <= 2 ; i++){
            System.out.printf("%2d ",yourkey[i]);

        }
        System.out.println();
        System.out.printf("로또 당첨값 :");
        for(i = 0 ; i <= 2 ; i++){
            System.out.printf("%2d ",lottokey[i]);
        }

    }
}
 //(int)(Math.random()*45)+1;