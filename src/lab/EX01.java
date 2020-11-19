package lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체 생성
        //학과 클래스를 이용해서 객체 생성
        //과목 이하동문
        //교수 이하동문

        //각 객체의 변수에 값 대입

        //객체에 저장된 값 출력력
        Student kim = new Student();
        kim.classnumber = 201350050;
        kim.name = "김태희";
        kim.home = "경기도 고양시";
        kim.birthday = 19850322;
        kim.Subjectname= "컴퓨터";
        kim.professor = "504";

        System.out.println("학번: " + kim.classnumber);
        System.out.println("이름: " + kim.name);
        System.out.println("주소: " + kim.home);
        System.out.println("생년월일: " + kim.birthday);
        System.out.println("학과명: " + kim.Subjectname);
        System.out.println("교수: " + kim.professor);
    }
}
