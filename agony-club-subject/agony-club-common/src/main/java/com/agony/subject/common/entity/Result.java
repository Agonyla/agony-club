package com.agony.subject.common.entity;

import com.agony.subject.common.enums.ResultCodeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Agony
 * @create: 2025/10/2 23:56
 * @describe:
 */
@Data
@Accessors(chain = true)
public class Result<T> {

    private Boolean success;
    private Integer code;
    private String message;
    private T data;
    private Long timestamp;

    public Result() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> Result<T> success() {
        return new Result<T>()
                .setSuccess(true)
                .setCode(ResultCodeEnum.SUCCESS.getCode())
                .setMessage(ResultCodeEnum.SUCCESS.getMsg());
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>()
                .setSuccess(true)
                .setCode(ResultCodeEnum.SUCCESS.getCode())
                .setMessage(ResultCodeEnum.SUCCESS.getMsg())
                .setData(data);
    }

    public static <T> Result<T> fail() {
        return new Result<T>()
                .setSuccess(false)
                .setCode(ResultCodeEnum.FAIL.getCode())
                .setMessage(ResultCodeEnum.FAIL.getMsg());
    }

    public static <T> Result<T> fail(T data) {
        return new Result<T>()
                .setSuccess(false)
                .setCode(ResultCodeEnum.FAIL.getCode())
                .setMessage(ResultCodeEnum.FAIL.getMsg())
                .setData(data);
    }
}
