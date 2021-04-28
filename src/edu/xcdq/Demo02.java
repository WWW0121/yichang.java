package edu.xcdq;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author wangwenbo
 * @data 2021/4/27 16:58
 */
public class Demo02 {
    public static void main(String[] args) {
      /*
        int [] a = new int[2];
       Scanner scanner = new Scanner(System.in);
       try{
       int i = scanner.nextInt();
       int j = scanner.nextInt();
       a[0]=i;
       a[1] = j;
           System.out.println(a[0] +a[1]);
       }catch (IndexOutOfBoundsException e){
           System.out.println("越界异常");
       }catch (InputMismatchException e){
           System.out.println("数据格式不对");
       }catch (ArithmeticException e){
           System.out.println("算数异常");
       }*/
        // 简写
        int [] a = new int[2];
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            a[0]=i;
            a[1] = j;
            System.out.println(a[0] / a[1]);
        }catch (IndexOutOfBoundsException | InputMismatchException | ArithmeticException e){
            System.out.println("其中的一个错误");
        }


    }


}
