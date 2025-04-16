package org.tao.common.oss.exception;

import java.io.Serial;

/**
 * OSS异常类
 *
 * @author tao
 */
public class OssException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public OssException(String msg) {
        super(msg);
    }

}
