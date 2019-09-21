package SynthesisTest;

public class Spider extends Animal {
    public Spider(String name,int legs){
        super(legs, name);
    }
    public void eat(){
        System.out.println("蜘蛛吃");
    }
}
