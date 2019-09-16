package Sorts;

public class SelectSort {
    public int[] sort(int[] ls){
        // 求出列表长度
        int len = ls.length;
        // 共遍历len - 1遍
        for(int i=0; i<len-1; i++){
            // 找出相对最大的数
            int max = ls[0];
            int index = 0;
            for(int j=0; j<len-i; j++){
                if(ls[j]>max){
                    max = ls[j];
                    index = j;
                }
            }
            // 将最大的数与相对最后的数交换
            int tmp = ls[len-i-1];
            ls[len-i-1] = ls[index];
            ls[index] = tmp;
        }
        return ls;
    }

    public static void main(String[] args) {
        SelectSort s = new SelectSort();
        int[] ls = {5, 4, 10, 13, 9, 15, 1, 7};
        int[] ls2 = s.sort(ls);
        for(int i:ls2){
            System.out.println(i);
        }
    }
}
