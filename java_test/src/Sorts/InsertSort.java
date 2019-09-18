package Sorts;
import java.util.Arrays;

// 从大到小
public class InsertSort {
    public void sort1(int[] ls){
        for(int i=1; i<ls.length; i++){
            int key = ls[i];
            int j = i - 1;
            while (j >= 0 && key < ls[j]){
                ls[j + 1] = ls[j];
                j--;
            }
            ls[j+1] = key;
        }
        System.out.println(Arrays.toString(ls));
    }

    public int[] sort2(int[] ls){
        for(int i=1; i<ls.length; i++){
            // 遍历到的值
            int key = ls[i];
            // 有序列表中对比的值的索引
            int j = i - 1;
            while (j >= 0 && key < ls[j]){
                ls[j + 1] = ls[j];
                j--;
            }
            ls[j + 1] = key;
        }
        return ls;
    }



    public static void main(String[] args) {
        int[] ls = {5, 2, 15, 8, 6, 1, 7, 9, 3};
        InsertSort s = new InsertSort();
        int[] ls2 = s.sort2(ls);
        System.out.println(Arrays.toString(ls2));
    }
}
