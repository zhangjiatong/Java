package day03;

public class Example18 {
    private String name;
    private int age;
    private String content;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void eat(){
        System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"老师正在吃饭");
    }
    public void speak(){
        System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"老师正在亢奋的讲着"+this.getContent());
    }
}
