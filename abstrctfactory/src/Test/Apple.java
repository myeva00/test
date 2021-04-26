package Test;

public class Apple extends Fruit{
    String name;
    public void getname(String name){
        this.name = name;
    }
    public void eat(){
        super.eat(name);
    }
}
