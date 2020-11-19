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

        Subject comp = new Subject();
        comp.subjectname ="컴퓨터공학";
        comp.phonenumber ="123-4567-8901";
        comp.adress ="E동 2층";
        comp.subjectking = "504" ;

        Department prog = new Department();
        prog.departmentnumber = "0205";
        prog.departmentname = "프로그래밍";
        prog.professor = "자바 프로그래밍";
        prog.resume = "담당교수";

        Professor lee = new Professor();
        lee.professornumber = 301;
        lee.name = "이순신";
        lee.major = "프로그래밍";

        System.out.println("학번: " + kim.classnumber);
        System.out.println("이름: " + kim.name);
        System.out.println("주소: " + kim.home);
        System.out.println("생년월일: " + kim.birthday);
        System.out.println("학과명: " + kim.Subjectname);
        System.out.println("교수: " + kim.professor);
        System.out.println();

        System.out.println("학과명: " + comp.subjectname);
        System.out.println("전화번호: " + comp.phonenumber);
        System.out.println("사무실 위치: " + comp.adress);
        System.out.println("학과장: " + comp.subjectking);
        System.out.println();

        System.out.println("과목번호: " + prog.departmentnumber);
        System.out.println("과목명: " + prog.departmentname);
        System.out.println("과목개요: " + prog.resume);
        System.out.println("담당교수: " + prog.professor);
        System.out.println();

        System.out.println("교수번호: " + lee.professornumber);
        System.out.println("이름: " + lee.name);
        System.out.println("전공분야: " + lee.major);

    }

}
