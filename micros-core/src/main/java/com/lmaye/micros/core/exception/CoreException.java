package com.lmaye.micros.core.exception;

import com.lmaye.micros.core.context.IResultCode;

/**
 * -- 通用自定义异常
 *
 * @author lmay.Zhou
 * @qq 379839355
 * @email lmay@lmaye.com
 * @since 2020/7/1 7:56 星期三
 */
public class CoreException extends RuntimeException {
    /**
     * 响应编码
     */
    private final IResultCode resultCode;

    public CoreException(IResultCode resultCode) {
        super(resultCode.getPropKey());
        this.resultCode = resultCode;
    }

    public CoreException(IResultCode resultCode, Throwable cause) {
        super(resultCode.getPropKey(), cause);
        this.resultCode = resultCode;
    }

    /**
     * 获取错误信息
     *
     * @return ResultCode
     */
    public IResultCode getResultCode() {
        return resultCode;
    }
}
