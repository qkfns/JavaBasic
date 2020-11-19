package lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체 생성
        //학과 클래스를 이용해서 객체 생성
        //과목 이하동문
        //교수 이하동문

        //각 객체의 변수에 값 대입

        //객체에 저장된 값 출력력
        Student kim = new Student(20130050,"김태희","경기도 고양시",1985322,"컴퓨터","504");
/*        kim.stdno = 201350050;
        kim.name = "김태희";
        kim.home = "경기도 고양시";
        kim.birth = 19850322;
        kim.dept= "컴퓨터";
        kim.prof = "504";*/

        Department comp = new Department();
        comp.dname ="컴퓨터공학";
        comp.phone ="123-4567-8901";
        comp.office ="E동 2층";
        comp.chief = "504" ;

        Subject prog = new Subject();
        prog.subjnum = "0205";
        prog.subject = "프로그래밍";
        prog.professor = "자바 프로그래밍";
        prog.resume = "담당교수";

        Professor lee = new Professor();
        lee.profnum = 301;
        lee.name = "이순신";
        lee.major = "프로그래밍";

        System.out.println("학번: " + kim.stdno);
        System.out.println("이름: " + kim.name);
        System.out.println("주소: " + kim.home);
        System.out.println("생년월일: " + kim.birth);
        System.out.println("학과명: " + kim.dept);
        System.out.println("교수: " + kim.prof);
        System.out.println();

        System.out.println("학과명: " + comp.dname);
        System.out.println("전화번호: " + comp.phone);
        System.out.println("사무실 위치: " + comp.office);
        System.out.println("학과장: " + comp.chief);
        System.out.println();

        System.out.println("과목번호: " + prog.subjnum);
        System.out.println("과목명: " + prog.subject);
        System.out.println("과목개요: " + prog.resume);
        System.out.println("담당교수: " + prog.professor);
        System.out.println();

        System.out.println("교수번호: " + lee.profnum);
        System.out.println("이름: " + lee.name);
        System.out.println("전공분야: " + lee.major);

    }

}
