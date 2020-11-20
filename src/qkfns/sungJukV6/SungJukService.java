package qkfns.sungJukV6;


import java.util.Scanner;

public class SungJukService {
    //성적을 키보드로 입력받는 메소드
    public SungJukVO readSungJuk(){
        String name;
        int kor;
        int eng;
        int mat;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();
        return new SungJukVO(name,kor,eng,mat,0,0,' ');
    }

    //성적의 총점 학점 평균을 구하는 메소드
    public void computeSungJuk(SungJukVO sj){
        sj.setSum ( sj.getKor() + sj.getEng() + sj.getMat());
        sj.setMean( (double)sj.getSum() / 3)  ;
        switch((int)(sj.getMean() / 10)){
                case 10:
                case 9: sj.setGrd('수'); break;
                case 8: sj.setGrd('우'); break;
                case 7: sj.setGrd('미'); break;
                case 6: sj.setGrd('양'); break;
                default: sj.setGrd('가');
        } //switch
    } //computeSungJuk

    /*public void printSungJuk()*/


}
