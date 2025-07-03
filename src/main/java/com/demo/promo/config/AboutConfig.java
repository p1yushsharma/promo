package com.demo.promo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "about")
@Data
public class AboutConfig {
    private String videoUrl;
    private List<Section> sections;

    @Data
    public static class Section {
        private String title;
        private String text;
        private List<String> list;
        private String image;
        private String direction; 
        private List<TeamMember> team;
        private List<String> testimonials;
    }

    @Data
    public static class TeamMember {
        private String name;
        private String title;
        private String image;
    }
}
