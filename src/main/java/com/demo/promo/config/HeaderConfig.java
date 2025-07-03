package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "header")
public class HeaderConfig {
    private TopStrip topStrip;
    private String logoPath;
    private String searchPlaceholder;
    private String loginButtonText;
    private String cartButtonText;

    @Data
    public static class TopStrip {
        private String followText;
        private List<SocialLink> socialLinks;
    }

    @Data
    public static class SocialLink {
        private String name;
        private String iconClass;
        private String url;
    }
}
