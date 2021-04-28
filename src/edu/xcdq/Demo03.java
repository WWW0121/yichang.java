package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/27 17:27
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
      /* try {
           setSex("afaqfae");
       }catch (Exception e){
           System.out.println("上级处理下级抛出的异常");
       }*/
        setSex("sfwf");
    }
    public static  void setSex(String sex) throws Exception{  // 声明要抛出异常
        if( !(sex.equals("男") || sex.equals("女"))){
            System.out.println("发现了异常情况，无法处理，交给上级处理");
            throw new Exception("发现了异常情况，无法处理，交给上级处理");  // 抛出异常 本级函数不处理异常，抛出给调用者
        }
    }
}
