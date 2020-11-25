package qkfns;

import java.util.*;

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

        for (String n : names) {
            System.out.println(n);
        } // 2번 입력한 데이터는 하나로만 출력

        // 컬렉션 요소 순환(iterate)하기
        // 컬렉션 프레임워크에 저장된 각 요소들을
        // 읽어오는 방법을 표준화한 것
        // Iterator는 OOP프로그래밍에서 배열이나
        // 그와 유사한 자료구조의 내부 요소를
        // 순회하는 객체를 의미
        Iterator<String> iter = names.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 데이터 수정 : set (사용불가)
        // names.set(0, "수현");
        // 따라서, 먼저 remove한 후 add로 처리
        // 혜교를 수현으로 바꾸는 경우
        names.remove("혜교");
        names.add("수현");

        // Hashset에 다양한 유형의 값을 추가해 봄
        names.add("apple");
        names.add("peach");
        names.add("berry");

        names.add("123");
        names.add("789");
        names.add("456");


        for (String n : names) {
            System.out.println(n);
        } // 값들이 특이한 순서로 출력됨
        // => 각 데이터의 고유 해쉬값에 의해 정렬되어 출력

        // https://url.kr/IJ7jdR
        // sha256 hash코드 생성기
        // sha (secure hash algorithm)
        // 256 : 256bit 길이의 코드생성

        // HashMap
        // 키와 값으로 저장하는 컬렉션 클래스
        // Map인터페이스를 구현한 컬렉션 클래스
        // 키와 값을 하나의 쌍으로 저장하는 방식을 사용
        // 키는 실질적으로 값을 찾기 위한 방편으로 사용
        // 요소의 저장순서는 유지되지않음
        // 키는 중복 데이터를 저장할 수 없음
        // 단, 값은 중복으로 저장할 수 있음
        // 해시 알고리즘을 사용하기 때문에
        // 검색속도가 매우 빠름

        // 데이터 추가 : put(키, 값)
        // 게임이름과 가격을 저장하는 해시맵을 생성
        Map<String, Integer> product = new HashMap<>();

        product.put("디아블로", 30000);
        product.put("스타크래프트", 45000);
        product.put("워크래프트", 25000);

        // 값 조회 : get(키)
        System.out.println(product.get("스타크래프트"));

        // 모든 키 확인 : keySet
        // keySet 메서드의 리턴값은 Set임
        Set<String> keys = product.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // 모든 값 확인 : values
        // values 메서드의 리턴값
        Collection<Integer> vals = product.values();
        for (Integer val : vals) {
            System.out.println(val);
        }

        Map<Integer, GameInfo> games = new HashMap<>();

        games.put(123, new GameInfo("원신", 5500));
        games.put(234, new GameInfo("데바데", 25000));
        games.put(345, new GameInfo("에픽세븐", 12500));

        System.out.println(games.get(234).name);
        // GaemInfo의 모든 게임정보 출력
        for (Integer key : games.keySet()) {
            System.out.println(games.get(key).name);
            System.out.println(games.get(key).price);
        }

        // 해시알고리즘
        // 해시함수 : 임의의 길이를 갖는 임의의 데이터에 대해
        //          고정된 길이의 데이터로 매핑하는 함수
        // 해시값 : 해시함수를 적용해서 나온 값
        // CPU 연산이 많이 필요하지 않음
        // 같은 입력값에 대해서는 같은 출력값이 출력
        // 단, 해시함수 알고리즘에 따라 다르게 출력하게 할 수 있다.
        // 간혹, 서로 다른 데이터에 대해 같은 결과값이 나오는 경우 발생 => 충돌
        // 대표적인 해시함수 : MD5, SHA256
        // 응용분야 : 레코드 검색, 유사 레코드 비교, 암호화
    }
}
