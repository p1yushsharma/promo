package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "layout")
public class LayoutConfig {
    private String siteTitle;
    private String defaultPageTitle;
    private String mainCss;
    private String productCss;
    private String fontAwesome;
    private String loginJs;
    private String cartJs;
    private String imageLoaderJs;
}
