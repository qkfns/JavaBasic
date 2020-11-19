package lab;

public class Department {
    String dname;
    String phone;
    String office;
    String chief;

    public Department(){
        dname = "의상디자인";
        phone = "234-5678-9012";
        office = "A동 1층";
        chief = "301";
    }

    public Department(String dname,String phone,String office,String chief){
        this.dname = dname;
        this.phone = phone;
        this.office = office;
        this.chief = chief;
    }
}
