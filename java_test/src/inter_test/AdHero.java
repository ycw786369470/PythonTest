package inter_test;


public class AdHero extends Hero implements AdAttack {
    @Override
    public void AdDamage(Hero be_attack) {
        System.out.println(name + "进行了物理攻击");
    }

    public AdHero(String name){
        super(name);
    }
}
