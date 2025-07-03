package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "navbar")
public class NavbarConfig {
    private List<NavLink> links;

    @Data
    public static class NavLink {
        private String name;
        private String url;
    }
}
