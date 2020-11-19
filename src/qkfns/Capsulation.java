package qkfns;

// 캡슐화
// 클래스와 멤버변수 선언시 정보의 은닉정도를 부여
// 정보은닉 : 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다.
// 최소한의 정보만으로 보안과 보호를 구현할 수 있음.
// 자바에서 지원하는 4가지 접근 제한자
// public > default > protected > private


public class Capsulation {
    public static void main(String[] args) {
        Person2 p = new Person2();
        //p.name = "홍길동"; <----- 이렇게 쓰면 프라이빗 쓸때 안써짐
        p.setName("홍길동");
        p.setJob("도사");
        //name이라는 멤버변수에 값을 대입하려면 setter 메서드를 이용함
        System.out.println(p.getName());
        System.out.println(p.getJob());

        // 캡슐화를 적용하지 않은 코딩 (비추!!)
        // private 선언된 멤버변수는
        // 객체명. 변수명으로 값을 대입하거나 읽어서 출력할 수 없음.

    }
}
class Person2 {
    // 멤버변수 선언시 캡슐화를 적용하려면
    // 접근제한자를 private로 사용해야한다.
    private String name;
    private String job;
    private int age;
    private String gender;
    private String blood;

    // 기본 생성자

    // setter/getter 메서드
    // public void setXxx(매개변수){
    //   this.변수 = 매개변수;
    //}
    // public 반환값 getXxx() {
    //     return 멤버변수;
    //}
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }

}
// 자바빈즈 Beans : 식별가능하고, 재사용성이 높은 소프트웨어를 만들기 위한 기본 규칙
// 멤버변수는 반드시 private으로 선언
// 기본생성자가 있어야 함
// setter/getter 메서드가 정의되어야함

