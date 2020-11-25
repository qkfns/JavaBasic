package qkfns;

// ArrayList
// 동적배열의 한 종류
// List 인터페이스를 구현해서 만든 컬렉션 프레임워크
// 요소의 저장순서가 유지가 안됨
// 중복으로 데이터를 저장할 수 없음.
// 크기가 늘어나면 새로운 배열을 생성하고
// 기존의 요소들을 옮겨야 하는 복잡한 과정이 동반됨

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가 : .add(대상)
        names.add("혜교");
        names.add("지현");
        names.add("수지");

        // 특정 위치에 데이터 추가 : .add(위치,대상)
        names.add(1,"수현");

        // 컬렉션 자료구조에 저장된 데이터를
        // 출력하려면 foreach 구문 사용
        // for ( 카운터 변수 : 배열이름 )
        for(String name : names) {
            System.out.println(name);
        }

        // 요소 추출 : get(위치)
        System.out.println(names.get(1));

        // 요소 수정 : set (위치, 대상)
        names.set(1, "윤아");
        System.out.println(names.get(1));

        // 요소삭제 : remove(위치)
        names.remove(1);
        System.out.println(names.get(1));

        // 요소 모두삭제 : clear
        names.clear();
        for (String name : names){
            System.out.println(name);
        }

        // 데이터 검색하기
        // 배열에서 원하는 데이터를 찾는 방법은 2가지
        // 위치에서 찾음 : get(위치)
        // 실제값으로 찾음 : contains , indexOf
        String[] game = {"원신","에픽세븐","메이플","데드바이데이라이트"};

        //ArrayList<String> games = (ArrayList<String>) Arrays.asList(game); //다운 캐스팅 오류 발생
        List<String> games = Arrays.asList(game);
        // 일반배열을 동적배열로 변환하려면
        // Arrays 클래스의 asList() 사용함

        System.out.println(games);

        // games 동적배열에서 '원신'을 찾아봄
        // 전체를 훑어가며 대상을 찾기 떄문에 성능 나쁨
        for (int i= 0; i < games.size(); i++){
            if(games.get(i).equals("메이플")) {
                System.out.println((i+1)+"번째에서 찾음");
                break;}
        } // 위치 기반 검색

        for (String g : games){
            if (g.matches("에픽세븐")){
                System.out.println("데이터 찾음");
                break;
            }
        } // 값 기반 검색
        if (games.contains("원신")){
            System.out.println("데이터 찾음!!");
        }  // 값 기반 검색
        System.out.println(games.indexOf("데드바이데이라이트"));
        // 위치 기반 검색

        // 게임정보에 대한 객체 생성
        GameInfo g1 = new GameInfo("디아블로",35000);
        GameInfo g2 = new GameInfo("스타크래프트",45000);
        GameInfo g3 = new GameInfo("워크래프트",55000);

        // 생성한 객체들을 동적배열에 저장
        ArrayList<GameInfo> games2 = new ArrayList<>();
        games2.add(g1);
        games2.add(g2);
        games2.add(g3);

        // 스타크래프트 요소를 출력
        // ArrayList의 요소가 GameInfo의 객체이므로
        // GameInfo 객체의 주소가 저장됨
        System.out.println(games2.get(1)); //

        // 따라서, GameInfo 객체의 실제값을 출력하려면
        // 객체명,변수명 또는 객체명.getter를 이용해야함
        System.out.println(games2.get(1).name);
        System.out.println(games2.get(1).price);

        // 특정 요소를 검색하는 코드를 4가지 버젼으로 작성
        for(int i=0;i<games2.size();i++){
            if((games2.get(i).name.equals("스타크래프트"))){
                System.out.println((i+1)+"번째에서 찾음");
            }
        } // 강사님 해답과 같음
        for(GameInfo g : games2){
            if(g.name.equals("디아블로")) {
                System.out.println("데이터 찾음"); break; }
        } // 강사님 해답과 같음
        for(GameInfo g : games2){
            if(g.name.contains("워크래프트")){
            System.out.println("데이터 찾음");
            }
        }// 오답 깃허브 기록 비교
        for(GameInfo g : games2){
            if(g.name.indexOf("디아블로") >= 0){
                System.out.println("데이터 찾음");
            }
        } // 깃허브 기록 비교


    }
}
class GameInfo {
    String name;
    int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }
}