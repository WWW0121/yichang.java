package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/27 16:43
 */
public class Demo01 {
    public static void main(String[] args) {


        int divisor = 100;
        int dividend = 0;
        try {
            System.out.println(divisor / dividend );
        }catch (Exception e){
            // e.printStackTrace();
            System.out.println("除数不能为零");
        }finally {
            //  资源的释放
            System.out.println("必须要执行的步骤，一定会执行");
        }

        System.out.println("呵呵呵呵呵呵");
    }
}