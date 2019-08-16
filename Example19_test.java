package day03;

public class Example19_test {
    public static void main(String[] args) {
        Example19 cat = new Example19();
        Example19_02 dog = new Example19_02();
        cat.setBreed("波斯猫");
        cat.setColor("花色");
        cat.eat();
        cat.catchMouse();
        dog.setBreed("藏獒");
        dog.setColor("黑色");
        dog.eat();
        dog.lookHome();
    }
}
