package qkfns.sungJukV6;

public class SungJukV6Main {
    public static void main(String[] args) {
        SungJukService sjsrv = new SungJukService();
        SungJukVO sj = sjsrv.readSungJuk();

        // 변수의 유효범위 scope
        // 변수가 생성된 위치와 사용하는 위치가 다른 경우
        // 그 결과가 예상과 다를 수 있음.
        // 변수의 유효범위는 블록이라 하고 { } 로 표현
        // 기본자료형 변수 : call by value
        // 참조자료형 변수 : call by reference

        sjsrv.computeSungJuk(sj);

        sjsrv.printSungJuk(sj);

    }
}


