package me.xueyao.common;

/**
 * @Description:
 * @Author: Simon.Xue
 * @Date: 2019/2/13 16:11
 */
public class BaseResponse {
    private Integer code;
    private String msg;
    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(ResponseStatus status) {
        this.code = status.getCode();
        this.msg = status.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
