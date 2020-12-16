package qkfns;

import java.util.Scanner;

/**
 * 파일명 : SungJukV7Main
 * 작성일 : 2020.11.23
 * <p>
 * 프로그램 설명 : 성적처리프로그램v6
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 상속을 이용해서 작성하세요
 * <p>
 * 중간고사MidSungJuk : 국어, 영어, 수학
 * 기말고사FinalSungJuk : 국어, 영어, 수학, 미술art, 과학sci
 * 성적처리 : computeSungjuk
 * 결과출력 : printSungjuk
 */

public class SungJukV7Main {
    public static void main(String[] args) {
        MidSungJuk md = new MidSungJuk();
        md.readSungJuk();
        md.computeSungJuk();
        md.printSungJuk();
        FinalSungJuk fin = new FinalSungJuk();
        fin.readSungJuk();
        fin.computeSungJuk();
        fin.printSungJuk();
    }
}

class MidSungJuk {
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int mat) {
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

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public void setGrd(char grd) {
        this.grd = grd;
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

    public int getSum() {
        return sum;
    }

    public double getMean() {
        return mean;
    }

    public char getGrd() {
        return grd;
    }

    protected void readSungJuk() {
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

    protected void computeSungJuk() {
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

    protected void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.1f\n학점 : %c";
        String result = String.format(
                fmt, name, kor, eng, mat, sum, mean, grd);
        System.out.println(result);
    }
}

class FinalSungJuk extends MidSungJuk {
    protected int art;
    protected int sci;

    public FinalSungJuk() {
    }

    public FinalSungJuk(String name, int kor, int eng, int mat, int art, int sci) {
        //부모클래스에 정의된 멤버변수 초기화 코드를 super라는 이름으로 치환해서 호출할 수 있음
        // super(생성자 매개변수목록)
        super(name, kor, eng, mat);
        this.art = art;
        this.sci = sci;
    }

    @Override
    protected void readSungJuk() {
        super.readSungJuk();
        Scanner sc = new Scanner(System.in);

        System.out.print("미술 점수를 입력하세요 : ");
        art = sc.nextInt();
        System.out.print("과학 점수를 입력하세요 : ");
        sci = sc.nextInt();
    }

    protected void computeSungJuk() {
        // 부모클래스에 정의된 총점 변수를 super라는 이름으로 치환해서 호출할 수 있음
        // super.멤버변수명
        // sum = super.sum + sci + art;
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
    protected void printSungJuk() {
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n미술 : %d\n과학 : %d\n총점 : %d\n평균 : %.1f\n학점 : %c";
        String result = String.format(
                fmt, name, kor, eng, mat, art, sci, sum, mean, grd);
        System.out.println(result);
    }
}

