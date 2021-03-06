package com.javaedge.security.exception;

import com.javaedge.security.enums.ResultEnum;
import lombok.Getter;

/**
 * Created on 2017/11/25 0025.
 *
 * @author javaedge
 * @email i@merryyou.cn
 * @since 1.0
 */
@Getter
public class CommonException extends RuntimeException {

    private Integer code;

    public CommonException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public CommonException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }
}
