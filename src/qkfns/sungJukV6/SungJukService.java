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

    /**
     * 입력한 이름, 국어, 영어, 수학 점수와
     * 계산된 총점,평균,학점등을 출력하는 메서드
     */
    public void printSungJuk(SungJukVO sj){
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n"
                +"수학 : %d\n총점 : %d\n평균 : %.1f\n"
                +"학점 : %c";
        String result = String.format(
                fmt, sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),sj.getSum(), sj.getMean(),sj.getGrd());
        System.out.println(result);
        //프린트에프문으로 한줄로 쓴것 위에 게 어려우면 이걸로 한번 짜보자.
        /* System.out.printf("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.1f\n학점 : %c",sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),sj.getSum(), sj.getMean(),sj.getGrd());
*/

    }
}
