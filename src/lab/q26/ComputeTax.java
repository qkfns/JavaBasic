package lab.q26;

public class ComputeTax {
    private int salary;
    private int isMarried; // 예:0, 아니오:1


    public ComputeTax(){

    }

    public ComputeTax(int salary, int isMarried) {
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIsMarried(int isMarried) {
        this.isMarried = isMarried;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsMarried() {
        return isMarried;
    }

    public double manageTax() {
        double tax = 0;

        if (isMarried == 0){
            if(salary < 6000)tax = salary * 0.15;
            else tax = salary * 0.35;
        }else {
            if(salary < 3000)tax = salary * 0.1;
            else tax = salary * 0.25;
        }
        return tax;
    }

}
