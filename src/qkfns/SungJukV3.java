package qkfns;

import java.util.Scanner;

/**
 * 파일명 : SungJukV3
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v3
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
 */
public class SungJukV3 {
    public static void main(String[] args) {
        //변수선언
        String name1,name2,name3 ;
        int kor1,kor2,kor3 ;
        int eng1,eng2,eng3 ;
        int mat1,mat2,mat3 ;
        int sum1,sum2,sum3 = 0;
        double mean1,mean2,mean3 = 0.0;
        char grd1,grd2,grd3= '가';
        //처리
        System.out.println("1번째 학생 성적 입력중...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name1 = scanner.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor1 = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng1 = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat1 = scanner.nextInt();
        sum1= kor1 + eng1 + mat1;
        mean1 = (double)sum1 / 3;
        switch ((int)(mean1/10)){
            case 100:
            case 9: grd1 = '수'; break;
            case 8: grd1 = '우'; break;
            case 7: grd1 = '미'; break;
            case 6: grd1 = '양'; break;
            default: grd1 = '가';
        }
        System.out.println("2번째 학생 성적 입력중...");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name2 = scanner2.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor2 = scanner2.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng2 = scanner2.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat2 = scanner2.nextInt();
        sum2= kor2 + eng2 + mat2;
        mean2 = (double)sum2 / 3;
        switch ((int)(mean2/10)){
            case 100:
            case 9: grd2 = '수'; break;
            case 8: grd2 = '우'; break;
            case 7: grd2 = '미'; break;
            case 6: grd2 = '양'; break;
            default: grd2 = '가';
        }
        System.out.println("3번째 학생 성적 입력중...");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name3 = scanner3.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor3 = scanner3.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng3 = scanner3.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat3 = scanner3.nextInt();
        sum3= kor3 + eng3 + mat3;
        mean3 = (double)sum3 / 3;
        switch ((int)(mean3/10)){
            case 100:
            case 9: grd3 = '수'; break;
            case 8: grd3 = '우'; break;
            case 7: grd3 = '미'; break;
            case 6: grd3 = '양'; break;
            default: grd3 = '가';
        }
        //결과출력
        System.out.printf("이름:%s \n국어:%d \n영어:%d \n수학:%d\n총점:%d \n평균:%.2f \n학점:%c \n-------\n",name1,kor1,eng1,mat1,sum1,mean1,grd1);
        System.out.printf("이름:%s \n국어:%d \n영어:%d \n수학:%d\n총점:%d \n평균:%.2f \n학점:%c \n-------\n",name2,kor2,eng2,mat2,sum2,mean2,grd2);
        System.out.printf("이름:%s \n국어:%d \n영어:%d \n수학:%d\n총점:%d \n평균:%.2f \n학점:%c \n-------\n",name3,kor3,eng3,mat3,sum3,mean3,grd3);
    }
}


