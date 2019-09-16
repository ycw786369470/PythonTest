package Sorts;
// 冒泡排序
public class BublingSort {
    public int[] sort(int[] ls){
        int len = ls.length;
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(ls[j] > ls[j+1]){
                    int tmp = ls[j+1];
                    ls[j+1] = ls[j];
                    ls[j] = tmp;
                }
            }
        }
        return ls;
    }
    public static void main(String[] args){
        BublingSort b = new BublingSort();
        int[] ls = {5, 4, 10, 13, 9, 15, 1, 7};
        int[] ls2 = b.sort(ls);
        for(int i: ls2){
            System.out.println(i);
        }
    }
}
