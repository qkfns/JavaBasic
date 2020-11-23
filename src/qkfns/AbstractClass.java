package qkfns;

// 추상 클래스
// 추상메서드를 포함하는 클래스
// 추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드
// 메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함
// 따라서, 추상클래스는 불완전 클래스이므로 객체화 할 수 없음.
// 추상 메서드나 추상 클래스는 abstract라는 키워드 사용
//
public class AbstractClass {
    public static void main(String[] args) {
        //Animal2 a1 = new Animal2();
        Cat2 c1 = new Cat2();
        System.out.println(c1.cry());
        Dog2 d1 = new Dog2();
        System.out.println(d1.cry());
    }
}
abstract class Animal2 {
    protected int weight;
    abstract String cry();
}
class Cat2 extends Animal2 {
    @Override
    String cry() {
        return "야옹~ 야옹~";
    }
}
class Dog2 extends Animal2{
    @Override
    String cry() {
        return "멍~! 멍~!";
    }
}