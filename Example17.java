package day03;

public class Example17 {
    private String name;
    private String id;
    private int salary;
    private int bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("工号为"+this.getId()+"基本工资为"+this.getSalary()+"奖金为"+this.getBonus()+"的项目经理"+this.getName()+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码");
    }
}
