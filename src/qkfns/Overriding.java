package qkfns;

// 메서드 재정의 override
// 객체지향 중요 3대개념중 다형성에 해당
// 상속관계에 있는 상위 클래스의 메서드를
// 하위클래스에서 같은 이름의 메서드로 재정의
// 즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말함.
public class Overriding {
    public static void main(String[] args) {
        Animal an = new Animal();
        System.out.println(an.cry());
        Cat cat = new Cat();
        System.out.println(cat.cry());
        Dog dog = new Dog();
        System.out.println(dog.cry());
        Cow cow = new Cow();
        System.out.println(cow.cry());
        Animal a = new Animal();
        System.out.println(a.cry());
    }
}
class Animal {
    protected String cry() {
        return " 동물이 웁니다.";
    }
}
class Cat extends Animal {
    @Override
    protected String cry() {
        return " 야옹~ 야옹~";
    }
}
class Dog extends Animal {
    @Override
    protected String cry(){
        return " 멍~ 멍~";
    }
}
class Cow extends Animal {
    @Override
    protected String cry() {
        return " 음메~ 음메~";
    }
}