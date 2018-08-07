package nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by TAO on 2018/8/6.
 */
public class FibonacciSequence {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("请输入所求的第n项(n<=39)：");
            int n = Integer.parseInt(s.next());
            if (n>39||n<0){
                System.out.println("输入的n非法！");
            }else if (n==0 || n==1){
                System.out.println("第"+n+"项为"+1);
            }else {
                System.out.println("第" + n + "项为" + fibonacci(n));
            }
        }

    }

    public static int fibonacci(int n){
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);//第0项为0
        list.add(1);//第1项为1
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get(n);
    }
}
