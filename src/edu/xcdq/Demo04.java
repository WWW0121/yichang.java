package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/27 17:47
 */
public class Demo04 {
    public static void main(String[] args) throws SexException {
       try {
           setSex("afaqfae");
       }catch (Exception e){
           System.out.println("上级处理下级抛出的异常");
       }

    }
    public static  void setSex(String sex) throws SexException{  // 声明要抛出异常
        if( !(sex.equals("男") || sex.equals("女"))){
           // System.out.println("发现了异常情况，无法处理，交给上级处理");
            throw new SexException("发现了异常情况，无法处理，交给上级处理");  // 抛出异常 本级函数不处理异常，抛出给调用者
        }
    }
}
