package normal_test;

public class ListTest{
    public static void main(String[] args){
        int[] ls1 = new int[5];
        int len = ls1.length;
        // 创建随机数列表
        for(int i=0; i<len; i++){
            ls1[i] = (int) (Math.random()*100);
            System.out.println(ls1[i]);
            int tmp;
            // 在创建时同时使最小值保持在最后
            if (i >= 1 && ls1[i] > ls1[i-1]){
                tmp = ls1[i];
                ls1[i] = ls1[i-1];
                ls1[i-1] = tmp;
            }
        }
        System.out.println(ls1[len-1]);
    }
}
