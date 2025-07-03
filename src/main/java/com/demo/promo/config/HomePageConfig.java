package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "home")
@Data
public class HomePageConfig {
    private List<String> imageGrid;
    private Categories categories;

    @Data
    public static class Categories {
        private String title;
        private List<CategoryItem> items;
    }

    @Data
    public static class CategoryItem {
        private String label;
        private String image;
        private String count;
    }
}
