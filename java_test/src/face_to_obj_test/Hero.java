package face_to_obj_test;

public class Hero {
    String name;
    float max_hp;
    float now_hp;
    float damage;
    float armor;
    int speed;

    public void attack(){
        System.out.println(name+"进行了攻击？");
    }
    public float attack(Hero h1){
        System.out.println(name + "给【" + h1.name + "】开了一道！");
        h1.now_hp -= damage - h1.armor;
        return h1.now_hp;
    }

    public float[] attack(Hero h1, Hero h2){
        System.out.println(String.format("噢！【%s】重创了【%s】和【%s】！",name, h1.name, h2.name ));
        h1.now_hp = h1.now_hp - (damage - h1.armor);
        h2.now_hp = h2.now_hp - (damage - h2.armor);
        float[] hps = {h1.now_hp, h2.now_hp};
        System.out.println("hero" + h1.now_hp + h2.now_hp);
        return hps;
    }
}



