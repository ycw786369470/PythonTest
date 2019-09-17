package SynthesisTest;

public class Cat extends Animal implements Pet {
    public Cat(){
        super(4, "猫");
    }
    // 接口内容
    @Override
    public void set_name(String name){
        this.name = name;
    }
    @Override
    public String get_name(){
        return this.name;
    }
    @Override
    public void play(){
        System.out.println("猫咪玩");
    }
    @Override
    public void eat(){
        System.out.println("猫咪吃");
    }
}
