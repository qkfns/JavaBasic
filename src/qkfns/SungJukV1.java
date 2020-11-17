package qkfns;

/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v1
 * 이름,국어,영어,수학점수를 설정하면
 * 총점,평균,학점을 계산하고 결과를 출력함.
 * 학점기준은 '수우미양가'로 함
 * 만점은 100점으로, 10점단위로 학점
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng , mat, sum, mean, grd
 */
public class SungJukV1 {
    public static void main(String[] args) {
        String name;
        int kor=99,eng=98,mat=99;
        double sum,mean;
        name="홍길동";
        sum = kor+eng+mat;
        mean= (double)sum/3;

        System.out.println("이름: "+name);
        System.out.println("국어점수: "+kor);
        System.out.println("영어점수: "+eng);
        System.out.println("수학점수: "+mat);
        System.out.println("평균점수: "+mean);

        if (mean>=90){
            System.out.println("학점: 수");
        }
        if (mean<90&&mean>=80){
            System.out.println("학점: 우");
        }
        if (mean<80&&mean>=70){
            System.out.println("학점: 미");
        }
        if (mean<70&&mean>=60){
            System.out.println("학점: 양");
        }
        if (mean<60&&mean>=0){
            System.out.println("학점: 가");
        }
        if (mean<0){
            System.out.println("오류입니다. 점수를 다시 확인해주세요");
        }
    }
}

