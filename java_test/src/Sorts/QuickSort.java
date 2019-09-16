package Sorts;
import java.util.Arrays;


public class QuickSort {
    public void sort(int[] ls, int m, int n){
        // 取左右下标
        int left = m;
        int right = n;
        // 递归出口:当长度为0时不用排序
        if(left >= right){
            return;
        }
        // 定基准值
        int base = ls[m];
        while (left < right){
            // System.out.println("left:"+left+"  right:"+right);
            // 从右往左找比base小的值
            while (left<right && ls[right]>base){
                right--;
            }
            if(left == right){
                // 最后一个坑用基数base补上
                ls[left] = base;
            }else{
                // 拿找到比base大的数填到左边的坑
                ls[left] = ls[right];
            }
            // 从左边往右找比base大的数
            while (left<right && ls[left]<base){
                left++;
            }
            if(left == right){
                ls[left] = base;
            }else{
                ls[right] = ls[left];
            }
        }
        // 左排序and右排序
//        System.out.println(Arrays.toString(ls));
        sort(ls, m, left-1);
        sort(ls, left+1, n);
    }

    public static void main(String[] args) {
        int[] ls = {12, 10, 15, 7, 4, 13, 9, 8, 6};
        QuickSort q = new QuickSort();
        q.sort(ls, 0, ls.length-1);
        System.out.println(Arrays.toString(ls));
    }
}
