package basic_test;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] ls1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int[] i: ls1){
            for(int j: i){
                System.out.println(j);
            }
        }

    }
}
