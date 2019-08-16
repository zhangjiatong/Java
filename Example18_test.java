package day03;

public class Example18_test {
    public static void main(String[] args) {
        Example18 teacher = new Example18();
        Example18_02 student = new Example18_02();
        teacher.setName("周志鹏");
        teacher.setAge(30);
        teacher.setContent("Java基础中面向对象的知识");
        teacher.eat();
        teacher.speak();
        student.setAge(18);
        student.setName("韩光");
        student.setContent("面向对象的知识");
        student.eat();
        student.study();
    }
    }

