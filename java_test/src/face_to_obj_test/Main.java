package face_to_obj_test;

public class Main {
    public static void main(String[] args) {
        Hero.start();
        Hero garen = new Hero("盖伦");
        garen.damage = 70;
        garen.max_hp = 600;
        garen.now_hp = garen.max_hp;
        garen.armor = 60;
        garen.copy_right = "RIOT";

        Hero acee = new Hero();
        acee.name = "寒冰";
        acee.damage = 75;
        acee.max_hp = 450;
        acee.now_hp = acee.max_hp;
        acee.armor = 45;

        Hero blacky = new Hero();
        blacky.name = "黑豹";
        blacky.damage = 90;
        blacky.max_hp = 500;
        blacky.now_hp = blacky.max_hp;
        blacky.armor = 50;

        Healer healer = new Healer();
        healer.name = "星妈";
        healer.heal = 50;

//        garen.this_test();
        blacky.attack(garen, acee);
//        garen.now_hp = hps[0];
//        acee.now_hp = hps[1];
        System.out.println(String.format("盖伦:%f,艾希:%f", garen.now_hp, acee.now_hp));
        healer.healing(garen);
        System.out.println(String.format("盖伦:%f,艾希:%f", garen.now_hp, acee.now_hp));
    }
}
