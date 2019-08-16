package day03;

public class Example17_test {
    public static void main(String[] args) {
        Example17 jingli = new Example17();
        Example17_02 chengxuyuan = new Example17_02();
        jingli.setBonus(5000);
        jingli.setId("123456789");
        jingli.setName("一龙");
        jingli.setSalary(2000);
        jingli.work();
        chengxuyuan.setId("00000000000");
        chengxuyuan.setName("方便");
        chengxuyuan.setSalary(3000);
        chengxuyuan.work();
    }
    }

