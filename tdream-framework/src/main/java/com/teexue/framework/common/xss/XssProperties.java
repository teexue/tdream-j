package com.teexue.framework.common.xss;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collections;
import java.util.List;

/**
 * XSS 配置项
 *
 * @author teexue admin@teexue.com
 *
 */
@Data
@ConfigurationProperties(prefix = "teexue.xss")
public class XssProperties {
    /**
     * 是否开启 XSS
     */
    private boolean enabled;
    /**
     * 排除的URL列表
     */
    private List<String> excludeUrls = Collections.emptyList();
}
