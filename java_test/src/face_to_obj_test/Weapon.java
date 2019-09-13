package face_to_obj_test;

public class Weapon extends Item{
    int damage;
    public static void main(String[] args){
        Weapon sword = new Weapon();
        sword.name = "吴京之刃";
        sword.price = 2700;
        sword.damage = 90;
//        sword.buy();
    }
}
