package face_to_obj_test;

// 奶妈
public class Healer extends Hero {
    float heal;

    public void healing(Hero h1){
        // 判断是否超过血量上限
        if (h1.now_hp + heal > h1.max_hp){
            h1.now_hp = h1.max_hp;
        }else {
            h1.now_hp += heal;
        }
    }
}
