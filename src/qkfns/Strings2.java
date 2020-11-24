package qkfns;

// 문자열 처리시 유용한 기능을 제공하는 메서드

public class Strings2 {
    public static void main(String[] args) {
        String str = "Hello, World!!";

        //문자열 검색
        //indexOf : 왼쪽기준 지정한 문자 찾기, 위치값 출력
        int idx = str.indexOf('W');
        System.out.println(idx);
        idx = str.indexOf('?');
        System.out.println(idx);
        idx = str.indexOf("World");
        System.out.println(idx);

        //lastIndexOf(문자) : 오른쪽기준 지정한 문자 찾기, 위치값 출력
        str = "Hello, Hi, Noon";
        idx = str.lastIndexOf('N');
        System.out.println(idx);

        // 문자 바꾸기 : replace
        // replace(찾을 문자열, 바꿀 문자열)
        str = "A*B*C*D";
        str = str.replace("*","-");
        System.out.println(str);

        // 문자열 분리 : split
        // 지정한 문자를 기준으로 문자열을 바꿔 배열 저장
        // split(구분기호)
        str = "201350050,김태희,경기도,1985.3.22,컴퓨터,504";
        String[] result = str.split(",");
        /*for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }*/
        for (String data : result){
            System.out.println(data);
        }//향상된 for문을 사용하면 배열을 쉽게 다룰 수 있음.

        //문자열 추출 : substring
        // substring(시작위치, 끝위치-1)
        str = "Hello, World!!";
        str = str.substring (7, 12);
        System.out.println(str);

        // ex) 주민번호에서 성별체크하는 자바코드 작성
        // 123456-1234567 , 987654-4567890
        // 1, 2 : 2000년 이전 남여 구분
        // 3, 4 : 2000년 이후 남여 구분

        String a = "123456-4234567";
        a = a.substring(7,8);
        if (a.equals("1")){
            System.out.println("2000년 이전 남자입니다.");
        }
        if (a.equals("2")){
            System.out.println("2000년 이전 여자입니다.");
        }
        if (a.equals("3")){
            System.out.println("2000년 이후 남자입니다.");
        }
        if (a.equals("4")){
            System.out.println("2000년 이후 여자입니다.");
        }

        // 지정한 위치의 문자 추출 : charAt(추출할위치)
        str = "123456-1234567";
        System.out.println(str.charAt(7));

        // 정규표현식에 따라 일치여부 확인 : matches
        // 정규식 사용가능 메서드 : split, replaceAll
        int num = 1234567;
        String str1 = String.format("%d",num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));

        str1 = String.format("%,d",num);
        System.out.println(str1.matches(str2));
        System.out.println(str1.matches("[a-z].+"));
        System.out.println(str1.matches("[0-9].+"));
        
        // 정규표현식 regular expression
        // 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 사용하는 형식언어
        // [0-9] : 숫자 집합
        // [a-zA-z] : 영문자 집합
        // [가-힣] : 한글 집합
    }



}
