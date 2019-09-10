package basic_test;

// 复制数组
public class CopyTest {
    public static void main(String[] args){
        // 复制列表
//        int[] ls1 =  {1, 2, 3, 4};
////        // 创建一个长度为3的ls2数组来保存
//        int[] ls2 = new int[3];
//        System.arraycopy(ls1, 0, ls2, 0, 3);
//        for(int i: ls2){
//            System.out.println(i);
//        }
        // 合并列表
        int[] ls1 = {1, 2, 3, 4};
        int[] ls2 = {2, 3, 5, 6};
        int[] new_ls = new int[ls1.length+ls2.length];
        System.arraycopy(ls1, 0, new_ls, 0, ls1.length);
        System.arraycopy(ls2, 0, new_ls, ls1.length, ls2.length);
        // 打印新列表
        for(int i: new_ls){
            System.out.println(i);
        }
    }
}
