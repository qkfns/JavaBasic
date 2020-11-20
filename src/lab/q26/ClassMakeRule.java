package lab.q26;

public class ClassMakeRule {
    public static void main(String[] args) {
        //세금 계산을 위한 객체 생성
        ComputeTax choi = new ComputeTax(3500,1);

        System.out.println(choi.manageTax());

        choi = new ComputeTax(7800,0);

        System.out.println(choi.manageTax());
    }
}
