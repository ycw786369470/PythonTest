package normal_test;

public class SourTest {
    public static void main(String[] args) {
        int[] ls = {5, 1, 4, 9, 6};
        int len = ls.length;
        int tmp;
        for(int i=0; i<len; i++){
            for(int j=i; j<len-1; j++){
                if(ls[j] > ls[j+1]){
                    tmp = ls[j];
                    ls[j] = ls[j+1];
                    ls[j+1] = tmp;
                }
            }
        }
        // 普通遍历
//        for(int m=0; m<len; m++){
//            System.out.println(ls[m]);
//        }
        // 增强型遍历
        for(int n: ls){
            System.out.println(n);
        }
    }
}
