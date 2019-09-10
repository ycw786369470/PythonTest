package face_to_obj_test;

// 奶妈
public class Healer extends Hero {
    float heal;

    public float healing(Hero h1){
        h1.now_hp += heal;
        return h1.now_hp;
    }
}
