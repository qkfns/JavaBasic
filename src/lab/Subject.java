package lab;

public class Subject {

    String subjnum;
    String subject;
    String resume;
    String professor;

    public Subject(){
        subjnum = "0205";
        subject = "드레스코드";
        resume = "옷 입기의 기초";
        professor = "445";
    }

    public Subject(String subjnum,String subject,String resume,String professor){
        this.subjnum = subjnum;
        this.subject = subject;
        this.resume = resume;
        this.professor = professor;
    }
}
