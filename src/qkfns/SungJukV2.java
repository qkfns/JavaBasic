package qkfns;

import java.util.Scanner;

/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v2
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과를 출력함.
 *
 * 단, 평균은 소수점 첫째 자리까지 출력
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 * 만점은 100점으로, 10점단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng , mat, sum, mean, grd
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 * 그리고, Math.round(값)을 이용해서
 * 평균은 소수점 둘째자리까지 끊어서 출력함
 *
 */
public class SungJukV2 {
    public static void main(String[] args) {
        //변수선언
        String name ;
        int kor ;
        int eng ;
        int mat ;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';
        String fmt = "이름 : %d\n" +
                "국어: %d\n" +
                "영어: %d\n" +
                "수학: %d\n" +
                "총점: %d\n" +
                "평균: %.2f\n" +
                "학점: %c\n";
        String result;
        //처리
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = scanner.nextInt();
        sum= kor + eng + mat;
        mean = (double)sum / 3;
        switch ((int)(mean/10)){
            case 100:
            case 9: grd = '수'; break;
            case 8: grd = '우'; break;
            case 7: grd = '미'; break;
            case 6: grd = '양'; break;
            default: grd = '가';
        }

        // String.format(형식지정자, 변수들)
/*        mean = Double.parseDouble(
                String.format("%.5f",mean));*/

        result = String.format(fmt, name, kor, eng, mat, sum, mean, grd);


        //결과출력
/*        System.out.println("이름: "+name+"\n"+"국어: "+kor+"\n"+"영어: "+eng+"\n"+"수학: "+mat+"\n-------------------\n"
                            +"총점: "+sum+"\n"+"평균: "+Math.round(mean*100)/100.0+"\n"+"학점: "+grd+"\n");*/
        // 문자열 연결 연산자(+)로 문장을 만드는 경우 성능저하 발생
//        System.out.printf("이름:%s \n 국어:%d \n 영어:%d \n 수학:%d \n ------ \n 총점:%d \n 평균:%d \n학점:%c \n",name,kor,eng,mat,sum,mean,grd);
        System.out.println(result);
    }
}


