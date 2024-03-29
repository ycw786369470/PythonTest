package inter_test;

public class Hero {
    String name;
    float max_hp;
    float now_hp;
    float damage;
    float armor;
    int speed;
    // 静态属性
    static String copy_right;

    // 构造方法有参
    public Hero(String hero_name){
        name = hero_name;
        System.out.println(name + "诞生了！");
    }

    // 无参构造方法
    public Hero(){
        System.out.println("一个新的英雄诞生");
    }

    public void use_item(Item i){
        i.effect(name);
    }

    public void this_test(){
        System.out.println(this);
    }

    public void attack(){
        System.out.println(name+"进行了攻击？");
    }

    public void attack(Hero h1){
        System.out.println(name + "给【" + h1.name + "】开了一道！");
        h1.now_hp -= damage - h1.armor;
    }

    public static void start(){
        System.out.println("游戏开始");
    }

    public void attack(Hero h1, Hero h2){
        System.out.println(String.format("噢！【%s】重创了【%s】和【%s】！",name, h1.name, h2.name ));
        h1.now_hp = h1.now_hp - (damage - h1.armor);
        h2.now_hp = h2.now_hp - (damage - h2.armor);
    }

    // 重写返回
    public String toString(){
        return "i am " + name;
    }

    // 回收

    // 内部类,外部类存在时才生效
    public class Battle{
        int killed;
        int dead;
        int assis;

        public void is_legend(){
            if(this.killed >= 8){
                System.out.println(name + "超神了!");
            }else {
                System.out.println("想屁吃");
            }
        }
    }
}



