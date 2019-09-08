package normal_test;

public class Item_basic {
    // 商品名
    String name;
    // 商品价格
    float price;

    public static void main(String[] args){
        // 血瓶
        Item_basic hp_medicine = new Item_basic();
        hp_medicine.name = "血瓶";
        hp_medicine.price = 50;

        // 草鞋
        Item_basic shoes = new Item_basic();
        shoes.name = "草鞋";
        shoes.price = 300;
    }
}
