package day03;

public class Example19 {
    private String color;
    private String breed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(this.getColor()+"的"+this.getBreed()+"正在吃鱼");
    }
    public void catchMouse(){
        System.out.println(this.getColor()+"的"+this.getBreed()+"正在捉老鼠");
    }
}
