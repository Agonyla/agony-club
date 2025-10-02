package com.agony.subject.common.enums;

import lombok.Getter;

/**
 * @author: Agony
 * @create: 2025/10/3 00:01
 * @describe:
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    FAIL(500, "失败");

    private int code;
    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultCodeEnum getByCode(int codeVal) {

        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (resultCodeEnum.getCode() == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
