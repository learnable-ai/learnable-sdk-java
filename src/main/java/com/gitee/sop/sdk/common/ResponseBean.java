package com.gitee.sop.sdk.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Haiguang.Ge
 * @date 2020/12/3 17:02
 */

@Data
public class ResponseBean<T> implements Serializable {

    private static final long serialVersionUID = 3436477890959388499L;

    /**
     * 返回操作码（默认为正常）
     */
    private Integer code = ResultCodeEnum.SUCCESS.code();

    /**
     * 返回数据信息
     */
    private T data;

    /**
     * 返回正确消息信息
     */
    private String msg = "";

//    /**
//     * 返回错误的消息信息
//     */
//    private String error = "";

    public static ResponseBean success = new ResponseBean();
    public static ResponseBean fail = new ResponseBean().code(ResultCodeEnum.FAIL.code());

    // 构造方法
    public static <T> ResponseBean<T> build() {
        return new ResponseBean<T>();
    }

    public static <T> ResponseBean<T> build(T data) {
        return new ResponseBean<T>().data(data);
    }

    // 赋值方法
    public ResponseBean<T> data(T data) {
        this.data = data;
        return this;
    }

    public ResponseBean<T> success(T data) {
        this.data = data;
        return this;
    }

    public ResponseBean<T> code(Integer code) {
        this.code = code;
        this.msg = ResultCodeEnum.getByCode(code);
        return this;
    }

    public ResponseBean<T> error(String error) {
        this.code = ResultCodeEnum.FAIL.code();
        this.msg = error;
        return this;
    }

    public ResponseBean() {
    }

    public ResponseBean(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

}

