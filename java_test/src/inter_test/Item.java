package inter_test;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }

    public void effect(String name){
        System.out.println(name + "使用了物品产生效果");
    }
}
