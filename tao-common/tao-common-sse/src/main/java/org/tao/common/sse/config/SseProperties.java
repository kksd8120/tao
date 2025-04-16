package org.tao.common.sse.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * SSE 配置项
 *
 * @author tao
 */
@Data
@ConfigurationProperties("sse")
public class SseProperties {

    private Boolean enabled;

    /**
     * 路径
     */
    private String path;
}
