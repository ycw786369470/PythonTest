package basic_test;
// 导入输入模块scanner
import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数");
//        int a = sc.nextInt();
//        System.out.println("请输入第二个整数");
//        int b= sc.nextInt();
//        System.out.println(a+b);
        System.out.println("请输入字符串");
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
