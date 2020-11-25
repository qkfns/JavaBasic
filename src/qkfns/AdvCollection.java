package qkfns;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdvCollection {
    public static void main(String[] args) {
        // Set : 집합
        // Set 인터페이스를 구현한 컬렉션 클래스
        // 요소의 저장순서가 유지 안됨
        // 데이터를 중복으로 저장 불가
        //
        // HashSet : 해쉬 알고리즘을 이용해서
        // 데이터를 저장하기 때문에 검색속도가 빠름
        // 일반적으로 저장된 자료의 양에 상관없이
        // 특정 데이터를 찾는데 걸리는 시간이
        // 항상 일정할 순 없을까?
        // => 해쉬 알고리즘을 이용해서 실현
        Set<String> names = new HashSet<>();

        // 데이터 추가 : add
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("지현");      // 중복데이터 추가
        // 데이터 모두 출력
        /*for (int i = 0; i< names.size();++i){
            System.out.println(names.get(i));
        }  // HashSet 에서는 get 사용불가  */

        for (String n : names){
            System.out.println(n);
        } // 2번 입력한 데이터는 하나로만 출력

        // 컬렉션 요소 순환(iterate)하기
        // 컬렉션 프레임워크에 저장된 각 요소들을
        // 읽어오는 방법을 표준화한 것
        Iterator<String> iter = names.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
