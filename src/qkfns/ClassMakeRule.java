package qkfns;

// 클래스 종류
// VO/DTO : ValueObject, Data Transfer object
// 계층간 데이터교환을 위한 자바빈즈를 의미
// 값만 저장하기 위해 생성하는 클래스
// 주로 데이터베이스 테이블의 각 열과 연계해서 작성

// DAO : data access object
// 데이터베이스를 사용해서 데이터를 추가/조회/수정/삭제하는 기능을 전담하는 클래스
// VO 클래스와 연계해서 작성함
// 인터페이스로 기능을 정의하고 클래스로 구현함

// Service : 비지니스 로직 처리를 담당하는 클래스
// VO로 저장된 데이터를 DAO로 넘기기 전에 처리해야 하는 일반적인 작업을 기능으로 구현한 클래스
// 일반적인 프로그래밍 흐름
// J2EE 개발에 최적화된 방식
// VO -> Service -> DAO
public class ClassMakeRule {
    public static void main(String[] args) {

    }
}
