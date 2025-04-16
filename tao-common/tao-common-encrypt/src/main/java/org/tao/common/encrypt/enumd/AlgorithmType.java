package org.tao.common.encrypt.enumd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.tao.common.encrypt.core.encryptor.AbstractEncryptor;
import org.tao.common.encrypt.core.encryptor.AesEncryptor;
import org.tao.common.encrypt.core.encryptor.Base64Encryptor;
import org.tao.common.encrypt.core.encryptor.RsaEncryptor;
import org.tao.common.encrypt.core.encryptor.Sm2Encryptor;
import org.tao.common.encrypt.core.encryptor.Sm4Encryptor;

/**
 * 算法名称
 *
 * @author 老马
 * @version 4.6.0
 */
@Getter
@AllArgsConstructor
public enum AlgorithmType {

    /**
     * 默认走yml配置
     */
    DEFAULT(null),

    /**
     * base64
     */
    BASE64(Base64Encryptor.class),

    /**
     * aes
     */
    AES(AesEncryptor.class),

    /**
     * rsa
     */
    RSA(RsaEncryptor.class),

    /**
     * sm2
     */
    SM2(Sm2Encryptor.class),

    /**
     * sm4
     */
    SM4(Sm4Encryptor.class);

    private final Class<? extends AbstractEncryptor> clazz;
}
