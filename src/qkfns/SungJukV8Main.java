package qkfns;

import java.util.Scanner;

/**
 * 파일명 : SungJukV8Main
 * 작성일 : 2020.11.23
 * <p>
 * 프로그램 설명 : 성적처리프로그램v8
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV7을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스 SungJukV7
 * 인터페이스 ISungJukV7
 * 중간고사 MidSungJuk2 : 국어, 영어, 수학
 * 기말고사 FinalSungJuk2 : 국어, 영어, 수학, 미술art, 과학sci
 * 성적입력 : readSungJuk
 * 성적처리 : computeSungJuk
 * 결과출력 : printSungJuk
 */
public class SungJukV8Main {
    public static void main(String[] args) {
        /*MidSungJuk2 md2 = new MidSungJuk2();
        md2.readSungJuk();
        md2.computeSungJuk();
        md2.printSungJuk();*/
        FinalSungJuk2 fs2 = new FinalSungJuk2();
        fs2.readSungJuk();
        fs2.computeSungJuk();
        fs2.printSungJuk();
    }
}
abstract class SungJukV8 {
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public SungJukV8() {
    }

    public SungJukV8(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public int getSum() {
        return sum;
    }

    public double getMean() {
        return mean;
    }

    public char getGrd() {
        return grd;
    }
}

interface ISungJukV8 {
    void readSungJuk();
    void computeSungJuk();
    void printSungJuk();
}

class MidSungJuk2 extends SungJukV8 implements ISungJukV8{

    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = kor + eng + mat;
        mean = (double) sum / 3;
        switch ((int) (mean / 10)) {
            case 100:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';
        }
    }
    @Override
    public void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.1f\n학점 : %c";
        String result = String.format(
                fmt, name, kor, eng, mat, sum, mean, grd);
        System.out.println(result);
    }

}
class FinalSungJuk2 extends SungJukV8 implements ISungJukV8{
    protected int sci;
    protected int art;
    @Override
    public void readSungJuk() {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();
        System.out.print("미술 점수를 입력하세요 : ");
        art = sc.nextInt();
        System.out.print("과학 점수를 입력하세요 : ");
        sci = sc.nextInt();

    }

    @Override
    public void computeSungJuk() {
        sum = kor + eng + mat + art + sci;
        mean = (double) sum / 5;
        switch ((int) (mean / 10)) {
            case 100:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';

        }
    }
    @Override
    public void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n미술 : %d\n과학 : %d\n총점 : %d\n평균 : %.1f\n학점 : %c";
        String result = String.format(
                fmt, name, kor, eng, mat, art, sci, sum, mean, grd);
        System.out.println(result);
    }
}


