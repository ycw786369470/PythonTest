package face_to_obj_test;

public class Main {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.max_hp = 600;
        garen.now_hp = garen.max_hp;

        Hero acee = new Hero();
        acee.name = "寒冰";
        acee.max_hp = 450;
        acee.now_hp = acee.max_hp;

        Hero blacky = new Hero();
        blacky.name = "黑豹";
        blacky.max_hp = 500;
        blacky.now_hp = blacky.max_hp;

        Healer healer = new Healer();
        healer.name = "星妈";

        float[] hps = blacky.attack(garen, acee);
        garen.now_hp = hps[0];
        acee.now_hp = hps[1];
        System.out.println(String.format("盖伦:%f,艾希:%f", garen.now_hp, acee.now_hp));
        garen.now_hp = healer.healing(garen);
        System.out.println(String.format("盖伦:%f,艾希:%f", garen.now_hp, acee.now_hp));
    }
}
