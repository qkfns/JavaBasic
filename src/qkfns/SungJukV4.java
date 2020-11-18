package qkfns;

/**
 * 파일명 : SungJukV4
 * 작성일 : 2020.11.18
 *
 * 프로그램설명 : 성적처리프로그램 v4
 * 학생 3명의 성적 데이터를 입력 받아서
 * 총점,평균,학점을 계산하고 결과를 출력.
 *
 * 단, 평균은 소수점 첫째 자리까지 출력
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 * 만점은 100점으로, 10점단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng , mat, sum, mean, grd
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 *
 * 성적처리 기능을 구현함으로써 코드가 길어지고 내용파악이 힘들어지는 것을 방지하기 위해
 * 함수 (메서드로)로 재정의해서 코드를 개선함.
 */
public class SungJukV4 {
    //메서드
    //특정 작업을 수행하기 위해 작성한 명령어들의 묶음. c언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
    //입력값을 통해 무언가를 하고 그 결과를 도출하는 수학의 함수(블랙박스)와 비슷한 개념

    //메서드의 목적
    //프로그램을 작성하다보면 반복적으로 쓰인 코드를 종종 보는데, 효율적으로 작성하려면 반복문으로 처리하면 되지만,만일 반복문이 반복된다면
    //메서드를 적용하면 기능별로 모듈화를 적용할 수 있기 때문에 프로그램의 가독성이 좋아지고, 협업시에도 유용하며, 기능변경시 유지보수에도 좋음.

    //메서드 정의
    //접근제한자 리턴값 메서드이름(타입 매개변수명){
    //       메서드 몸체
    //}
    public static void main(String[] args) {
        //변수선언
        computeNum(10, 5);
        computeAllSum(1, 50);



    }

    public static int computeNum(int a, int b) {
        System.out.printf("%d + %d = %d \n", a, b, (a + b));
        System.out.printf("%d - %d = %d \n", a, b, (a - b));
        System.out.printf("%d * %d = %d \n", a, b, (a * b));
        System.out.printf("%d / %d = %d \n", a, b, (a / b));
        return a;

    }

    public static int computeAllSum(int a, int b) {
        int min = a;
        int max = b;
        int sum = 0;
        if (a > b) { min = b; max = a;}
        String fmt = "%d와 %d 정수 범위의 총합 = %d \n";

        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        System.out.printf(fmt, min, max, sum);
        return sum;
    }
}

//두개의 정수를 매개변수로 선언하고
//사칙연산한 결과를 출력하는 메서드 : computeNum