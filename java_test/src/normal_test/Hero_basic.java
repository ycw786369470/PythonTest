package normal_test;

public class Hero_basic {
//    英雄名字：字符串
    String name;
//    英雄血量：浮点型
    float max_hp;
    float now_hp;
//    英雄护甲：浮点
    float armor;
//    移动速度：整形
    int speed;
//    死亡:生命值归零
    void die(){
        now_hp = 0;
        System.out.println("阿伟死了!");
    }
//    超神
    void legendary(){
        System.out.println(name+"超神了");
    }
//    回血
    void re_hp(float hp){
        now_hp += hp
    }

//    主函数
    public static void main(String[] args) {
        Hero_basic garen = new Hero_basic();
        garen.name = "盖伦";
        garen.max_hp = 600;
        garen.now_hp = garen.max_hp;
        garen.armor = 35;
        garen.speed = 350;
//        garen.die();
//        garen.legendary();
//        garen.re_hp(20);
    }
}
