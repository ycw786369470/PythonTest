package inter_test;

public class Main {
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";

        AdHero VN = new AdHero("VN");
        HpPotion hp = new HpPotion();

        garen.use_item(hp);

    }
}
