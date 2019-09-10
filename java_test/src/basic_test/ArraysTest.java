package basic_test;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] ls = {5, 2, 8, 6, 1,7};
        // 排序
        Arrays.sort(ls);    // [1, 2, 5, 6, 7, 8]

        // 转字符串
        String ls_str = Arrays.toString(ls);
        System.out.println(ls_str);

        // 复制
        int[] ls1 = Arrays.copyOfRange(ls, 0, 3);

        // 搜索某元素出现的位置
        int index = Arrays.binarySearch(ls, 8);
        System.out.println("8出现的位置是" + index);

        // 判断是否相同
        System.out.println(Arrays.equals(ls, ls1));

        // 填充整个数组
        Arrays.fill(ls1, 1);
    }
}
