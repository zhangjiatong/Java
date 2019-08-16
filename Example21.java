package day03;

public class Example21 {
    private String brand;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String prand) {
        this.brand = prand;
    }
    public void call(){
        System.out.println("正在使用价格为："+this.getPrice()+"的"+this.getBrand()+"品牌的手机打电话");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为："+this.getPrice()+"的"+this.getBrand()+"品牌的手机发短信");
    }
    public void playGame(){
        System.out.println("正在使用价格为："+this.getPrice()+"的"+this.getBrand()+"品牌的手机玩游戏");
    }

    }


