package qkfns;

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
        s2 s3 = new s2();

    }
}
interface ISungJukV7 {
    void readSungJuk(int kor);


}
class s2 implements ISungJukV7{

    @Override
    public void readSungJuk(int kor) {

    }
}

