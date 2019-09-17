package SynthesisTest;

public abstract class Animal {
    protected int legs;
    protected String name;

    protected Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

    abstract void eat();

    void walk(){
        System.out.println("用" + legs + "条腿走路");
    }
}
