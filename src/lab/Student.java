package lab;

public class Student {
    int stdno;
    String name;
    String home;
    int birth;
    String dept;
    String prof;

    public Student(){
        stdno = 201250006;
        name = "송혜교";
        home = "서울 영등포구";
        birth = 19880917;
        dept = "컴퓨터";
        prof = "301";
    }
    public Student(int stdno,String name,String home,int birth,String dept,String prof){
        this.stdno = stdno;
        this.name = name;
        this.home = home;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;

    }


}
