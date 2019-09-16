package AbstrackTest;


import face_to_obj_test.Hero;

public class Main {
    public static void main(String[] args) {
        // 匿名类
        AbstrackHero vn = new AbstrackHero() {
            @Override
            public void attack() {
                System.out.println("新攻击手段");
            }
        };
        vn.attack();

        // 本地类
        class NbHero extends Hero{
            public void attack(){
                System.out.println("牛逼的攻击手法");
            }
        }
        NbHero dlw = new NbHero();
        dlw.attack();

        // test
        AbstrackItem hp = new AbstrackItem() {
            @Override
            public void disposable() {
                this.exist = Boolean.FALSE;
                System.out.println("用掉了鸭");
            }
        };
        hp.disposable();
    }


}
