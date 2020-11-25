package qkfns;

// ArrayList
// 동적배열의 한 종류
// List 인터페이스를 구현해서 만든 컬렉션 프레임워크
// 요소의 저장순서가 유지
// 중복으로 데이터를 저장할 수 있음.
// 크기가 늘어나면 새로운 배열을 생성하고
// 기존의 요소들을 옮겨야 하는 복잡한 과정이 동반됨

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();


        // 데이터 추가 : add(대상)
        names.add("혜교");
        names.add("지현");
        names.add("수지");

        // 컬렉션 자료구조에 저장된 데이터를
        // 출력하려면 foreach 구문 사용
        for(String name : names) {
            System.out.println(name);
        }
    }
}
