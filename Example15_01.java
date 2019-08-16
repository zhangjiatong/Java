package day03;

public class Example15_01 {
    private String name;
    private String xingbie;
    private int nianling;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public int getNianling() {
        return nianling;
    }

    public void setNianling(int nianling) {
        this.nianling = nianling;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void show(){
        System.out.println("教师"+name+"性别"+xingbie+"年龄"+nianling+"科目"+subject);
    }
}
