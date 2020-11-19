package lab;

public class Professor {
    int profnum;
    String name;
    String major;

    public Professor(){
        profnum = 445;
        name = "정약용";
        major = "의상디자인";
    }

    public Professor(int profnum,String name,String major){
        this.profnum = profnum;
        this.name = name;
        this.major = major;
    }
}
