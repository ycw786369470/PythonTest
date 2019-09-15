package inter_test;

public class Main {
    public static void main(String[] args){
        Hero garen = new Hero();
        Hero.Battle garen_battle = garen.new Battle();
        garen.name = "盖伦";

        AdHero VN = new AdHero("VN");
        HpPotion hp = new HpPotion();

        garen.use_item(hp);

        System.out.println(garen);
        garen_battle.killed = 8;
        garen_battle.is_legend();
    }
}
