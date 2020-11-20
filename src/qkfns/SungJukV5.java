package qkfns;

import java.util.Scanner;

/**
 * 파일명 : SungJukV5
 * 작성일 : 2020.11.18
 *
 * 프로그램설명 : 성적처리프로그램 v5
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
 * 코드의 가독성과 유지보수를 용이하게 하기 위해
 * 메서드 기반 코드로 재작성
 */
public class SungJukV5 {

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
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];
        String fmt = "이름 : %s\n 국어: %d\n 영어: %d\n 수학: %d\n 총점: %d\n 평균: %.2f\n 학점: %c\n";

        //처리
        readSungJuk(name,kor,eng,mat);
        computeSungJuk(kor,eng,mat,sum,mean,grd);
        //결과출력
        printSungJuk(fmt,name,kor,eng,mat,sum,mean,grd);

    }//main

    //성적데이터 입력받기 : readSungJuk
    public static void readSungJuk(
            String name[], int kor[], int eng[], int mat[]) {
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i< 3; i++) {
            System.out.println((i+1) + "번째 학생 성적 입력중...");
            System.out.print("이름을 입력하세요 : ");
            name[i] = scanner.nextLine();
            System.out.print("국어 점수를 입력하세요 : ");
            kor[i] = scanner.nextInt();
            System.out.print("영어 점수를 입력하세요 : ");
            eng[i] = scanner.nextInt();
            System.out.print("수학 점수를 입력하세요 : ");
            mat[i] = scanner.nextInt();
            scanner.skip("\r\n|[\n\r]");
            // 수학 성적 입력시 같이 입력된 enter키가 다음 데이터 입력시 입력값으로 자동으로 전달됨.
            // 그러한 상황을 해결하기 위해 미리 엔터키를 제거하는 코드를 삽입한다. sc.skip("\r\n|[\n\r]");
            // or Integer.parseInt(sc.nextLine())이용해서 문자열을 숫자로 변환해서 입력하면된다.
        }
    }
    //성적데이터 총점,평균,학점 처리 : computeSungJuk
    public static void computeSungJuk(
            int kor[],int eng[],int mat[],int sum[],double mean[], char grd[]) {
        for(int i = 0; i<3; i++) {
            sum[i] = kor[i] + eng[i] + mat[i];
            mean[i] = (double) sum[i] / 3;
            switch ((int) (mean[i] / 10)) {
                case 100:
                case 9: grd[i] = '수'; break;
                case 8: grd[i] = '우'; break;
                case 7: grd[i] = '미'; break;
                case 6: grd[i] = '양'; break;
                default: grd[i] = '가';
            }
        }
    }
    //처리 결과 출력 : printSungJuk
    public static void printSungJuk(
            String fmt,String name[], int kor[], int eng[], int mat[],int sum[],double mean[],char grd[]){
        for(int i =0; i<3; i++){
            System.out.printf(fmt,name[i],kor[i],eng[i],mat[i],sum[i],mean[i],grd[i]);
            //System.out.printf("이름:%s \n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.2f\n학점:%c\n",name[i],kor[i],eng[i],mat[i],sum[i],mean[i],grd[i]);
        }
    }



}//class

//두개의 정수를 매개변수로 선언하고
//사칙연산한 결과를 출력하는 메서드 : computeNum