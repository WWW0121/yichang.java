package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/27 17:47
 */
public class SexException extends Exception {
    public SexException(){
    }
    public SexException(String message){
        super(message);
        // System.out.println("自定义的异常处理类，抓到了异常，暂时不处理");
    }
}
