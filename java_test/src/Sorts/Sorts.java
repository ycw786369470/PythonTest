package Sorts;
import java.util.Arrays;
public class Sorts {
    // bubble_sort
    public int[] bubble(int[] ls){
        for(int i=0; i<ls.length-1; i++) {
            for (int j=0; j < ls.length - 1 - i; j++) {
                if(ls[j] > ls[j+1]){
                    int tmp = ls[j];
                    ls[j] = ls[j + 1];
                    ls[j + 1] = tmp;
                }
            }
        }
        return ls;
    }
    // insert_sort
    public int[] insert(int[] ls){
        for(int i=1; i<ls.length; i++){
            int j = i-1;
            int key = ls[i];
            while (j>=0 && key<ls[j]){
                ls[j+1] = ls[j];
                j--;
            }
            ls[j + 1] = key;
        }
        return ls;
    }
    // quick_sort
    public void quick(int[] ls, int m, int n){
        int left = m;
        int right = n;
        int base = ls[m];
        if (left>=right){
            return;
        }
        while (left<right){
            while (left<right && ls[right]>base){
                right--;
            }
            if (left>=right){
                ls[right] = base;
            }else {
                ls[left] = ls[right];
            }
            while (left<right && ls[right]<base){
                left++;
            }
            if (left>=right){
                ls[left] = base;
            }else {
                ls[right] = ls[left];
            }
        }
        quick(ls, m, left-1);
        quick(ls, left+1, n);
        System.out.println(ls);
    }
    // select_sort
    public int[] select(int[] ls){
        for(int i=0; i<ls.length-1; i++){
            int max = ls[0];
            int index = 0;
            for(int j=1; j<ls.length-i; j++){
                if (ls[j]>max){
                    max = ls[j];
                    index = j;
                }
            }
            int tmp = ls[ls.length-1-i];
            ls[ls.length-i-1] = max;
            ls[index] = tmp;
        }
        return ls;
    }

    public static void main(String[] args){
        int[] ls = {5, 2, 15, 8, 6, 1, 7, 9, 3};
        Sorts s = new Sorts();
//        int[] new_ls = s.bubble(ls);
//        int[] new_ls = s.insert(ls);
        s.quick(ls, 0, ls.length);
//        int[] new_ls = s.select(ls);
//        System.out.println(Arrays.toString(new_ls));
    }

}
