package qkfns;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

/*
        System.out.println("프로그램 시작3");
        int d = 10, e = 0;
        int f = 0;
        try {
            f = d / e;      // 오류 발생! - 실행중단!
        } catch(ArithmeticException ex){
            // 예외처리 핸들러
            System.out.println(">> 오류발생! <<");
        }
        System.out.println(f);
        System.out.println("프로그램 끝4");
*/

        // ex) 1~9사이 정수만 입력받아 화면에 출력하는 코드를 작성하세요
        // 단, 예외처리코드를 이용해서 문자를 입력했을때에도 프로그램 실행이 중단되지 않도록 합니다.

        Scanner scanner = new Scanner(System.in);

/*        try {
            while(true){
                System.out.println("1~9사이 정수를 입력하세요");
                int scannum = scanner.nextInt();
                if (scannum <= 9 && scannum >= 1) {
                    System.out.printf("%d를 입력하셨습니다.", scannum);
                    break;

                } else if (scannum > 9) {
                    System.out.println("1~9사이의 정수가 아닙니다.");
                    continue;
                }
            }
        }catch (InputMismatchException ime){
            System.out.println("에러입니다.");
            System.out.println("1~9사이 정수만 입력가능합니다");
        }*/

        // ex) 학생3명의 이름을 입력받아 화면에 출력하는 코드를 작성하세요
        // 단, 배열과 예외처리를 이용해서 코드를 작성하세요


/*        String [] names = new String[3];

        try{
            for (int i = 0; i< names.length; i++){
                System.out.println("이름[" + i + "] 은?");
                names[i] = scanner.next();
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("배열의 크기를 초과했어요!");
        }
*/

        // 예외종류
        // 검사형 예외 : checked exception
        // 비검사형 예외 : unchecked exception

        // 비검사형 예외
        // 명시적인 예외처리를 강제하지 않음
        // 예외발생 확인 시점은 실행시임
        // ArithmeticException
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        // 검사형 예외
        // 명시적인 예외처리를 강제함 (반드시!)
        // 예외 발생 확인 시점은 컴파일시임
        // IOException
        // ClassNotFoundException

        // ex) sungjuk.dat 파일을 읽어서 화면에 출력하세요

        String fname = "d:/Java/sungjuk.dat";

/*        try{
            FileReader fr = new FileReader(fname);
            while (fr.ready()){
                System.out.print((char)fr.read());
            }
            fr.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("성적파일은 d:/Java/sungjuk.dat입니다!");
        } catch (IOException ie) {
            System.out.println("파일을 읽어올 때 오류 발생!!");
        }*/

        // finally 블럭
        // 예외발생 여부와 상관없이 무조건 실행되는 코드는
        // finally 절에 작성함

        /*FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ie) {
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ie) {
                }
            }
        }*/


        // try -- with -- resource
        // JDK7부터는 데이터베이스를 이용하는 자바코 등의 경우
        // 자원을 반납하는 코드가 반드시 작성되어야 하는데, try-with-resource 구문을 사용하면
        // 명시적으로 자원 반납코드를 작성하지 않아도 됨

        try (FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);) {
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(fname);
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write("이 글이 보이나요?");
        } catch (IOException ie) {
            ie.printStackTrace();
        }

        // 예외 회피/양도/떠넘기기
        // 메서드 선언부에 throws를 사용해서
        // 해당 메서드에서 발생한 예외를 미리 명시하고
        // 메서드를 호출한 상위메서드에서 이것을 처리하도록 할 수 있음
        // 이를 통해 각 하위메서드에서 발생하는 예외들을
        // 한 곳에 모아서 처리할 수 있음.
        // 메서드서명 throws 예외종류





    }
}
