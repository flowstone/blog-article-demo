package me.xueyao.common;

/**
 * @Description:
 * @Author: Simon.Xue
 * @Date: 2019/2/13 16:14
 */
public enum  ResponseStatus {
    SUCCESS(10000, "成功"),
    BADPARAM(40001, "参数错误"),
    BAD_REQUEST(40000,"请求有误"),
    NO_PERMISSION(40403, "没有接口权限"),
    NOT_FOUND(40404,"您所访问的资源不存在"),
    EXCEPTION(50000, "业务处理失败，请稍后再试");

    int code;
    String msg;

    ResponseStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
